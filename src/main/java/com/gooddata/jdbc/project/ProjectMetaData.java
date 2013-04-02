package com.gooddata.jdbc.project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;
import java.util.List;

public class ProjectMetaData implements DatabaseMetaData {
	private final ProjectConnection connection;

	ProjectMetaData(ProjectConnection connection) {
		this.connection = connection;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	public boolean allProceduresAreCallable() throws SQLException {
		return false;
	}

	public boolean allTablesAreSelectable() throws SQLException {
		return false;
	}

	public String getURL() throws SQLException {
		return connection.url;
	}

	public String getUserName() throws SQLException {
		return connection.username;
	}

	public boolean isReadOnly() throws SQLException {
		return true;
	}

	public boolean nullsAreSortedHigh() throws SQLException {
		return false;
	}

	public boolean nullsAreSortedLow() throws SQLException {
		return true;
	}

	public boolean nullsAreSortedAtStart() throws SQLException {
		return false;
	}

	public boolean nullsAreSortedAtEnd() throws SQLException {
		return true;
	}

	public String getDatabaseProductName() throws SQLException {
		return "GoodData Project";
	}

	public String getDatabaseProductVersion() throws SQLException {
		return "1.0";
	}

	public String getDriverName() throws SQLException {
		return "GoodData Project JDBC Driver";
	}

	public String getDriverVersion() throws SQLException {
		return "0.1";
	}

	public int getDriverMajorVersion() {
		return 0;
	}

	public int getDriverMinorVersion() {
		return 1;
	}

	public boolean usesLocalFiles() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean usesLocalFilePerTable() throws SQLException {
		return false;
	}

	public boolean supportsMixedCaseIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesUpperCaseIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesLowerCaseIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesMixedCaseIdentifiers() throws SQLException {
		return false;
	}

	public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
		return false;
	}

