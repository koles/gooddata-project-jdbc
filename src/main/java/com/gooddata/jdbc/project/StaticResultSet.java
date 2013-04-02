package com.gooddata.jdbc.project;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Map;

public class StaticResultSet extends SimpleResultSet {
	final String[] header;
	final String[][] rows;
	private int rowNumber;

	public StaticResultSet(String[] header, String[][] rows) {
		this.header = header;
		this.rows = rows;
		rowNumber = -1;
	}

	public boolean next() throws SQLException {
		if (rowNumber == rows.length) {
			return false;
		}
		rowNumber++;
		return true;
	}

	public void close() throws SQLException {	
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return new ReportResultSetMetaData("Static", header);
	}

	public Object getObject(int columnIndex) throws SQLException {
		System.out.println(rowNumber + ", " + columnIndex + " ... " + rows.length + "|" + (rows.length > 0 ? rows[0].length : "x"));
		return rows[rowNumber][columnIndex - 1];
	}

	public int findColumn(String columnLabel) throws SQLException {
		return Arrays.binarySearch(header, columnLabel);
	}

	public int getRow() throws SQLException {
		return rowNumber;
	}

	public Statement getStatement() throws SQLException {
		return null;
	}

	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getObject(int columnIndex, Map<String, Class<?>> map)
			throws SQLException {
		return getObject(columnIndex);
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