package com.gooddata.jdbc.project;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public abstract class SimpleResultSet implements ResultSet {
	
	/**
	 * Create an empty result set.
	 * @param statement
	 */
	public SimpleResultSet() {
	}
	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	public boolean wasNull() throws SQLException {
		return false;
	}

	public String getString(int columnIndex) throws SQLException {
		return getObject(columnIndex).toString();
	}

	public boolean getBoolean(int columnIndex) throws SQLException {
		return (getObject(columnIndex) != null) && !"".equals(getObject(columnIndex));
	}

	public byte getByte(int columnIndex) throws SQLException {
		return Byte.parseByte(getString(columnIndex));
	}

	public short getShort(int columnIndex) throws SQLException {
		return Short.parseShort(getString(columnIndex));
	}

	public int getInt(int columnIndex) throws SQLException {
		return Integer.parseInt(getString(columnIndex));
	}

	public long getLong(int columnIndex) throws SQLException {
		return Long.parseLong(getString(columnIndex));
	}

	public float getFloat(int columnIndex) throws SQLException {
		return Float.parseFloat(getString(columnIndex));
	}

	public double getDouble(int columnIndex) throws SQLException {
		return Double.parseDouble(getString(columnIndex));
	}

	public BigDecimal getBigDecimal(int columnIndex, int scale)
			throws SQLException {
		return new BigDecimal(getString(columnIndex));
	}

	public byte[] getBytes(int columnIndex) throws SQLException {
		return getString(columnIndex).getBytes();
	}

	public Date getDate(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate");
	}

	public Time getTime(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getTime");
	}

	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getTimestamp");
	}

	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getAsciiStream");
	}

	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getUnicodeStream");
	}

	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getBinaryStream");
	}

	public String getString(String columnLabel) throws SQLException {
		return getObject(columnLabel).toString();
	}

	public boolean getBoolean(String columnLabel) throws SQLException {
		return (getObject(columnLabel) != null) && !"".equals(getObject(columnLabel));
	}

	public byte getByte(String columnLabel) throws SQLException {
		return Byte.parseByte(getString(columnLabel));
	}

	public short getShort(String columnLabel) throws SQLException {
		return Short.parseShort(getString(columnLabel));
	}

	public int getInt(String columnLabel) throws SQLException {
		return Integer.parseInt(getString(columnLabel));
	}

	public long getLong(String columnLabel) throws SQLException {
		return Long.parseLong(getString(columnLabel));
	}

	public float getFloat(String columnLabel) throws SQLException {
		return Float.parseFloat(getString(columnLabel));
	}

	public double getDouble(String columnLabel) throws SQLException {
		return Double.parseDouble(getString(columnLabel));
	}

	public BigDecimal getBigDecimal(String columnLabel, int scale)
			throws SQLException {
		return new BigDecimal(getString(columnLabel));
	}

	public byte[] getBytes(String columnLabel) throws SQLException {
		return getString(columnLabel).getBytes();
	}

	public Date getDate(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Time getTime(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Timestamp getTimestamp(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public InputStream getAsciiStream(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement get*Stream");
	}

	public InputStream getUnicodeStream(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement get*Stream");
	}

	public InputStream getBinaryStream(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement get*Stream");
	}

	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	public void clearWarnings() throws SQLException {
	}

	public String getCursorName() throws SQLException {
		return null;
	}

	public Object getObject(String columnLabel) throws SQLException {
		return getObject(findColumn(columnLabel));
	}

	public Reader getCharacterStream(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement get*Stream");
	}

	public Reader getCharacterStream(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement get*Stream");
	}

	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		return new BigDecimal(getString(columnIndex));
	}

	public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
		return new BigDecimal(getString(columnLabel)); 
	}

	public boolean isBeforeFirst() throws SQLException {
		throw new UnsupportedOperationException("JDBC API says I don't need to supported this");
	}

	public boolean isAfterLast() throws SQLException {
		throw new UnsupportedOperationException("JDBC API says I don't need to supported this");
	}

	public boolean isFirst() throws SQLException {
		throw new UnsupportedOperationException("JDBC API says I don't need to supported this");
	}

	public boolean isLast() throws SQLException {
		throw new UnsupportedOperationException("JDBC API says I don't need to supported this");
	}

	public void beforeFirst() throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public void afterLast() throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public boolean first() throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public boolean last() throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public boolean absolute(int row) throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public boolean relative(int rows) throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public boolean previous() throws SQLException {
		throw new SQLException("Sorry, this is a forward only driver");
	}

	public void setFetchDirection(int direction) throws SQLException {
		if (direction != ResultSet.FETCH_FORWARD) {
			throw new UnsupportedOperationException("Only FETCH_FORWARD is supported");
		}
	}

	public int getFetchDirection() throws SQLException {
		return ResultSet.FETCH_FORWARD;
	}

	public void setFetchSize(int rows) throws SQLException {
	}

	public int getFetchSize() throws SQLException {
		return 0;
	}

	public int getType() throws SQLException {
		return ResultSet.TYPE_FORWARD_ONLY;
	}

	public int getConcurrency() throws SQLException {
		return ResultSet.CONCUR_READ_ONLY;
	}

	public boolean rowUpdated() throws SQLException {
		return false;
	}

	public boolean rowInserted() throws SQLException {
		return false;
	}

	public boolean rowDeleted() throws SQLException {
		return false;
	}

	public void updateNull(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateByte(int columnIndex, byte x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateShort(int columnIndex, short x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateInt(int columnIndex, int x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateLong(int columnIndex, long x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateFloat(int columnIndex, float x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateDouble(int columnIndex, double x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBigDecimal(int columnIndex, BigDecimal x)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateString(int columnIndex, String x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateDate(int columnIndex, Date x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateTime(int columnIndex, Time x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateTimestamp(int columnIndex, Timestamp x)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateAsciiStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBinaryStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateCharacterStream(int columnIndex, Reader x, int length)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateObject(int columnIndex, Object x, int scaleOrLength)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateObject(int columnIndex, Object x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateNull(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBoolean(String columnLabel, boolean x)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateByte(String columnLabel, byte x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateShort(String columnLabel, short x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateInt(String columnLabel, int x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateLong(String columnLabel, long x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateFloat(String columnLabel, float x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateDouble(String columnLabel, double x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBigDecimal(String columnLabel, BigDecimal x)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateString(String columnLabel, String x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBytes(String columnLabel, byte[] x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateDate(String columnLabel, Date x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateTime(String columnLabel, Time x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateTimestamp(String columnLabel, Timestamp x)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateAsciiStream(String columnLabel, InputStream x, int length)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBinaryStream(String columnLabel, InputStream x, int length)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateCharacterStream(String columnLabel, Reader reader,
			int length) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateObject(String columnLabel, Object x, int scaleOrLength)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateObject(String columnLabel, Object x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void insertRow() throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateRow() throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void deleteRow() throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void refreshRow() throws SQLException {
	}

	public void cancelRowUpdates() throws SQLException {
	}

	public void moveToInsertRow() throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void moveToCurrentRow() throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public Ref getRef(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Refs are not supported");
	}

	public Blob getBlob(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public Clob getClob(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public Array getArray(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("Arrays are not supported");
	}

	public Ref getRef(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Refs are not supported");
	}

	public Blob getBlob(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public Clob getClob(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public Array getArray(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("Arrays are not supported");
	}

	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Date getDate(String columnLabel, Calendar cal) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Time getTime(String columnLabel, Calendar cal) throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Timestamp getTimestamp(int columnIndex, Calendar cal)
			throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
	}

	public Timestamp getTimestamp(String columnLabel, Calendar cal)
			throws SQLException {
		throw new UnsupportedOperationException("Sorry, the driver author was too lazy to implement getDate/getTime/getTimestamp");
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

	public void updateRef(int columnIndex, Ref x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateRef(String columnLabel, Ref x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateBlob(String columnLabel, Blob x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateClob(int columnIndex, Clob x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateClob(String columnLabel, Clob x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateArray(int columnIndex, Array x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateArray(String columnLabel, Array x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public RowId getRowId(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("RowId not supported");
	}

	public RowId getRowId(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("RowId not supported");
	}

	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateRowId(String columnLabel, RowId x) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public int getHoldability() throws SQLException {
		return ResultSet.CLOSE_CURSORS_AT_COMMIT;
	}

	public void updateNString(int columnIndex, String nString)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateNString(String columnLabel, String nString)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateNClob(String columnLabel, NClob nClob)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public NClob getNClob(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public NClob getNClob(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("[BC]lobs are not supported");
	}

	public SQLXML getSQLXML(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException("XML fields are not supported");
	}

	public SQLXML getSQLXML(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException("XML fields are not supported");
	}

	public void updateSQLXML(int columnIndex, SQLXML xmlObject)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public void updateSQLXML(String columnLabel, SQLXML xmlObject)
			throws SQLException {
		throw new UnsupportedOperationException("result modification methods are not supported");
	}

	public String getNString(int columnIndex) throws SQLException {
		return getString(columnIndex);
	}

	public String getNString(String columnLabel) throws SQLException {
		return getString(columnLabel);
	}

	public Reader getNCharacterStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Reader getNCharacterStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateNCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNCharacterStream(String columnLabel, Reader reader,
			long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateAsciiStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBinaryStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateAsciiStream(String columnLabel, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBinaryStream(String columnLabel, InputStream x,
			long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateCharacterStream(String columnLabel, Reader reader,
			long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBlob(int columnIndex, InputStream inputStream, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBlob(String columnLabel, InputStream inputStream,
			long length) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateAsciiStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBinaryStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateAsciiStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBinaryStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBlob(int columnIndex, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateBlob(String columnLabel, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void updateNClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub

	}

}
