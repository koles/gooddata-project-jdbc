package com.gooddata.jdbc.project;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.gooddata.integration.rest.GdcRESTApiWrapper;
import com.gooddata.util.CSVReader;
import com.gooddata.util.CsvConfiguration;

public class ReportResultSet extends SimpleResultSet {
	private final ProjectStatement statement;
	final GdcRESTApiWrapper gdc;
	private final String sql;

	private int rowNumber = 0;
	private CSVReader csv = null;
	private String[] currentRow = null;
	private String[] nextRow = null;
	private Map<String, Integer> headerMap = new HashMap<String, Integer>();
	private List<String> header = new ArrayList<String>();
	private boolean closed = true;
	private ReportResultSetMetaData metadata = null;
	
	/**
	 * Create an empty result set.
	 * @param statement
	 */
	public ReportResultSet(final ProjectStatement statement) {
		super();
		this.gdc = (this.statement = statement).gdc; // evil one-liner ;)
		this.sql = null;
	}
	
	ReportResultSet(final ProjectStatement statement, final String sql) throws SQLException {
		this.gdc = (this.statement = statement).gdc; // evil one-liner ;)
		this.sql= sql;
		try {
			execute();
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}
	
	private void execute() throws IOException, SQLException {
		JSONObject execResult = gdc.executeReport(sql);
		byte[] resultBytes = gdc.exportReportResult(execResult, "csv");
		InputStream is = new ByteArrayInputStream(resultBytes);
		
		// standard CSV without a header line - we need to parse header manually 
		CsvConfiguration cfg = new CsvConfiguration(false, ',', '"', '"');
		this.csv = new CSVReader(new BufferedReader(new InputStreamReader(is)), cfg);
		// Initialize the result set meta data from the header line
		String[] header = csv.readNext();
		if (header != null) {
			for (int i = 0; i < header.length; i++) {
				this.header.add(header[i]);
				headerMap.put(header[i], i);
			}
			closed = false;
			nextRow = csv.readNext();
			this.metadata = new ReportResultSetMetaData(sql, header);
		} else {
			close();
		}
	}

	public boolean next() throws SQLException {
		try {
			if (nextRow == null) {
				return false;
			}
			currentRow = nextRow;
			nextRow = csv.readNext();
			rowNumber++;
			return true;
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}

	public void close() throws SQLException {
		try {
			if (csv != null) {
				csv.close();
			}
			closed = true;
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}

	public boolean wasNull() throws SQLException {
		return false;
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return metadata;
	}

	public Object getObject(int columnIndex) throws SQLException {
		return currentRow[columnIndex - 1];
	}

	public int findColumn(String columnLabel) throws SQLException {
		return headerMap.get(columnLabel);
	}

	public int getRow() throws SQLException {
		return rowNumber;
	}

	public Statement getStatement() throws SQLException {
		return statement;
	}

	public URL getURL(int columnIndex) throws SQLException {
		try {
			return new URL(getString(columnIndex));
		} catch (MalformedURLException e) {
			throw new SQLException(e);
		}
	}

	public URL getURL(String columnLabel) throws SQLException {
		try {
			return new URL(getString(columnLabel));
		} catch (MalformedURLException e) {
			throw new SQLException(e);
		}
	}

	public boolean isClosed() throws SQLException {
		return closed;
	}

	public Object getObject(int columnIndex, Map<String, Class<?>> map)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object getObject(String columnLabel, Map<String, Class<?>> map)
			throws SQLException {
		return getObject(columnLabel);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