	public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
		return false;
	}

	public String getIdentifierQuoteString() throws SQLException {
		return " ";
	}

	public String getSQLKeywords() throws SQLException {
		return "";
	}

	public String getNumericFunctions() throws SQLException {
		return "";
	}

	public String getStringFunctions() throws SQLException {
		return "";
	}

	public String getSystemFunctions() throws SQLException {
		return "";
	}

	public String getTimeDateFunctions() throws SQLException {
		return "";
	}

	public String getSearchStringEscape() throws SQLException {
		return "%";
	}

	public String getExtraNameCharacters() throws SQLException {
		return "";
	}

	public boolean supportsAlterTableWithAddColumn() throws SQLException {
		return false;
	}

	public boolean supportsAlterTableWithDropColumn() throws SQLException {
		return false;
	}

	public boolean supportsColumnAliasing() throws SQLException {
		return false;
	}

	public boolean nullPlusNonNullIsNull() throws SQLException {
		return true;
	}

	public boolean supportsConvert() throws SQLException {
		return false;
	}

	public boolean supportsConvert(int fromType, int toType)
			throws SQLException {
		return false;
	}

	public boolean supportsTableCorrelationNames() throws SQLException {
		return false;
	}

	public boolean supportsDifferentTableCorrelationNames() throws SQLException {
		return false;
	}

	public boolean supportsExpressionsInOrderBy() throws SQLException {
		return false;
	}

	public boolean supportsOrderByUnrelated() throws SQLException {
		return false;
	}

	public boolean supportsGroupBy() throws SQLException {
		return false;
	}

	public boolean supportsGroupByUnrelated() throws SQLException {
		return false;
	}

	public boolean supportsGroupByBeyondSelect() throws SQLException {
		return false;
	}

	public boolean supportsLikeEscapeClause() throws SQLException {
		return false;
	}

	public boolean supportsMultipleResultSets() throws SQLException {
		return false;
	}

	public boolean supportsMultipleTransactions() throws SQLException {
		return false;
	}

	public boolean supportsNonNullableColumns() throws SQLException {
		return false;
	}

	public boolean supportsMinimumSQLGrammar() throws SQLException {
		return false;
	}

	public boolean supportsCoreSQLGrammar() throws SQLException {
		return false;
	}

	public boolean supportsExtendedSQLGrammar() throws SQLException {
		return false;
	}

	public boolean supportsANSI92EntryLevelSQL() throws SQLException {
		return false;
	}

	public boolean supportsANSI92IntermediateSQL() throws SQLException {
		return false;
	}

	public boolean supportsANSI92FullSQL() throws SQLException {
		return false;
	}

	public boolean supportsIntegrityEnhancementFacility() throws SQLException {
		return false;
	}

	public boolean supportsOuterJoins() throws SQLException {
		return false;
	}

	public boolean supportsFullOuterJoins() throws SQLException {
		return false;
	}

	public boolean supportsLimitedOuterJoins() throws SQLException {
		return false;
	}

	public String getSchemaTerm() throws SQLException {
		return "project";
	}

	public String getProcedureTerm() throws SQLException {
		return "procedure";
	}

	public String getCatalogTerm() throws SQLException {
		return "catalog";
	}

	public boolean isCatalogAtStart() throws SQLException {
		return false;
	}

	public String getCatalogSeparator() throws SQLException {
		return ",";
	}

	public boolean supportsSchemasInDataManipulation() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSchemasInProcedureCalls() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSchemasInTableDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSchemasInIndexDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCatalogsInDataManipulation() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCatalogsInProcedureCalls() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCatalogsInTableDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsPositionedDelete() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsPositionedUpdate() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSelectForUpdate() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsStoredProcedures() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSubqueriesInComparisons() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSubqueriesInExists() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSubqueriesInIns() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsSubqueriesInQuantifieds() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsCorrelatedSubqueries() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsUnion() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsUnionAll() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMaxBinaryLiteralLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxCharLiteralLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnsInGroupBy() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnsInIndex() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnsInOrderBy() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnsInSelect() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxColumnsInTable() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxConnections() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxCursorNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxIndexLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxSchemaNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxProcedureNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxCatalogNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxRowSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int getMaxStatementLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxStatements() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxTableNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxTablesInSelect() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxUserNameLength() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDefaultTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean supportsTransactions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsTransactionIsolationLevel(int level)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsDataDefinitionAndDataManipulationTransactions()
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsDataManipulationTransactionsOnly()
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet getProcedures(String catalog, String schemaPattern,
			String procedureNamePattern) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getProcedureColumns(String catalog, String schemaPattern,
			String procedureNamePattern, String columnNamePattern)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getTables(String catalog, String schemaPattern,
			String tableNamePattern, String[] types) throws SQLException {
		List<String> datasets = connection.gdc.enumerateDataSets(connection.projectId);
		String[] header = new String[] {
			"TABLE_CAT", // String => table catalog (may be null)
			"TABLE_SCHEM", // String => table schema (may be null)
			"TABLE_NAME", // String => table name
			"TABLE_TYPE", // String => table type. Typical types are "TABLE", "VIEW",	"SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
			"REMARKS", // String => explanatory comment on the table
			"TYPE_CAT", // String => the types catalog (may be null)
			"TYPE_SCHEM", // String => the types schema (may be null)
			"TYPE_NAME", // String => type name (may be null)
			"SELF_REFERENCING_COL_NAME", // String => name of the designated "identifier" column of a typed table (may be null)
			"REF_GENERATION" // String => specifies how values in SELF_REFERENCING_COL_NAME are created. Values are "SYSTEM", "USER", "DERIVED". (may be null)
		};
		String[][] rows = new String[datasets.size()][10];
		for (int i = 0; i < datasets.size(); i++) {
			rows[i] = new String[] { null, null, datasets.get(i), "DATASET", "", null, null, null, null, null }; 
		}
		return new StaticResultSet(header, rows);
	}

	public ResultSet getSchemas() throws SQLException {
		return new StaticResultSet(new String[] { "TABLE_SCHEM" }, new String[][] { new String[] { "Datasets" }});
	}

	public ResultSet getCatalogs() throws SQLException {
		return new StaticResultSet(new String[] { "TABLE_CAT" }, new String[][] { new String[] { "" }});
	}

	public ResultSet getTableTypes() throws SQLException {
		return new StaticResultSet(new String[] { "TABLE_TYPE" }, new String[][] { new String[] { "DATASET" }});
	}

	public ResultSet getColumns(String catalog, String schemaPattern,
			String tableNamePattern, String columnNamePattern)
			throws SQLException {
		String[] header = new String[] {
			"TABLE_CAT", //String => table catalog (may be null)
			"TABLE_SCHEM", //String => table schema (may be null)
			"TABLE_NAME", //String => table name
			"COLUMN_NAME", //String => column name
			"DATA_TYPE", //int => SQL type from java.sql.Types
			"TYPE_NAME", //String => Data source dependent type name, for a UDT the type name is fully qualified
			"COLUMN_SIZE", //int => column size.
			"BUFFER_LENGTH", //is not used.
			"DECIMAL_DIGITS", //int => the number of fractional digits. Null is returned for data types where DECIMAL_DIGITS is not applicable.
			"NUM_PREC_RADIX", //int => Radix (typically either 10 or 2)
			"NULLABLE", //int => is NULL allowed.  columnNoNulls - might not allow NULL values columnNullable - definitely allows NULL values columnNullableUnknown - nullability unknown
			"REMARKS", //String => comment describing column (may be null)
			"COLUMN_DEF", //String => default value for the column, which should be interpreted as a string when the value is enclosed in single quotes (may be null)
			"SQL_DATA_TYPE", //int => unused
			"SQL_DATETIME_SUB", //int => unused
			"CHAR_OCTET_LENGTH", //int => for char types the maximum number of bytes in the column
			"ORDINAL_POSITION", //int	=> index of column in table (starting at 1)
			"IS_NULLABLE", //String => ISO rules are used to determine the nullability for a column.
			"SCOPE_CATLOG", //String => catalog of table that is the scope of a reference attribute (null if DATA_TYPE isn't REF)
			"SCOPE_SCHEMA", //String => schema of table that is the scope of a reference attribute (null if the DATA_TYPE isn't REF)
			"SCOPE_TABLE", //String => table name that this the scope of a reference attribure (null if the DATA_TYPE isn't REF)
			"SOURCE_DATA_TYPE", //short => source type of a distinct type or user-generated Ref type, SQL type from java.sql.Types (null if DATA_TYPE isn't DISTINCT or user-generated REF)
			"IS_AUTOINCREMENT" //String => Indicates whether this column is auto increm
		};
		return new StaticResultSet(header, new String[0][0]);
	}

	public ResultSet getColumnPrivileges(String catalog, String schema,
			String table, String columnNamePattern) throws SQLException {
		String[] header = new String[] {
			"TABLE_CAT", //String => table catalog (may be null)
			"TABLE_SCHEM", //String => table schema (may be null)
			"TABLE_NAME", //String => table name
			"COLUMN_NAME", //String => column name
			"GRANTOR", //String => grantor of access (may be null)
			"GRANTEE", //String => grantee of access
			"PRIVILEGE", //String => name of access (SELECT, INSERT, UPDATE, REFRENCES, ...)
			"IS_GRANTABLE" //String => "YES" if grantee is permitted to grant to others; "NO" if not; null if unknown
		};
		return new StaticResultSet(header, new String[0][0]);
	}

	public ResultSet getTablePrivileges(String catalog, String schemaPattern,
			String tableNamePattern) throws SQLException {
		String[] header = new String[] {
			"TABLE_CAT", //String => table catalog (may be null)
			"TABLE_SCHEM", //String => table schema (may be null)
			"TABLE_NAME", //String => table name
			"GRANTOR", //String => grantor of access (may be null)
			"GRANTEE", //String => grantee of access
			"PRIVILEGE", //String => name of access (SELECT, INSERT, UPDATE, REFRENCES, ...)
			"IS_GRANTABLE" //String => "YES" if grantee is permitted to grant to others; "NO" if not; null if unknown
		};
		return new StaticResultSet(header, new String[0][0]);
	}

	public ResultSet getBestRowIdentifier(String catalog, String schema,
			String table, int scope, boolean nullable) throws SQLException {
		String[] header = new String[] {
			"SCOPE", //short => actual scope of result
			"COLUMN_NAME", //String => column name
			"DATA_TYPE", //int => SQL data type from java.sql.Types
			"TYPE_NAME", //String => Data source dependent type name, for a UDT the type name is fully qualified
			"COLUMN_SIZE", //int => precision
			"BUFFER_LENGTH", //int => not used
			"DECIMAL_DIGITS" //short	 => scale - Null is returned for data types where DECIMAL_DIGITS is not applicable.
		};
		return new StaticResultSet(header, new String[0][0]);
	}

	public ResultSet getVersionColumns(String catalog, String schema,
			String table) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getPrimaryKeys(String catalog, String schema, String table)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getImportedKeys(String catalog, String schema, String table)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getExportedKeys(String catalog, String schema, String table)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getCrossReference(String parentCatalog,
			String parentSchema, String parentTable, String foreignCatalog,
			String foreignSchema, String foreignTable) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getTypeInfo() throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getIndexInfo(String catalog, String schema, String table,
			boolean unique, boolean approximate) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public boolean supportsResultSetType(int type) throws SQLException {
		return false;
	}

	public boolean supportsResultSetConcurrency(int type, int concurrency)
			throws SQLException {
		return false;
	}

	public boolean ownUpdatesAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ownDeletesAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ownInsertsAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean othersUpdatesAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean othersDeletesAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean othersInsertsAreVisible(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatesAreDetected(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletesAreDetected(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertsAreDetected(int type) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsBatchUpdates() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet getUDTs(String catalog, String schemaPattern,
			String typeNamePattern, int[] types) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public Connection getConnection() throws SQLException {
		return connection;
	}

	public boolean supportsSavepoints() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsNamedParameters() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsMultipleOpenResults() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsGetGeneratedKeys() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet getSuperTypes(String catalog, String schemaPattern,
			String typeNamePattern) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getSuperTables(String catalog, String schemaPattern,
			String tableNamePattern) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getAttributes(String catalog, String schemaPattern,
			String typeNamePattern, String attributeNamePattern)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public boolean supportsResultSetHoldability(int holdability)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int getResultSetHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDatabaseMajorVersion() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDatabaseMinorVersion() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getJDBCMajorVersion() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getJDBCMinorVersion() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSQLStateType() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean locatorsUpdateCopy() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsStatementPooling() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public RowIdLifetime getRowIdLifetime() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet getSchemas(String catalog, String schemaPattern)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet getClientInfoProperties() throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getFunctions(String catalog, String schemaPattern,
			String functionNamePattern) throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

	public ResultSet getFunctionColumns(String catalog, String schemaPattern,
			String functionNamePattern, String columnNamePattern)
			throws SQLException {
		return new StaticResultSet(new String[0], new String[0][0]);
	}

}
