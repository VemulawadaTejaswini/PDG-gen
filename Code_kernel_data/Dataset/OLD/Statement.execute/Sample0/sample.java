//0
public class func{
	public void testPayload(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET PAYLOAD x y"));
    assertTrue(s.execute("SELECT commandpayload('x')"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String str = rs.getString(1);
    assertEquals("y", str);
}
}
//1
public class func{
	public void testSetNonString(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET extra_float_digits TO 2"));
    assertTrue(s.execute("SHOW extra_float_digits"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    assertEquals("2", rs.getString(1));
}
}
//2
public class func{
	public void testSetEmptyLiteral(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET min_client_messages TO ''"));
    assertTrue(s.execute("SHOW min_client_messages"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    assertEquals("", rs.getString(1));
}
}
//3
public class func{
	public void testDistinctPaddingInVarcharIgnored(){
    Statement s = createStatement();
    s.execute("insert into v values ('hello      ')");
    assertRowCount(1, s.executeQuery("select distinct v from v"));
    JDBC.assertSingleValueResultSet(s.executeQuery("select {fn length(c)} from (select distinct v from v) as t(c)"), "5");
    s.execute("drop table v");
    s.close();
}
}
//4
public class func{
	public void testShowPlan(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET SHOWPLAN ON"));
    assertTrue(s.execute("SELECT 1"));
    assertTrue(s.execute("SHOW PLAN"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String str = rs.getString(1);
    assertTrue(str.startsWith("ProjectNode\n  + Relational Node ID:0\n  + Output Columns:expr1 (integer)\n  + Statistics:\n    0: Node Output Rows: 1"));
}
}
//5
public class func{
	public void createTestTable(String name,String signature,String src){
        Statement s = createStatement();
        s.execute(CT+name+signature);
        s.execute(insertFrom(name, src));
        s.close();
}
}
//6
public class func{
	public void testIdentityIndexUsage(){
        Connection conn = getConnection("optimizations");
        Statement stat = conn.createStatement();
        stat.execute("insert into test values()");
        ResultSet rs = stat.executeQuery("explain select * from test where a = 1");
        rs.next();
        assertContains(rs.getString(1), "PRIMARY_KEY");
        stat.execute("drop table test");
}
}
//7
public class func{
	public void testPrepareExecute(Connection conn){
        Statement stat = conn.createStatement();
        stat.execute("prepare test(int, int) as select ?1*?2");
        ResultSet rs = stat.executeQuery("execute test(3, 2)");
        rs.next();
        assertEquals(6, rs.getInt(1));
        stat.execute("deallocate test");
}
}
//8
public class func{
	public void testCacheHint(){
    Statement s = conn.createStatement();
    s.execute("set showplan on");
    ResultSet rs = s.executeQuery("/* cache */ select 1");
    assertTrue(rs.next());
    s.execute("set noexec on");
    rs = s.executeQuery("/* cache */ select 1");
    assertTrue(rs.next());
    rs = s.executeQuery("select 1");
    assertFalse(rs.next());
}
}
//9
public class func{
	public void testNoExec(){
    Statement s = conn.createStatement();
    s.execute("set noexec on");
    ResultSet rs = s.executeQuery("select * from all_tables");
    assertFalse(rs.next());
    s.execute("SET NOEXEC off");
    rs = s.executeQuery("select * from all_tables");
    assertTrue(rs.next());
}
}
//10
public class func{
	public void testCacheHintTtl(){
    Statement s = conn.createStatement();
    s.execute("set showplan on");
    ResultSet rs = s.executeQuery("/*+ cache(ttl:50) */ select 1");
    assertTrue(rs.next());
    s.execute("set noexec on");
}
}
//11
public class func{
	public void doRun(Connection cx){
                Statement st = open(cx.createStatement());
                st.execute(log(sql, LOG));
                st.execute(log(sql, LOG));
}
}
//12
public class func{
	public void createSchemaObjects(Connection conn){
    Statement stmt = conn.createStatement ();
      stmt.execute ("drop table jdbc_demo_lob_table");
    stmt.execute (sql);
    stmt.close();
}
}
//13
public class func{
	public void decorateSQL(Statement s){
                for (int i = 0; i < PROCEDURES.length; i++) {
                    s.execute(PROCEDURES[i]);
                }
                for (int i = 0; i < TABLES.length; i++) {
                    s.execute(TABLES[i][1]);
                }
}
}
//14
public class func{
	public void decorateSQL(Statement s){
                for (int i = 0; i < ROUTINES.length; i++) {
                    s.execute(ROUTINES[i]);
                }
                for (int i = 0; i < TABLES.length; i++) {
                    s.execute(TABLES[i][1]);
                }
}
}
//15
public class func{
	public void testTransactionalMultibatch(){
    assertTrue(s.execute("select tables.name from tables, columns limit 1025"));
    while (s.getResultSet().next()) {
      count++;
    }
}
}
//16
public class func{
	public void testLobStreaming(){
    assertTrue(s.execute("select xmlelement(name \"root\") from tables"));
    s.getResultSet().next();
    assertEquals("<root></root>", s.getResultSet().getString(1));
}
}
//17
public class func{
	public void testLobStreaming1(){
    assertTrue(s.execute("select cast('' as clob) from tables"));
    s.getResultSet().next();
    assertEquals("", s.getResultSet().getString(1));
}
}
//18
public class func{
	public void testDistinctMixedNullRows(){
        Statement s = createStatement();
        s.execute("insert into t values (1, null, 3, null, '1992-01-02', null, '1992-01-01 19:01:01.000', null, 'planet')");
}
}
//19
public class func{
	public void testDistinctTwoVaryingRows(){
        Statement s = createStatement();
        s.execute("insert into t values (1, 1, 3, 4, '1992-01-02', '19:01:01', '1992-01-01 19:01:01.000', 'goodbye', 'planet')");
}
}
//20
public class func{
	public void testDistinctIdenticalAndDifferingRows(){
        Statement s = createStatement();
        s.execute("insert into t values (2, 1, 4, 3, '1992-01-01', '19:01:01', '1992-01-01 19:01:01.000', 'hello', 'planet')");
}
}
//21
public class func{
	public void test5DeleteAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER DELETE on table1 " +
        "delete from table2 where id=1");
}
}
//22
public class func{
	public void test5InsertAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER INSERT on table1 " +
      "insert into table2(id, updates) values (100, -1)");
}
}
//23
public class func{
	public void test5InsertBeforeTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 NO CASCADE BEFORE INSERT on table1 " +
      "select updates from table2 where table2.id = 1");
}
}
//24
public class func{
	public void copySHPTestAutomaticTableName(){
        final String path = StringUtils.quoteStringSQL(SHPEngineTest.class.getResource("waternetwork.shp").getPath());
        st.execute("CALL SHPRead(" + path + ", 'waternetwork');");
        checkSHPReadResult(st);
}
}
//25
public class func{
	public void copySHPTest(){
        final String path = StringUtils.quoteStringSQL(SHPEngineTest.class.getResource("waternetwork.shp").getPath());
        st.execute("CALL SHPRead(" + path + ", 'WATERNETWORK');");
        checkSHPReadResult(st);
}
}
//26
public class func{
	public void readSHPConstraintTest(){
        st.execute("CALL FILE_TABLE('"+SHPEngineTest.class.getResource("waternetwork.shp").getPath()+"', 'SHPTABLE');");
}
}
//27
public class func{
	public void testDERBY_6317_value2(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6035610);
        confirmIndexScanUsage(stmt, 6035610);
}
}
//28
public class func{
	public void testDERBY_6317_value1(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 5189284);
        confirmIndexScanUsage(stmt, 5189284);
}
}
//29
public class func{
	public void testDERBY_6317_value6(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6035609);
        confirmIndexScanUsage(stmt, 6035609);
}
}
//30
public class func{
	public void testSelectNoGenKeys(){
        Statement stmt = createStatement();
        stmt.execute("select * from tab1", Statement.NO_GENERATED_KEYS);
        assertNull("Expected NULL ResultSet after stmt.execute()", stmt
                .getGeneratedKeys());
}
}
//31
public class func{
	public void setUp(){
        Statement s = createStatement();
        s.execute("truncate table t2");
}
}
//32
public class func{
	public void assertSentrySemanticException(Statement statement,String query,String exceptionType){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
//33
public class func{
	public void assertAuthzExecHookException(Statement statement,String query,String expectedMsg){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
//34
public class func{
	public void testStatementSeverityErrorInProcedure(){
        Statement s = createStatement();
                  getClass().getName() + ".proc_5280' reads sql data");
        s.execute("call proc_5280()");
}
}
//35
public class func{
	public void assertAuthzException(Statement statement,String query){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
//36
public class func{
	public void testSetSchemaProcedure(){
        Statement s = createStatement();
        s.execute("CALL APP.SET_SCHEMA('FOO')");
}
}
//37
public class func{
	public void onDeleteCascadeWithLogQueryPlan(){
        setAutoCommit(false);
        Statement s = createStatement();
        s.execute("delete from a");
}
}
//38
public class func{
	public void testDistinctSomeNullRows(){
        Statement s = createStatement();
        s.execute("insert into t (i) values (null)");
}
}
//39
public class func{
	public void testDistinctIdenticalNullRows(){
        Statement s = createStatement();
        s.execute("insert into t (i) values (null)");
}
}
//40
public class func{
	public void testTransactionCycleDisabled(){
    assertTrue(s.execute("select * from tables order by name"));
    conn.setAutoCommit(true);
}
}
//41
public class func{
	public void dropTables(){
            s.execute("drop table " + table.get("table_name") + " cascade constraints");
            System.out.println("Dropping table: " + table.get("table_name"));
}
}
//42
public class func{
	public void dropSequences(){
            s.execute("drop sequence " + sequence.get("sequence_name"));
            System.out.println("Dropping sequence: " + sequence.get("sequence_name"));
}
}
//43
public class func{
	public void test_recycle(){
        DruidPooledConnection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("select 1");
}
}
//44
public class func{
	public void test_recycle(){
        DruidPooledConnection conn = dataSource.getConnection();
        conn.setAutoCommit(false);
        conn.setReadOnly(false);
        Statement stmt = conn.createStatement();
        stmt.execute("select 1");
}
}
//45
public class func{
	public void test5UpdateAfterTriggerNoReferencingClause(){
        basicSetup();
        Statement s = createStatement();
    s.execute("create trigger trigger1 AFTER UPDATE of status on table1 " +
        "update table2 set updates = updates + 1 where table2.id = 1");
}
}
//46
public class func{
	public void dropTrigger(Statement s,String launchId){
    String triggerName = launchId.replace(" ", "_");
    triggerName = triggerName.replace(".", "_");
    triggerName = triggerName.toUpperCase();
      s.execute("DROP TRIGGER " + triggerName);
}
}
//47
public class func{
	public void dropAllTriggerPlans(){
        Statement s = createStatement();
                + getClass().getName()
        s.execute("drop procedure clear_sps_plans");
}
}
//48
public class func{
	public void testDefaultConnection(){
                TestFunctions.class.getName()+".testDefaultConn\"");
        stat.execute("drop alias test");
}
}
//49
public class func{
	public void testFunctionTable(){
                TestFunctions.class.getName() + ".simpleFunctionTable\"");
        stat.execute("select * from simple_function_table() " +
                "where a>0 and b in ('x', 'y')");
}
}
//50
public class func{
	public void setupTable(String tableName){
    statement.execute("LOAD DATA LOCAL INPATH '"
      + dataFilePath.toString() + "' INTO TABLE " + tableName);
}
}
//51
public class func{
	public void execute(PageContext pc,Statement stat,boolean createGeneratedKeys,SQL sql){
    return createGeneratedKeys?stat.execute(sql.getSQLString(),Statement.RETURN_GENERATED_KEYS):stat.execute(sql.getSQLString());
}
}
//52
public class func{
	public void execute(PageContext pc,Statement stat,boolean createGeneratedKeys,SQL sql){
    return createGeneratedKeys?stat.execute(sql.getSQLString(),Statement.RETURN_GENERATED_KEYS):stat.execute(sql.getSQLString());
}
}
//53
public class func{
	public void testIdenticalRows(){
        Statement s = createStatement();
        s.execute("insert into t values (1, 2, 3, 4, '1992-01-01', '19:01:01', '1992-01-01 19:01:01.000', 'hello', 'planet')");
}
}
//54
public class func{
	public void testOneRow(){
        Statement s = createStatement();
        s.execute("insert into t values (1, 2, 3, 4, '1992-01-01', '19:01:01', '1992-01-01 19:01:01.000', 'hello', 'planet')");
}
}
//55
public class func{
	public void testSetSchema(){
        Statement s = createStatement();
        s.execute("SET SCHEMA FOO");
}
}
//56
public class func{
	public void testChangeIsoLevelFunctionJDBC(){
        Statement s = createStatement();
        s.execute("CREATE TABLE T1(ISOLEVEL INT)");
}
}
//57
public class func{
	public void assertTableExists(String table){
            st.execute(String.format("SELECT count(*) FROM %s;", table));
}
}
//58
public class func{
	public void tearDown(){
            final String sql = String.format("delete from casusers;");
            s.execute(sql);
}
}
//59
public class func{
	public void executeCanonicalizedSQL(Statement mS,String statement){
      statement = statement.replace(" clob,", " text,");
    return mS.execute(statement);
}
}
//60
public class func{
	public void setupKv1Tabs(String tableName){
    stmt.execute("load data local inpath '"
        + dataFilePath.toString() + "' into table " + tableName);
}
}
//61
public class func{
	public void tearDown(){
        _conn.setSchema(null);
        Statement stmt = _conn.createStatement();
        stmt.execute("DROP SCHEMA \"UpperCase\" CASCADE");
}
}
//62
public class func{
	public void call(){
                    Statement stmt = _conn.createStatement();
                    stmt.execute("SELECT pg_sleep(" + SLEEP_SECONDS + ")");
}
}
//63
public class func{
	public void execute(PushbackReader reader){
        while ((sql = readNextStatement(reader)) != null) {
            try {
                logger.fine("Executing SQL: " + sql);
                statement.execute(sql);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
}
}
//64
public class func{
	public void dropProcedures(Statement statement){
    statement.execute( "DROP PROCEDURE deleteAllUsers" );
}
}
//65
public class func{
	public void waitForPostCommit(Statement stmt){
        stmt.execute("CALL WAIT_FOR_POST_COMMIT()");
}
}
//66
public class func{
	public void enableXplainOnlyMode(Statement s){
        s.execute("call syscs_util.syscs_set_xplain_mode(1)");
}
}
//67
public class func{
	public void enableXplainStyleWithTiming(Statement s){
        enableXplainStyle(s);
        s.execute("call syscs_util.syscs_set_statistics_timing(1)");
}
}
//68
public class func{
	public void testDERBY_6317_value4(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 5189285);
        confirmIndexScanUsage(stmt, 5189285);
}
}
//69
public class func{
	public void decorateSQL(Statement s){
        s.execute("create table t1 (s int)");  
}
}
//70
public class func{
	public void importFileWithBadExtension(){
        stat.execute("CALL KMLRead('target/area_export.blabla', 'BLABLA')");
}
}
//71
public class func{
	public void checkPoint(){
            st = createStatement();
            st.execute("CALL SYSCS_UTIL.SYSCS_CHECKPOINT_DATABASE()");
}
}
//72
public class func{
	public void decorateSQL(Statement s){
                s.execute("create table t2 (c11 int)");
}
}
//73
public class func{
	public void decorateSQL(Statement s){
                            s.execute("grant b to donald");
}
}
//74
public class func{
	public void isClosed(Statement s){
      s.execute("SELECT 1");
}
}
//75
public class func{
	public void adminCreate(String db,String table){
    Connection connection = context.createConnection(ADMIN1);
    Statement statement = context.createStatement(connection);
    statement.execute("CREATE DATABASE " + db);
}
}
//76
public class func{
	public void shutdown(){
                Statement stmt = dbconn.createStatement();
                stmt.execute("SHUTDOWN;");
}
}
//77
public class func{
	public void call(){
                stat.execute("update test set counter = " +
                        random.nextInt(10) + " where id = " + random.nextInt(1000));
}
}
//78
public class func{
	public void dropProcedures(Statement statement){
    statement.execute( "DROP PROCEDURE retrieveTimestamp" );
}
}
//79
public class func{
	public void dropDatabases(){
        statement.execute("drop database if exists " + defaultDatabaseLoader.getDbName());
}
}
//80
public class func{
	public void dropDatabases(){
            statement.execute("drop database if exists " + defaultDatabaseLoader.getDbPentahoDW());
}
}
//81
public class func{
	public void isSuccessful(String sql){
            statement.execute(substitute(sql));
}
}
//82
public class func{
	public void decorateSQL(Statement s){
                    s.execute("create table abort_table( a int )");
}
}
//83
public class func{
	public void decorateSQL(Statement s){
                s.execute("create table foo.set_schema_table( a int )");
}
}
//84
public class func{
	public void createUsersTable(Statement s){
      s.execute(USER_TABLE_NET_NET_UID_INDEX);
}
}
//85
public class func{
	public void dropTables(){
      s = mDB.createStatement();
      s.execute("DROP TABLE messages");
}
}
//86
public class func{
	public void clear(){
            Statement statement = persistenceManager.getConnection().createStatement();
            statement.execute(query);
}
}
//87
public class func{
	public void testSFSUtilities(){
            stat.execute("create table blah.testSFSUtilities(id integer, the_geom point)");
}
}
//88
public class func{
	public void testTableExists(){
    String tableName = getFreeTableName();
    statement.execute("Create table " + tableName + " (id VARCHAR(255))");
    Assert.assertTrue(dbAccessor.tableExists(tableName));
}
}
//89
public class func{
	public void setupTable(String tableName){
    Statement statement = localStatement.get();
    statement.execute("CREATE TABLE " + tableName
      + " (under_col INT COMMENT 'the under column', value STRING)"
      + " COMMENT ' test table'");
}
}
//90
public class func{
	public void decorateSQL(Statement stmt){
                stmt.execute("create table " + LONGVARCHAR  +
                        " (sno int, dLongVarchar LONG VARCHAR)");
}
}
//91
public class func{
	public void execute(PageContext pc,Statement stat,String sql,int autoGeneratedKeys){
    if(pc==null) return stat.execute(sql,autoGeneratedKeys);
}
}
//92
public class func{
	public void createUsersTable(Statement s){
      s.execute(USER_TABLE_NET_NET_UID_INDEX);
}
}
//93
public class func{
	public void expectError(Statement stat,String sql,String error){
            stat.execute(sql);
}
}
//94
public class func{
	public void decorateSQL(Statement s){
                s.execute("create table TEST_TABLE( TEST_COL blob( 65536 ))");
}
}
//95
public class func{
	public void testNoTablePrivileges(){
        stmt.execute("REVOKE ALL ON metadatatest FROM " + TestUtil.getUser());
}
}
//96
public class func{
	public void tearDown(){
      stmt.execute("DROP TABLE " + getTableName());
}
}
//97
public class func{
	public void dropTable(Statement stmt,String name){
      stmt.execute("DROP TABLE " + name);
}
}
//98
public class func{
	public void importFileWithBadExtension(){
        stat.execute("CALL SHPRead('target/area_export.blabla', 'BLABLA')");
}
}
//99
public class func{
	public void exec(final AbstractClassMetaData cmd,final Statement statement){
        final String sql = buildSqlToExec(cmd);
        return statement.execute(sql);
}
}
//100
public class func{
	public void unlockTable(){
                Statement s = conn1.createStatement();
                s.execute(myCommit);
}
}
//101
public class func{
	public void decorateSQL(Statement s){
                s.execute("grant role1 to user1");
}
}
//102
public class func{
	public void executeDDL(IDatabaseConnection databaseConnection,String filename){
      st.execute(loadDDL(filename));
}
}
//103
public class func{
	public void dropTable(Statement s,String name){
            s.execute("drop table "+name);
}
}
//104
public class func{
	public void emptyStatementCache(){
        Statement s = createStatement();
        s.execute("CALL SYSCS_UTIL.SYSCS_EMPTY_STATEMENT_CACHE()");
        closeStatement(s);
}
}
//105
public class func{
	public void createDerby2041Triggers(Statement s){
        s.execute("create trigger d2041_tr5 after insert on d2041_t "
                + "for each row mode db2sql call d2041_proc()");
}
}
//106
public class func{
	public void decorateSQL(Statement stmt){
        stmt.execute("create view tab1_view (a,b) as select y,y+1 from tab1");
}
}
//107
public class func{
	public void hiveInitializeDatabase(HiveStore hiveStore,String tablename){
    hiveStore.connect();
    Statement stmt = hiveStore.getConnection().createStatement();
    stmt.execute("CREATE TABLE IF NOT EXISTS " + tablename + " (col1 string) PARTITIONED BY(dt STRING) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\n'  \n"
            + "STORED AS TEXTFILE ");
}
}
//108
public class func{
	public void constructIndexedHeap(Statement st){
        st.execute("insert into indexed_heap (a) values (2)");
}
}
//109
public class func{
	public void testDERBY_6317_value3(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 6031628);
        confirmIndexScanUsage(stmt, 6031628);
}
}
//110
public class func{
	public void enableRuntimeStatistics(Statement s){
        s.execute("call syscs_util.syscs_set_runtimestatistics(1)");
}
}
//111
public class func{
	public void dropStatement(String sql,Statement statement){
      statement.execute(sql);
}
}
//112
public class func{
	public void createProcedureDeleteAllUsers(Statement statement){
    statement.execute(
        "CREATE PROCEDURE deleteAllUsers() " +
            "language java " +
            "external name 'org.hibernate.jpa.test.procedure.JpaTckUsageTest.deleteAllUsers' " +
            "parameter style java"
    );
}
}
//113
public class func{
	public void createProcedureFindOneUser(Statement statement){
    statement.execute(
        "CREATE PROCEDURE findOneUser() " +
            "language java " +
            "dynamic result sets 1 " +
            "external name 'org.hibernate.jpa.test.procedure.JpaTckUsageTest.findOneUser' " +
            "parameter style java"
    );
}
}
//114
public class func{
	public void decorateSQL(Statement s){
        s.execute("CREATE UNIQUE INDEX " +tableName +"x on "+ tableName+"(i1,i3)");
}
}
//115
public class func{
	public void createXATransactionView(Statement s){
        s.execute(
                "create view XATESTUTIL.global_xactTable as " +
                "select  cast(global_xid as char(2)) as gxid," +
                " status, " +
                " CAST (case when first_instant is NULL then 'NULL' else 'false' end AS VARCHAR(8)) as readOnly, " +
                " cast (username as char(10)) as username, type " +
                " from syscs_diag.transaction_table");
}
}
//116
public class func{
	public void executeDDL(String ddl){
        Statement statement = getConnection().createStatement();
        statement.execute(ddl);
}
}
//117
public class func{
	public void doInStatement(Statement stmt){
        stmt.execute(sql);
}
}
//118
public class func{
	public void testDERBY_6317_value5(){
        Statement stmt = createStatement();
        stmt.execute(testSelect + 1);
        confirmIndexScanUsage(stmt, 1);
}
}
//119
public class func{
	public void decorateSQL(Statement stmt){
                stmt.execute("create procedure CREATEARCHIVE(jarName VARCHAR(20)" +
                        " , path VARCHAR(20), dbName VARCHAR(20))" +
                        " LANGUAGE JAVA PARAMETER STYLE JAVA" +
                        " NO SQL" +
                        " EXTERNAL NAME 'org.apache.derbyTesting.functionTests.tests.lang.dbjarUtil.createArchive'");
}
}
//120
public class func{
	public void testExecuteWithSelect(){
        Statement stat = getProxyConnectionForSelect().createStatement();
        boolean result = stat.execute("SELECT name FROM foo");
}
}
//121
public class func{
	public void verifyUDFNotAllowed(Statement stmt,String tableName,String udfcall,String udfname){
      stmt.execute("SELECT " + udfcall + " from " + tableName);
}
}
//122
public class func{
	public void execute(PageContext pc,Statement stat,String sql){
    if(pc==null) return stat.execute(sql);
}
}
//123
public class func{
	public void testMetaDataGetTablesHive(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.HIVE.toString());
}
}
//124
public class func{
	public void orientBySlope(Statement st,TableLocation nodesName,TableLocation edgesName){
        st.execute("UPDATE " + edgesName + " c " +
                    "SET START_NODE=END_NODE, " +
                    "    END_NODE=START_NODE " +
                    "WHERE (SELECT ST_Z(A.THE_GEOM) < ST_Z(B.THE_GEOM) " +
                            "FROM " + nodesName + " A, " + nodesName + " B " +
                            "WHERE C.START_NODE=A.NODE_ID AND C.END_NODE=B.NODE_ID);");
}
}
//125
public class func{
	public void testGetSRID(){
        st.execute("CREATE TABLE noindex (id INT AUTO_INCREMENT PRIMARY KEY, geom BLOB)");
}
}
//126
public class func{
	public void testGetSRID(){
        Statement st = cx.createStatement();
        st.execute("CALL CreateSpatialIndex(null, 'SPATIAL', 'GEOM', '4326')");
}
}
//127
public class func{
	public void traceMarker(){
            Statement statement = delegatingConnection.createStatement();
                statement.execute("select * from employee");
}
}
//128
public class func{
	public void testConnectionRollback(){
        stat.execute("INSERT INTO TEST VALUES(1, 'Hello')");
}
}
//129
public class func{
	public void setUpClass(){
        Connections.initH2();
        Statement stmt = Connections.getStatement();
        stmt.execute("create table if not exists " +
                "newschema.SURVEY(ID2 int auto_increment, NAME2 varchar(30), NAME3 varchar(30))");
}
}
//130
public class func{
	public void setDatabaseProperty(Statement s,String key,String value){
        s.execute( command );
}
}
//131
public class func{
	public void decorateSQL(Statement s){
                s.execute("create table setMaxFieldSize(id int unique, " +
                        "dVarchar VARCHAR(32672), dClob clob)");
}
}
//132
public class func{
	public void createTestTable(){
    Statement stat = this.dataSource.getConnection().createStatement();
    stat.execute("CREATE TABLE TEST(" +
      "ID INT PRIMARY KEY, " +
      "COLUMN1 VARCHAR, " +
      "COLUMN2 VARCHAR " +
    ")");
}
}
//133
public class func{
	public void constructHeap(Statement st){
        st.execute("create table heap_only (a int)");
}
}
//134
public class func{
	public void constructHeap(Statement st){
        st.execute("insert into heap_only values (1)");
}
}
//135
public class func{
	public void constructHeap(Statement st){
        st.execute("insert into heap_only values (2)");
}
}
//136
public class func{
	public void createTableAandUniqueIndex(Statement st){
        st.execute("insert into a values (4, 'd')");
}
}
//137
public class func{
	public void decorateSQL(Statement s){
                    s.execute("insert into app.a (a) values(1)");
}
}
//138
public class func{
	public void testSetSchema(){
        s.execute("SET SCHEMA \"\u00bbMY\u20ac\u00ab\"");
}
}
//139
public class func{
	public void testChangeIsoLevelProcedureJDBC(){
            s.execute("CALL SET_ISOLATION_JDBC(" + isoLevels[i].getIsoLevel() + ")");
}
}
//140
public class func{
	public void testChangeIsoLevelFunctionJDBC(){
            s.execute("INSERT INTO T1 VALUES GET_CYCLE_ISOLATION_JDBC()");
}
}
//141
public class func{
	public void execute(Statement statement){
                statement.execute("create table mbcj_test_isolated.bikini_bottom (name varchar(255) primary key)");
}
}
//142
public class func{
	public void testSubqueryInWhenClauseNPE(){
        Statement s = createStatement();
        s.execute("insert into t1 values 1,2,3");
}
}
//143
public class func{
	public void testLog(double expected,Statement stat){
        assertEquals((int) (Math.log(10) * 100), (int) (rs.getDouble(1) * 100));
        stat.execute("drop table log");
}
}
//144
public class func{
	public void dontrun_testDERBY_6317(){
        Statement stmt = createStatement();
        stmt.execute("call SYSCS_UTIL.SYSCS_SET_RUNTIMESTATISTICS(1)");
}
}
//145
public class func{
	public void createTable(Connection conn,ByteString topic){
            String tableName = getTableNameForTopic(topic);
            stmt.execute("CREATE TABLE " + tableName + " (" + ID_FIELD_NAME + " BIGINT NOT NULL CONSTRAINT ID_PK_"
                         + tableName + " PRIMARY KEY," + MSG_FIELD_NAME + " BLOB(2M) NOT NULL)");
}
}
//146
public class func{
	public void doExecuteStatement(Statement statement){
    statement.execute(sql);
}
}
//147
public class func{
	public void testLargeUpdateDelete(){
        int len = getSize(10000, 100000);
        stat.execute("DELETE FROM TEST");
}
}
//148
public class func{
	public void setup(){
        s.execute(getSqlInsertStatementToCreateUserAccount(0));
}
}
//149
public class func{
	public void decorateSQL(Statement stmt){
                stmt.execute("CREATE TABLE MB_CLOBTABLE " +
                        "(K INT CONSTRAINT PK PRIMARY KEY, C CLOB(" +
                        LONG_CLOB_LENGTH + "))");
}
}
//150
public class func{
	public void execute(String query){
      s = getSQLConnection().createStatement();
      s.execute(query);
}
}
//151
public class func{
	public void dropType(Statement stmt,String type){
            stmt.execute("drop type " + type);
}
}
//152
public class func{
	public void decorateSQL(Statement s){
                                s.execute("insert into t4 (c1) values (1),(2),(3)");
}
}
//153
public class func{
	public void commit(){
            st = createStatement();
            st.execute("CHECKPOINT");
}
}
//154
public class func{
	public void executeSql(Statement st,String sql){
        log.trace("SQL: " + sql);
        st.execute(sql);
}
}
//155
public class func{
	public void setRowCountBase(Statement stmt,boolean onClient,long rowCountBase){
            stmt.execute( "call setRowCountBase( " + rowCountBase + " )" );
}
}
//156
public class func{
	public void testCompressTableWithDoubleQuoteInName(){
        Statement s = createStatement();
        s.execute("drop table app.\"abc\"\"def\"");
}
}
//157
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s2.execute("create local temporary table test(id int unique)");
}
}
//158
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s1.execute("drop table test");
}
}
//159
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s2.execute("drop table test");
}
}
//160
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s1.execute("alter table test add constraint a unique(id)");
}
}
//161
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s1.execute("create local temporary table test(id int unique)");
}
}
//162
public class func{
	public void testConstraints(Connection conn1,Connection conn2){
        s2.execute("alter table test add constraint a unique(id)");
}
}
//163
public class func{
	public void initFullText(Statement stat,boolean lucene){
        stat.execute("CALL " + prefix + "_INIT()");
}
}
//164
public class func{
	public void flushRowCount(Statement stmt){
        stmt.execute("CALL SYSCS_UTIL.SYSCS_CHECKPOINT_DATABASE()");
}
}
//165
public class func{
	public void testNoData(){
        Statement s = createStatement();
        s.execute("delete from t");
}
}
//166
public class func{
	public void createTableAndInsertData(Statement s,String tableName,String column1,String column2){
        s.execute("INSERT INTO " + tableName + " VALUES (1,11)");
}
}
//167
public class func{
	public void execute(PageContext pc,Statement stat,String sql,int[] columnIndexes){
    if(pc==null) return stat.execute(sql,columnIndexes);
}
}
//168
public class func{
	public void decorateSQL(Statement s){
                s.execute("CREATE FUNCTION  PADSTRING (DATA VARCHAR(32000), "
                        + "LENGTH INTEGER) RETURNS VARCHAR(32000) EXTERNAL NAME " +
                        "'org.apache.derbyTesting.functionTests.util.Formatters" +
                ".padString' LANGUAGE JAVA PARAMETER STYLE JAVA");
}
}
//169
public class func{
	public void executeStatement(String sql,Connection con){
      Logger.info(this, "Executing " + sql);
      boolean ret=stmt.execute(sql);
      Logger.info(this, "Finished Executing " + sql);
}
}
//170
public class func{
	public void createSampleDbTable(Statement statement,String db,String table){
    statement.execute("LOAD DATA LOCAL INPATH '" + dataFile.getPath() + "' INTO TABLE " + table);
}
}
//171
public class func{
	public void createSampleDbTable(Statement statement,String db,String table){
    statement.execute("CREATE TABLE " + table + "(a STRING)");
}
}
//172
public class func{
	public void readSHPConstraintTest(){
        st.execute("drop table shptable");
}
}
//173
public class func{
	public void testInsertRollback(){
        stmt.execute(INSERT);
}
}
//174
public class func{
	public void testChangeIsoLevelPreparedFunctionJDBC(){
        Statement s = createStatement();
        s.execute("CREATE TABLE T1(ISOLEVEL INT)");
}
}
//175
public class func{
	public void testSetSchemaProcedure(){
        s.execute("CALL APP.SET_SCHEMA('\"\u00bbMY\u20ac\u00ab\"')");
}
}
//176
public class func{
	public void testChangeIsoLevelStatementSQL(){
            s.execute("SET ISOLATION "+isoLevels[i].getSqlName());
}
}
//177
public class func{
	public void finishedProcessing(Connection connection,Map<Integer,FeatureData> featureDataMap){
        LOG.info("executing: " + query);
        stmt.execute(query);
}
}
//178
public class func{
	public void setupKv1Tabs(String tableName){
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("CREATE TABLE " + tableName
        + " (under_col INT COMMENT 'the under column', value STRING)"
        + " COMMENT ' test table'");
}
}
//179
public class func{
	public void clearXplainOnlyMode(Statement s){
        s.execute("call syscs_util.syscs_set_xplain_mode(0)");
}
}
