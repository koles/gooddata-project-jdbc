package com.gooddata.jdbc.project;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

public class ReportResultSetMetaData implements ResultSetMetaData {
	private String[] columnNames;
	private String tableName;
	
	public ReportResultSetMetaData(String tableName, String []columnNames) {
		this.tableName = tableName;
		this.columnNames = columnNames;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	public int getColumnCount() throws SQLException {
		return columnNames.length;
	}

	public boolean isAutoIncrement(int column) throws SQLException {
		return false;
	}

	public boolean isCaseSensitive(int column) throws SQLException {
		return true;
	}

	public boolean isSearchable(int column) throws SQLException {
		return false;
	}

	public boolean isCurrency(int column) throws SQLException {
		return false;
	}

	public int isNullable(int column) throws SQLException {
		return ResultSetMetaData.columnNullableUnknown;
	}

	public boolean isSigned(int column) throws SQLException {
		return false;
	}

	public int getColumnDisplaySize(int column) throws SQLException {
		return 20;
	}

	public String getColumnLabel(int column) throws SQLException {
		return getColumnName(column);
	}

	public String getColumnName(int column) throws SQLException {
		return columnNames[column - 1];
	}

	public String getSchemaName(int column) throws SQLException {
		return "Unsupported";
	}

	public int getPrecision(int column) throws SQLException {
		return 0;
	}

	public int getScale(int column) throws SQLException {
		return 0;
	}

	public String getTableName(int column) throws SQLException {
		return tableName;
	}

	public String getCatalogName(int column) throws SQLException {
		return "";
	}

	public int getColumnType(int column) throws SQLException {
		return Types.VARCHAR;
	}

	public String getColumnTypeName(int column) throws SQLException {
		return "String";
	}

	public boolean isReadOnly(int column) throws SQLException {
		return true;
	}

	public boolean isWritable(int column) throws SQLException {
		return false;
	}

	public boolean isDefinitelyWritable(int column) throws SQLException {
		return false;
	}

	public String getColumnClassName(int column) throws SQLException {
		return "java.lang.String";
	}

}
