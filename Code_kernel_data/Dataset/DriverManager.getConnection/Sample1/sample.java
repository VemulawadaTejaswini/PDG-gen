//0
public class func{
	public void testDisallowDropOfColumnOnParentTable(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
            conn.createStatement().execute("ALTER TABLE tp DROP COLUMN v1");
}
}
//1
public class func{
	public void testLeadingPKWithTrailingRVC2(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("CREATE TABLE in_test ( user VARCHAR, tenant_id VARCHAR(5) NOT NULL,tenant_type_id VARCHAR(3) NOT NULL,  id INTEGER NOT NULL CONSTRAINT pk PRIMARY KEY (tenant_id, tenant_type_id, id))");
        conn.createStatement().execute("upsert into in_test (tenant_id, tenant_type_id, id, user) values ('a', 'a', 1, 'BonA')");
        conn.createStatement().execute("upsert into in_test (tenant_id, tenant_type_id, id, user) values ('a', 'a', 2, 'BonB')");
}
}
//2
public class func{
	public void testViewAddsPKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
//3
public class func{
	public void testDeleteFromImmutableWithKV(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
            conn.createStatement().execute(indexDDL);
            conn.createStatement().execute("DELETE FROM t");
}
}
//4
public class func{
	public void testChooseIndexFromHint(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx1 ON t(v1) INCLUDE(v2)");
        conn.createStatement().execute("CREATE INDEX idx2 ON t(v1,v2)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT /*+ INDEX(t  idx1) */ k FROM t WHERE v1 = 'foo' AND v2 = 'bar'");
        assertEquals("IDX1", plan.getTableRef().getTable().getTableName().getString());
}
}
//5
public class func{
	public void testViewAddsNotNullPKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
            conn.createStatement().execute(ddl);
}
}
//6
public class func{
	public void testSortOrderForLeadingDescVarLengthColWithNonNullFollowing(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k1 VARCHAR, k2 VARCHAR NOT NULL, CONSTRAINT pk PRIMARY KEY (k1 DESC,k2))");
        conn.createStatement().execute("UPSERT INTO t VALUES ('a','x')");
        conn.createStatement().execute("UPSERT INTO t VALUES ('ab', 'x')");
}
}
//7
public class func{
	public void testIsNullInCompositeKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE T(k1 VARCHAR, k2 VARCHAR, CONSTRAINT pk PRIMARY KEY (k1,k2))");
        conn.createStatement().execute("UPSERT INTO T VALUES (null,'a')");
        conn.createStatement().execute("UPSERT INTO T VALUES ('a','a')");
}
}
//8
public class func{
	public void testIndexPlanSelectionIfBothGlobalAndLocalIndexesHasSameColumnsAndOrder(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null, "('e','i','o')");
        Connection conn1 = DriverManager.getConnection(getUrl());
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('b',1,2,4,'z')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('f',1,2,3,'a')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('j',2,4,3,'a')");
        conn1.createStatement().execute("UPSERT INTO "+TestUtil.DEFAULT_DATA_TABLE_NAME+" values('q',3,1,1,'c')");
}
}
//9
public class func{
	public void testAddColumnsUsingNewConnection(){
        Connection conn1 = DriverManager.getConnection(getUrl(), props);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
}
}
//10
public class func{
	public void testSortOrderForSingleDescVarLengthCol(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY DESC)");
        conn.createStatement().execute("UPSERT INTO t VALUES ('a')");
        conn.createStatement().execute("UPSERT INTO t VALUES ('ab')");
}
}
//11
public class func{
	public void testChooseSmallerTable(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx ON t(v1)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT count(*) FROM t");
        assertEquals("IDX", plan.getTableRef().getTable().getTableName().getString());
}
}
//12
public class func{
	public void testChooseTableForSelection(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx ON t(v1)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT v1,v2 FROM t WHERE v1 = 'bar'");
        assertEquals("T", plan.getTableRef().getTable().getTableName().getString());
}
}
//13
public class func{
	public void testRVCUsingPkColsReturnedByPlanShouldUseIndex(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE T (k VARCHAR NOT NULL PRIMARY KEY, v1 CHAR(15), v2 VARCHAR)");
        conn.createStatement().execute("CREATE INDEX IDX ON T(v1, v2)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery(query);
        assertEquals("IDX", plan.getTableRef().getTable().getTableName().getString());
}
}
//14
public class func{
	public void testViewAddsClashingPKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
//15
public class func{
	public void testChooseIndexFromOrderBy(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx ON t(v1)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT k FROM t WHERE k = 30 ORDER BY v1 LIMIT 5");
        assertEquals("IDX", plan.getTableRef().getTable().getTableName().getString());
}
}
//16
public class func{
	public void testOrderByOptimizedOut(){
        conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("CREATE VIEW v(v2 VARCHAR) AS SELECT * FROM t WHERE k1 = 'a'");
        conn.createStatement().execute("CREATE INDEX i1 ON v(v2) INCLUDE(v1)");
        ResultSet rs = conn.createStatement().executeQuery("EXPLAIN SELECT v1,v2 FROM v WHERE v2 > 'a' ORDER BY v2");
        assertEquals("CLIENT PARALLEL 1-WAY RANGE SCAN OVER _IDX_T ['me',-32768,'a'] - ['me',-32768,*]",
                QueryUtil.getExplainPlan(rs));
}
}
//17
public class func{
	public void testDropVarCols(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.setAutoCommit(false);
            conn.createStatement().execute(ddl);
            conn.createStatement().execute(ddl);
            conn.createStatement().execute(ddl);
}
}
//18
public class func{
	public void makeImmutableAndDeleteData(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES));
            conn.setAutoCommit(true);
            conn.createStatement().execute("DELETE FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME);
            conn.createStatement().execute("ALTER TABLE " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME + " SET IMMUTABLE_ROWS=true");
            conn.createStatement().executeQuery("SELECT COUNT(*) FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME).next();
}
}
//19
public class func{
	public void testOrderByDropped(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE foo (k VARCHAR NOT NULL PRIMARY KEY, v VARCHAR) IMMUTABLE_ROWS=true");
            PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
            QueryPlan plan = stmt.optimizeQuery("SELECT * FROM foo ORDER BY 'a','b','c'");
            assertTrue(plan.getOrderBy().getOrderByExpressions().isEmpty());
            conn.close();
}
}
//20
public class func{
	public void testNullEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM TEST_TABLE WHERE pk = ENCODE(1, NULL)");
        assertFalse(rs.next());
}
}
//21
public class func{
	public void testOrderByOptimizedOut(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE foo (k VARCHAR NOT NULL PRIMARY KEY, v VARCHAR) IMMUTABLE_ROWS=true");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT * FROM foo ORDER BY k");
        assertEquals(OrderBy.FWD_ROW_KEY_ORDER_BY,plan.getOrderBy());
}
}
//22
public class func{
	public void nullInFirstTimezoneParameter(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
//23
public class func{
	public void testCreateViewDefinesPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
//24
public class func{
	public void nullEncoding(){
    Connection conn = DriverManager.getConnection(getUrl());
    conn.createStatement().execute(ddl);
    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM test_table WHERE some_column = DECODE('8', NULL)");
    assertFalse(rs.next());
}
}
//25
public class func{
	public void testSetPropertyAndAddColumnFailsForColumnFamilyNotPresentInAddCol(){
      Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
          conn.createStatement().execute("ALTER TABLE ADDCOLNOTPRESENT ADD col4 integer CF1.REPLICATION_SCOPE=1, XYZ.IN_MEMORY=true ");
}
}
//26
public class func{
	public void testFloatingPointUpsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
//27
public class func{
	public void testColumnDisplaySize(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(
                "CREATE TABLE T (pk1 CHAR(15) not null, pk2 VARCHAR not null,  v1 VARCHAR(15), v2 DATE, v3 VARCHAR " +
                "CONSTRAINT pk PRIMARY KEY (pk1, pk2)) ");
        ResultSet rs = conn.createStatement().executeQuery("SELECT pk1, pk2, v1, v2, NULL FROM T");
        assertEquals(15, rs.getMetaData().getColumnDisplaySize(1));
        assertEquals(PhoenixResultSetMetaData.DEFAULT_DISPLAY_WIDTH, rs.getMetaData().getColumnDisplaySize(2));
        assertEquals(15, rs.getMetaData().getColumnDisplaySize(3));
        assertEquals(conn.unwrap(PhoenixConnection.class).getDatePattern().length(), rs.getMetaData().getColumnDisplaySize(4));
}
}
//28
public class func{
	public void testCastingOnConstantAddInArithmeticEvaluation(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
//29
public class func{
	public void testSystemTableHasDoubleForExponentialNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
//30
public class func{
	public void testInvalidArrayInQuery(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a INTEGER[10], B INTEGER[10])");
            conn.createStatement().execute("SELECT * FROM t ORDER BY a");
}
}
//31
public class func{
	public void testInvalidArrayElemRefInUpsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a INTEGER[10], B INTEGER[10])");
            conn.createStatement().execute("UPSERT INTO t(k,a[2]) VALUES('A', 5)");
}
}
//32
public class func{
	public void initTable(){
            conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
            conn.createStatement().execute(ddl);
}
}
//33
public class func{
	public void testUnsupportedEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
            conn.createStatement().executeQuery("SELECT * FROM TEST_TABLE WHERE pk = ENCODE(1, 'HEX')");
}
}
//34
public class func{
	public void invalidCharacters(){
    Connection conn = DriverManager.getConnection(getUrl());
    conn.createStatement().execute(ddl);
      conn.createStatement().executeQuery("SELECT * FROM test_table WHERE some_column = DECODE('zzxxuuyyzzxxuuyy', 'hex')");
}
}
//35
public class func{
	public void testOrderByNotDroppedCompositeKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE foo (j INTEGER NOT NULL, k BIGINT NOT NULL, v VARCHAR CONSTRAINT pk PRIMARY KEY (j,k)) IMMUTABLE_ROWS=true");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT * FROM foo ORDER BY k,j");
        assertFalse(plan.getOrderBy().getOrderByExpressions().isEmpty());
}
}
//36
public class func{
	public void testInvalidEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
            conn.createStatement().executeQuery(
                "SELECT * FROM test_table WHERE some_column = ENCODE(1, 'invalidEncodingFormat')");
}
}
//37
public class func{
	public void testSelectForceRangeScanForEH(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("create table eh (organization_id char(15) not null,parent_id char(15) not null, created_date date not null, entity_history_id char(15) not null constraint pk primary key (organization_id, parent_id, created_date, entity_history_id))");
        ResultSet rs = conn.createStatement().executeQuery("explain select /*+ RANGE_SCAN */ ORGANIZATION_ID, PARENT_ID, CREATED_DATE, ENTITY_HISTORY_ID from eh where ORGANIZATION_ID='111111111111111' and SUBSTR(PARENT_ID, 1, 3) = 'foo' and TO_DATE ('2012-0-1 00:00:00') <= CREATED_DATE and CREATED_DATE <= TO_DATE ('2012-11-31 00:00:00') order by ORGANIZATION_ID, PARENT_ID, CREATED_DATE DESC, ENTITY_HISTORY_ID limit 100");
        assertEquals("CLIENT PARALLEL 1-WAY RANGE SCAN OVER EH ['111111111111111','foo','2011-12-01 00:00:00.000'] - ['111111111111111','fop','2012-12-01 00:00:00.000']\n" + 
                "    SERVER FILTER BY (CREATED_DATE >= 2011-11-30 AND CREATED_DATE <= 2012-11-30)\n" + 
                "    SERVER TOP 100 ROWS SORTED BY [ORGANIZATION_ID, PARENT_ID, CREATED_DATE DESC, ENTITY_HISTORY_ID]\n" + 
                "CLIENT MERGE SORT",QueryUtil.getExplainPlan(rs));
}
}
//38
public class func{
	public void testAddColsIntoSystemTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().executeUpdate("ALTER TABLE " + PhoenixDatabaseMetaData.SYSTEM_CATALOG +
          " ADD IF NOT EXISTS testNewColumn integer");
          conn.createStatement().executeQuery(query);
}
}
//39
public class func{
	public void testNewerTableDisallowed(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 5));
        Connection conn5 = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
        conn5.createStatement().executeUpdate("ALTER TABLE " + ATABLE_NAME + " DROP COLUMN x_integer");
            conn5.createStatement().executeUpdate("ALTER TABLE " + ATABLE_NAME + " DROP COLUMN y_integer");
}
}
//40
public class func{
	public void testSpecifyingColumnFamilyForHTablePropertyFails(){
        Connection conn1 = DriverManager.getConnection(getUrl(), props);
        conn1.createStatement().execute(ddl);
            conn1.createStatement().execute(ddl);
}
}
//41
public class func{
	public void testLocalIndexRoundTrip(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null, null);
        Connection conn1 = DriverManager.getConnection(getUrl());
        conn1.createStatement().execute("CREATE LOCAL INDEX " + TestUtil.DEFAULT_INDEX_TABLE_NAME + " ON " + TestUtil.DEFAULT_DATA_TABLE_NAME + "(v1)");
        conn1.createStatement().executeQuery("SELECT * FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME).next();
}
}
//42
public class func{
	public void dynamicResults(ResultSet[] rs1,ResultSet[] rs2){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        rs1[0] = c.createStatement().executeQuery("VALUES(1)");
        rs2[0] = c.createStatement().executeQuery("VALUES(2)");
}
}
//43
public class func{
	public void testAddTTLToExistingColumnFamily(){
      Connection conn = DriverManager.getConnection(getUrl(), props);
      conn.setAutoCommit(false);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
//44
public class func{
	public void testArrayUpsertDateWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t9 ( k VARCHAR PRIMARY KEY, a DATE[])");
}
}
//45
public class func{
	public void testArrayUpsertDoubleWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t8 ( k VARCHAR PRIMARY KEY, a DOUBLE[])");
}
}
//46
public class func{
	public void testArrayUpsertFloatWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t4 ( k VARCHAR PRIMARY KEY, a FLOAT[])");
}
}
//47
public class func{
	public void testDuplicatePKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
//48
public class func{
	public void testStartKeyStopKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE start_stop_test (pk char(2) not null primary key)");
}
}
//49
public class func{
	public void testArrayUpsertTimeStampWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t13 ( k VARCHAR PRIMARY KEY, a TIMESTAMP[])");
}
}
//50
public class func{
	public void opened(){
            conn = DriverManager.getConnection(databaseUrl, getUser(), getPassword());
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS TEST2(ID INT)");
}
}
//51
public class func{
	public void testInvalidNullCompositePrimaryKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k1 varchar, k2 varchar, constraint pk primary key(k1,k2))");
}
}
//52
public class func{
	public void testKeyValueColumnInPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
//53
public class func{
	public void testInvalidNegativeArrayIndex(){
      Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(query);
}
}
//54
public class func{
	public void testRetrieve(){
      Connection conn = DriverManager.getConnection(getUrl());
      conn.createStatement().execute(ddl);
}
}
//55
public class func{
	public void getTableTester(String normalizedName,String sqlStatementName){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE " + sqlStatementName + " (k VARCHAR PRIMARY KEY)");
}
}
//56
public class func{
	public void testDecodeValues(boolean nullFixedWidth,boolean nullVariableWidth){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(
                "CREATE TABLE T(pk1 CHAR(15) not null, pk2 VARCHAR not null, CF1.v1 DATE, CF2.v2 VARCHAR, CF2.v1 VARCHAR " +
                "CONSTRAINT pk PRIMARY KEY (pk1, pk2)) ");
}
}
//57
public class func{
	public void testArrayUpsertTimeWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t11 ( k VARCHAR PRIMARY KEY, a TIME[])");
}
}
//58
public class func{
	public void testArrayUpsertDateWithNulls2(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t10 ( k VARCHAR PRIMARY KEY, a DATE[])");
}
}
//59
public class func{
	public void createIndex(String indexName,String tableName,String columns){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//60
public class func{
	public void testUpperCaseEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//61
public class func{
	public void initTable(){
            conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
//62
public class func{
	public void testOverallQueryMetricsForSelect(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//63
public class func{
	public void init(){
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:db1",
                    "sa", "");
            conn.createStatement().execute(
                    "RUNSCRIPT FROM 'classpath:/world.sql'");
}
}
//64
public class func{
	public void doBeforeTestSetup(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
}
}
//65
public class func{
	public void testUnknownColumnInPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
//66
public class func{
	public void testStartKeyStopKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE start_stop_test (pk char(2) not null primary key)");
}
}
//67
public class func{
	public void testDeletionOfParentTableFailsOnTenantSpecificConnection(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("DROP TABLE TEMP_PARENT");
}
}
//68
public class func{
	public void testVarbinaryArrayNotSupported(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a VARBINARY[10])");
}
}
//69
public class func{
	public void testAlterMultiTenantWithViewsToGlobal(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().execute("alter table " + PARENT_TABLE_NAME + " set MULTI_TENANT=false");
}
}
//70
public class func{
	public void testNotNullConstraintForWithSinglePKCol(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().execute(ddl);    
}
}
//71
public class func{
	public void createBaseTable(String tableName,Integer saltBuckets){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//72
public class func{
	public void testLocalIndexCreationWithDefaultFamilyOption(){
        Connection conn1 = DriverManager.getConnection(getUrl());
            Statement statement = conn1.createStatement();
            statement.execute("upsert into example values(2,'fn1','ln1')");
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM my_idx");
            assertTrue(rs.next());
            conn1.close();
}
}
//73
public class func{
	public void testStartKeyStopKey(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("CREATE TABLE start_stop_test (pk char(2) not null primary key) SPLIT ON ('EA','EZ')");
}
}
//74
public class func{
	public void createBaseTable(String tableName,Integer saltBuckets,String splits){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//75
public class func{
	public void testArrayUpsertCharWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t15 ( k VARCHAR PRIMARY KEY, a CHAR(15)[])");
}
}
//76
public class func{
	public void createPhoenixTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
}
}
//77
public class func{
	public void testDuplicateKVColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
//78
public class func{
	public void testArrayUpsertTimeStampWithNulls2(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t14 ( k VARCHAR PRIMARY KEY, a TIMESTAMP[])");
}
}
//79
public class func{
	public void testSingleBinaryPaddedKeyExpression(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES));
        conn.createStatement().execute("create table bintable (k BINARY(15) PRIMARY KEY)");
}
}
//80
public class func{
	public void closingDatabase(){
            conn = DriverManager.getConnection(databaseUrl, getUser(), getPassword());
            conn.createStatement().execute("DROP TABLE TEST2");
}
}
//81
public class func{
	public void testSetStoreNullsDefaultViaConfig(){
        Connection storeNullsConn = DriverManager.getConnection(getUrl(), props);
        Statement stmt = storeNullsConn.createStatement();
        stmt.execute("CREATE TABLE with_nulls_default (" +
                "id smallint primary key," +
                "name varchar)");
        ResultSet rs = stmt.executeQuery("SELECT store_nulls FROM SYSTEM.CATALOG " +
                "WHERE table_name = 'WITH_NULLS_DEFAULT' AND store_nulls is not null");
        assertTrue(rs.next());
        assertTrue(rs.getBoolean(1));
}
}
//82
public class func{
	public void testMultiCFProjection(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
//83
public class func{
	public void initTable(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().execute(indexDDL);
}
}
//84
public class func{
	public void testOrderByOptimizedOut(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t(t_id VARCHAR NOT NULL, k1 VARCHAR, k2 VARCHAR, v1 VARCHAR," +
            " CONSTRAINT pk PRIMARY KEY(t_id, k1, k2)) multi_tenant=true");
}
}
//85
public class func{
	public void createTableAndInsertRows(String tableName,int numRows,boolean salted,boolean addTableNameToKey){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        PreparedStatement stmt = conn.prepareStatement(dml);
}
}
//86
public class func{
	public void testArrayUpsertIntWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t1 ( k VARCHAR PRIMARY KEY, a INTEGER[])");
}
}
//87
public class func{
	public void testSameColumnNameInPKAndNonPK(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(query);
}
}
//88
public class func{
	public void getConnection(String jdbcURL,String user,String pwd){
    Connection conn = DriverManager.getConnection(jdbcURL, user, pwd);
    conn.createStatement().execute("set hive.support.concurrency = false");
}
}
//89
public class func{
	public void testBaseTableCannotBeUsedInStatementsInMultitenantConnections(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_TENANT_SPECIFIC_URL);
                conn.createStatement().execute("select * from " + PARENT_TABLE_NAME);
}
}
//90
public class func{
	public void testBlackListedUdfUsage(){
    Connection hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user1", "bar");
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("create table " + tableName1 + "(i int) ");
    verifyUDFNotAllowed(stmt, tableName1, "sqrt(1)", "sqrt");
    stmt.execute("SELECT reflect('java.lang.String', 'valueOf', 1) from " + tableName1);
    stmt.close();
}
}
//91
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_PRE_STMT_TEST (ID INTEGER GENERATED BY DEFAULT AS IDENTITY, NAME VARCHAR(50), BIRTHDATE TIMESTAMP)");
        stmt.close();
}
}
//92
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T (FID INT, FNAME VARCHAR2(4000), FDESC CLOB)");
        stmt.close();
}
}
//93
public class func{
	public void setSchema(String schemaName){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
        s.execute("SET SCHEMA " + schemaName);
        s.close();
}
}
//94
public class func{
	public void createDb(){
    Connection conn = DriverManager.
        getConnection(miniHS2.getJdbcURL(), System.getProperty("user.name"), "bar");
    Statement stmt2 = conn.createStatement();
    stmt2.execute("CREATE DATABASE " + dbName);
    stmt2.close();
}
}
//95
public class func{
	public void setIsolationSQL(String sqlName){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
        s.execute("SET ISOLATION " + sqlName);
        s.close();
}
}
//96
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_BLOB (ID INTEGER, DATA BLOB)");
        stmt.close();
}
}
//97
public class func{
	public void dropTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("DROP PROCEDURE BASIC_CALL_0");
        stmt.close();
}
}
//98
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_PRE_STMT_TEST (ID SMALLINT, NAME VARCHAR(50), BIRTHDATE TIMESTAMP)");
        stmt.close();
}
}
//99
public class func{
	public void clear(){
      String url = "jdbc:mysql://" + address.split(":")[0] + ":50001/nn_state";
      Connection client = DriverManager.getConnection(url, "root", "root");
      Statement statement = client.createStatement();
      statement.execute(sql);
      statement.close();
}
}
//100
public class func{
	public void setUp(){
        Connection conn = DriverManager.getConnection(url, "sa", "");
          Statement stmt = conn.createStatement();
              stmt.execute("create table test (id int)");
              stmt.close();
}
}
//101
public class func{
	public void createTable(){
        final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        final Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE " + TABLE + "(ID INTEGER)");
        statement.close();
}
}
//102
public class func{
	public void createScript(){
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stat = conn.createStatement();
        stat.execute("SCRIPT TO 'script.sql'");
        stat.close();
}
}
//103
public class func{
	public void executeScript(String dataSourceName,String query){
    Connection connection = DriverManager.getConnection(dataSourceName, USER, PASSWORD);
    Statement stmt = connection.createStatement();
    stmt.execute(query);
    stmt.close();
}
}
//104
public class func{
	public void dropTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE T_PRE_STMT_TEST");
        stmt.close();
}
}
//105
public class func{
	public void testEncryption(){
        conn.close();
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
        stat.execute("drop table test");
}
}
//106
public class func{
	public void testConnectRepeatedly(){
        con.close();
        con = DriverManager.getConnection(url);
        st = con.createStatement();
        JDBC.assertSingleValueResultSet(st.executeQuery("values 1"), "1");
        st.close();
}
}
//107
public class func{
	public void main(String args[]){
        Connection c = DriverManager.getConnection("jdbc:mysql://" + hostname + ":" + port + "/mysql", username, password);
        Statement statement = c.createStatement();
        statement.executeUpdate("create database if not exists employees");
        statement.close();
}
}
//108
public class func{
	public void setup(){
      Connection con = DriverManager.getConnection(StatefulUniqueCountTest.INMEM_DB_URL, new Properties());
      Statement stmt = con.createStatement();
      stmt.execute("CREATE TABLE IF NOT EXISTS " + StatefulUniqueCountTest.TABLE_NAME + " (col1 INTEGER, col2 INTEGER, col3 BIGINT)");
}
}
//109
public class func{
	public void setup(){
    Connection con = DriverManager.getConnection(INMEM_DB_URL, new Properties());
    Statement stmt = con.createStatement();
    stmt.execute("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (col1 INTEGER, col2 INTEGER, col3 BIGINT)");
}
}
//110
public class func{
	public void MyMethodWithNoInsert(){
            DriverManager.getConnection("jdbc:default:connection");
        Statement s = conn.createStatement();
        s.executeQuery("select * from t11_AutoGen");
        s.close();
}
}
//111
public class func{
	public void testStartKeyStopKey(){
        conn = DriverManager.getConnection(getUrl(), props);
        Statement statement = conn.createStatement();
        statement.execute(query);
        PhoenixStatement pstatement = statement.unwrap(PhoenixStatement.class);
        List<KeyRange>splits = pstatement.getQueryPlan().getSplits();
        assertTrue(splits.size() > 0);
}
}
//112
public class func{
	public void execSQL(String sql){
        Connection conn = DriverManager.getConnection(url, "sa", "");
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
        st.close();
}
}
//113
public class func{
	public void getConnectionH2(){
        final Connection connection = DriverManager.getConnection("jdbc:h2:mem:Log4j", "sa", "");
        final Statement statement = connection.createStatement();
        statement
                .executeUpdate("CREATE TABLE jpaBasicLogEntry ( "
                        + "id INTEGER IDENTITY, timemillis BIGINT, level NVARCHAR(10), loggerName NVARCHAR(255), "
                        + "message NVARCHAR(1024), thrown NVARCHAR(1048576), contextMapJson NVARCHAR(1048576),"
                        + "loggerFQCN NVARCHAR(1024), contextStack NVARCHAR(1048576), marker NVARCHAR(255), source NVARCHAR(2048),"
                        + "threadName NVARCHAR(255)" + " )");
        statement.close();
}
}
//114
public class func{
	public void executeSql(String sql){
            DriverManager.getConnection(
                "jdbc:default:connection");
        Statement stmt = conn.createStatement();
        if (stmt.execute(sql)) {
            ResultSet rs = stmt.getResultSet();
            rs.next();
            return rs.getString(1);
        } else {
            return Integer.toString(stmt.getUpdateCount());
        }
}
}
//115
public class func{
	public void testDivideByZeroExpressionIndex(){
        Connection conn = DriverManager.getConnection(getUrl());
            stmt = conn.createStatement();
            stmt.execute("CREATE INDEX i ON t (k1/0)");
}
}
//116
public class func{
	public void tearDown(){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:race", "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}
//117
public class func{
	public void proc_5280(){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
            s.execute("drop table this_table_does_not_exist");
}
}
//118
public class func{
	public void doGet(HttpServletRequest req,HttpServletResponse resp){
            con = DriverManager.getConnection(MicroTestCase.CONNECTION_STRING);
            Statement stmt = con.createStatement();
            stmt.execute("select * from Users where name=" + name);     /* BAD */
}
}
//119
public class func{
	public void createDB(){
        Connection conn = DriverManager.getConnection(getLocalJdbcUri(), "sa", "");
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO TT (I, S) VALUES (3, 'a')");
        st.close();
}
}
//120
public class func{
	public void getConnectionHSQLDB(){
        final Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:Log4j", "sa", "");
        final Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE jpaBasicLogEntry ( "
                + "id INTEGER IDENTITY, timemillis BIGINT, level VARCHAR(10), loggerName VARCHAR(255), "
                + "message VARCHAR(1024), thrown VARCHAR(1048576), contextMapJson VARCHAR(1048576),"
                + "loggerFQCN VARCHAR(1024), contextStack VARCHAR(1048576), marker VARCHAR(255), source VARCHAR(2048),"
                + "threadName VARCHAR(255)" + " )");
        statement.close();
}
}
//121
public class func{
	public void addMe(int p1){
            DriverManager.getConnection("jdbc:default:connection");
        Statement s = conn.createStatement();
        s.executeQuery("select * from t11_AutoGen");
        s.close();
}
}
//122
public class func{
	public void testConnectRepeatedly(){
        Connection con = DriverManager.getConnection(url);
        Statement st = con.createStatement();
        JDBC.assertSingleValueResultSet(st.executeQuery("values 1"), "1");
        st.close();
}
}
//123
public class func{
	public void spTestBuiltins(){
        c = DriverManager.getConnection("jdbc:default:connection");
        Statement cStmt = c.createStatement();
        ResultSet rs = cStmt.executeQuery(
            "values (user, current_user, current schema, " +
            "        session_user, current_role)");
        JDBC.assertFullResultSet(
            rs,
            new String[][]{{"TEST_DBO", "TEST_DBO", "TEST_DBO", "PHB", null}});
        cStmt.close();
}
}
//124
public class func{
	public void destroyDatabase(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + database, "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}
//125
public class func{
	public void testEncryption(){
        String url = getURL(dbName + ";CIPHER=AES", true);
        conn = DriverManager.getConnection(url, user, password);
        stat = conn.createStatement();
        stat.execute("create table test(id int primary key)");
}
}
//126
public class func{
	public void processRunscript(String url,String user,String password,String fileName,String options){
            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();
            stat.execute(sql);
            JdbcUtils.closeSilently(conn);
}
}
//127
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_CLOB (ID INTEGER, DATA CLOB)");
}
}
//128
public class func{
	public void doConnStmtNoRS(String text){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement stmt = conn.createStatement();
    stmt.execute(text);
}
}
//129
public class func{
	public void createDDL(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_BASIC_TYPE (F1 FLOAT, F2 DOUBLE, F3 REAL, F4 DATE, F5 TIME, F6 SMALLINT, F7 SMALLINT, F8 INTEGER, F9 BIGINT, F10 DECIMAL(9,2), F11 TIMESTAMP, F12 BLOB, F13 VARCHAR(256), F14 VARCHAR(256), F15 VARCHAR(256), F16 VARCHAR(256), F17 SMALLINT)");
}
}
//130
public class func{
	public void openConnection(){
        Connection conn = DriverManager.getConnection(URL, "sa", "sa");
        Statement stat = conn.createStatement();
            stat.execute("CREATE INDEX IDX_TEST_D ON TEST(D)");
}
}
//131
public class func{
	public void testInit(){
        deleteDb("databaseEventListener");
        String url = getURL("databaseEventListener", true);
        url += ";DATABASE_EVENT_LISTENER='" + Init.class.getName() + "'";
        Connection conn = DriverManager.getConnection(url, "sa", "sa");
        Statement stat = conn.createStatement();
        stat.execute("select * from test");
}
}
//132
public class func{
	public void createAsSelect(String url,boolean optimize){
        Connection conn = DriverManager.getConnection(url +
                ";OPTIMIZE_INSERT_FROM_SELECT=" + optimize);
        Statement stat = conn.createStatement();
        stat.execute("DROP TABLE IF EXISTS TEST2");
}
}
//133
public class func{
	public void insert(String sql){
      conn = DriverManager.getConnection(url);
      stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      stmt.close();
}
}
//134
public class func{
	public void createConnection(){
    Connection connection = DriverManager.getConnection(miniHS2.getJdbcURL(dbName),
      System.getProperty("user.name"), "bar");
    Statement statement = connection.createStatement();
    localConnection.set(connection);
    localStatement.set(statement);
    statement.execute("USE " + dbName);
}
}
//135
public class func{
	public void main(String args[]){
            Connection conn = DriverManager.getConnection("jdbc:derby:hibernateDB;create=true", new Properties());
            Statement st = conn.createStatement();
            st.executeUpdate("create table EMPLOYEE( id         INT         PRIMARY KEY NOT NULL, " +
                                                    "first_name VARCHAR(20) default NULL," +
                                                    "last_name  VARCHAR(20) default NULL," +
                                                    "salary     INT         default NULL)");
}
}
//136
public class func{
	public void accessDataBase(){
      Connection con = DriverManager
          .getConnection("jdbc:sqlite:stodoitem");
      Statement stat = con.createStatement();
      ResultSet rs = stat.executeQuery(sql);
      parse(rs);
      con.close();
}
}
//137
public class func{
	public void calledNestedFk(){
            DriverManager.getConnection("jdbc:default:connection");
        final Statement cStmt = c.createStatement();
        cStmt.executeUpdate("insert into t select i*2, j*2 from t");
}
}
//138
public class func{
	public void runLiquibase(){
        Connection conn = DriverManager
                .getConnection(MYSQL_TEST_DB_URL, "root", "root");
        Statement statement = conn.createStatement();
        statement.executeUpdate("use zanata_unit_test");
}
}
//139
public class func{
	public void updateParameterizedTestType1(String name){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ps1.executeUpdate("UPDATE PLANET SET NAME='" + name + "' WHERE POSITION=4");
}
}
//140
public class func{
	public void updateTestType1(){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            Statement ps1 = conn.createStatement();
            ps1.executeUpdate("UPDATE PLANET SET NAME='Mercury' WHERE POSITION=4");
}
}
//141
public class func{
	public void createDb(){
        Connection connection = DriverManager.getConnection(url);
        Statement s = connection.createStatement();
        s.executeUpdate("create table ProcessProperties ( \"property\" varchar(256), \"value\" varchar(256))");
}
}
//142
public class func{
	public void executeSql(String sql){
            DriverManager.getConnection(
                "jdbc:default:connection");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
}
}
//143
public class func{
	public void teardown(){
      Connection con = DriverManager.getConnection(CASSANDRA_DB_URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(dropKeyspace);
}
}
//144
public class func{
	public void testBasicUpsertSelect(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_TENANT_SPECIFIC_URL);
            conn.setAutoCommit(false);
            conn.createStatement().executeUpdate("upsert into " + TENANT_TABLE_NAME + " (id, tenant_col) values (1, 'Cheap Sunglasses')");
            conn.createStatement().executeUpdate("upsert into " + TENANT_TABLE_NAME + " (id, tenant_col) values (2, 'Viva Las Vegas')");
}
}
//145
public class func{
	public void setLabel(String labelName){
            DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("alter session set \"label\" = " + labelName);
}
}
//146
public class func{
	public void cleanTable(){
      Connection con = DriverManager.getConnection(URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(cleanTable);
}
}
//147
public class func{
	public void calledNested(final boolean isCheckConstraint){
            DriverManager.getConnection("jdbc:default:connection");
        final Statement cStmt = c.createStatement();
        cStmt.executeUpdate("set constraints c deferred");
}
}
//148
public class func{
	public void setup(){
      Connection con = DriverManager.getConnection(URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(createTable);
}
}
//149
public class func{
	public void cleanTable(){
      Connection con = DriverManager.getConnection(URL);
      Statement stmt = con.createStatement();
      stmt.executeUpdate(cleanTable);
}
}
//150
public class func{
	public void getConnection(){
            DriverManager.getConnection("jdbc:sqlite:pushbot.db");
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS config (member text, config text, PRIMARY KEY (member)); ");
}
}
//151
public class func{
	public void BIG_COL_491(int i,ResultSet[] rs1,ResultSet[] rs2){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement st1 = conn.createStatement();
    rs1[0] = st1.executeQuery(
      "select int1, varchar32k from jira491 where int1 < " + i + " order by 1");
}
}
//152
public class func{
	public void getResultSetWithHoldability(int holdability,ResultSet[] rs){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                                        ResultSet.CONCUR_READ_ONLY,
                                        holdability);
        rs[0] = s.executeQuery("values (1), (2), (3)");
}
}
//153
public class func{
	public void selectFootSoldiers(){
        c = DriverManager.getConnection("jdbc:default:connection");
        Statement cStmt = c.createStatement();
        ResultSet rs = cStmt.executeQuery(
            "select * from s1.wages where category = " +
            FOOTSOLDIER);
}
}
//154
public class func{
	public void selectRows(String table,ResultSet[] rs){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = conn.createStatement();
        rs[0] = stmt.executeQuery("SELECT * FROM " + table);
}
}
//155
public class func{
	public void executeRead(String db,String query){
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"root", "");
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
}
}
//156
public class func{
	public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2://xd-hive.xdata.data-tactics-corp.com:10000/default", "", "");
    Statement stmt = con.createStatement();
    ResultSet res = stmt.executeQuery(sql);
}
}
//157
public class func{
	public void showSuppliers(ResultSet[] rs){
        Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = con.createStatement();
        rs[0] = stmt.executeQuery(query);
}
}
//158
public class func{
	public void getData(String dataDir,String query){
                  "DBQ=" + new File(dataDir, "Customers.mdb") + ";UID=Admin";
    Connection connection = DriverManager.getConnection(connectionString);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return statement.executeQuery(query);
}
}
//159
public class func{
	public void getTotalSavedBlocks(ZoneVolume volume,String zoneName){
    File databaseFile = new File(War.war.getDataFolder(), String.format("/dat/warzone-%s/volume-%s.sl3", zoneName, volume.getName()));
    Connection databaseConnection = DriverManager.getConnection("jdbc:sqlite:" + databaseFile.getPath());
    Statement stmt = databaseConnection.createStatement();
    ResultSet sizeQuery = stmt.executeQuery("SELECT COUNT(*) AS total FROM blocks");
    int size = sizeQuery.getInt("total");
    sizeQuery.close();
}
}
//160
public class func{
	public void deleteFromATable(){
    Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT c1 from new org.apache.derby.catalog.TriggerOldTransitionRows() AS EQ");
}
}
//161
public class func{
	public void selectRows(String table,ResultSet[] rs){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement stmt = conn.createStatement();
    rs[0] = stmt.executeQuery("SELECT * FROM " + table);
}
}
//162
public class func{
	public void learn(String sqlQuery,String dbConnectString){
        Connection conn = DriverManager.getConnection(dbConnectString);
        Statement stmt = conn.createStatement(); 
        ResultSet rs = stmt.executeQuery(sqlQuery); 
    learn(rs);
}
}
//163
public class func{
	public void f_testExecuteQueryWithNoDynamicResultSets(){
        Connection connect = DriverManager.getConnection(create_url);
        Statement stmt = connect.createStatement();
            stmt.executeQuery("CALL RETRIEVE_DYNAMIC_RESULTS(0)");
}
}
//164
public class func{
	public void sqlControl2(String[] e1,String[] e2,String[] e3,String[] e4,String[] e5,String[] e6,String[] e7){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    executeStatement(s, "DROP SCHEMA SQLC_M RESTRICT", e7);
    conn.close();
}
}
//165
public class func{
	public void sqlControl3(String[] e1,String[] e2,String[] e3,String[] e4,String[] e5,String[] e6,String[] e7){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    executeStatement(s, "VALUES 1", e7);
    conn.close();
}
}
//166
public class func{
	public void sqlControl(String[] e1,String[] e2,String[] e3,String[] e4,String[] e5,String[] e6,String[] e7){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement s = conn.createStatement();
    executeStatement(s, "DROP TABLE SQLC.SQLCONTROL_DML", e7);
    conn.close();
}
}
//167
public class func{
	public void getConnectionProc(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                Statement s = conn.createStatement();
                conn.close();
}
}
//168
public class func{
	public void runJdbc(){
    final Connection connection = DriverManager.getConnection(
        "jdbc:calcite:model=core/src/test/resources/mysql-foodmart-lattice-model.json");
    final ResultSet resultSet = connection.createStatement()
        .executeQuery("select * from \"adhoc\".\"m{27, 31}\"");
    System.out.println(CalciteAssert.toString(resultSet));
    connection.close();
}
}
//169
public class func{
	public void testDisallowDropParentTableWithExistingTenantTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().executeUpdate("drop table " + PARENT_TABLE_NAME);
}
}
//170
public class func{
	public void testDropSystemTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
                conn.createStatement().executeUpdate(
                        "DROP TABLE " + PhoenixDatabaseMetaData.SYSTEM_CATALOG);
}
}
//171
public class func{
	public void retrieveClosedResult(ResultSet[] closed){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        closed[0] = c.createStatement().executeQuery("VALUES(1)");
        closed[0].close();
}
}
//172
public class func{
	public void retrieveClosedResult(ResultSet[] closed){
        Connection connect = DriverManager.getConnection(create_url);
        closed[0] = connect.createStatement().executeQuery("VALUES(1)");
        closed[0].close();
}
}
//173
public class func{
	public void testDropPKColumn(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 5));
        Connection conn1 = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            conn1.createStatement().executeUpdate("ALTER TABLE " + ATABLE_NAME + " DROP COLUMN entity_id");
}
}
//174
public class func{
	public void tableIsEmpty(String table){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
}
}
//175
public class func{
	public void DERBY_3304(ResultSet[] rs1){
            DriverManager.getConnection("jdbc:default:connection");
        Statement stm = conn.createStatement();
        conn.commit();
}
}
//176
public class func{
	public void tearDownDatabase(String url){
        Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
}
}
//177
public class func{
	public void tearDown(){
         DriverManager.registerDriver( new org.h2.Driver() );
         Connection connection = DriverManager.getConnection( url , user , passwd );
         connection.createStatement( ).execute( "DROP TABLE IF EXISTS " + streamName );
}
}
//178
public class func{
	public void init(){
        Connection conn = DriverManager
        .getConnection("jdbc:default:connection");
        Statement s = conn.createStatement();
}
}
//179
public class func{
	public void tstInterruptLongQuery(){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
}
}
//180
public class func{
	public void testLinkOtherSchema(){
        Connection cb = DriverManager.getConnection("jdbc:h2:mem:two", "sa", "sa");
        Statement sa = ca.createStatement();
}
}
//181
public class func{
	public void getCycleIsolationSQL(){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        Statement s = c.createStatement();
}
}
//182
public class func{
	public void executeScriptFile(String filename){
        Connection con = DriverManager.getConnection(url, "societies", "societies");
        java.sql.Statement statement = con.createStatement();
}
}
//183
public class func{
	public void testMissingPKColumn(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        conn.setAutoCommit(true);
        Statement stmt = conn.createStatement();
            stmt.execute("upsert into PTSDB(INST,HOST,VAL) VALUES ('abc', 'abc-def-ghi', 0.5)");
}
}
//184
public class func{
	public void addDatabaseUserWithPassword(){
        Connection conn = DriverManager.getConnection(DATASOURCE_URL, "sa", "");
        conn.setAutoCommit(true);
        Statement st = conn.createStatement();
        st.executeUpdate("CREATE USER " + USER + " PASSWORD '" + PASSWORD + "';");
        st.close();
}
}
//185
public class func{
	public void testDeleteFilter(boolean autoCommit){
        Connection conn = DriverManager.getConnection(getUrl());
        initTableValues(conn);
        assertTableCount(conn, "IntIntKeyTest", NUMBER_OF_ROWS);
        conn.setAutoCommit(autoCommit);
        assertEquals(1,conn.createStatement().executeUpdate(deleteStmt));
}
}
