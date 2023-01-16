//0
public class func{
	public void tearDown(){
        Statement stmt = con.createStatement();
        stmt.execute("drop function myif(a INOUT int, b IN int)");
        stmt.close();
}
}
//1
public class func{
	public void executeWhatever(String sql){
                        Statement stmt = con.createStatement();
                        stmt.execute(sql);
                        stmt.close();
}
}
//2
public class func{
	public void delete(){
        Statement stmt = con.createStatement();
        stmt.execute("delete from tab1 where i = " + keyVal);
        stmt.close();
}
}
//3
public class func{
	public void after(){
    TestUtil.dropTable(con, "testerr");
    Statement stmt = con.createStatement();
    stmt.execute("DROP DOMAIN testdom");
    stmt.close();
}
}
//4
public class func{
	public void before(){
    conn = TestUtil.openDB();
    Statement stmt = conn.createStatement();
    stmt.execute("CREATE TABLE truncatetest(id uuid)");
    stmt.close();
}
}
//5
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("INSERT INTO xmltest VALUES (2, '" + _xmlFragment + "')");
        stmt.close();
}
}
//6
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE TEMP TABLE genkeys(a serial, b text, c int)");
        stmt.close();
}
}
//7
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE TEMP TABLE uuidtest(id uuid)");
        stmt.close();
}
}
//8
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("INSERT INTO hold VALUES (2)");
        stmt.close();
}
}
//9
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE OR REPLACE FUNCTION return_bool(boolean) RETURNS boolean AS 'BEGIN RETURN $1; END;' LANGUAGE plpgsql");
        stmt.close();
}
}
//10
public class func{
	public void after(){
    Statement stmt = _conn.createStatement();
    stmt.execute("DROP TABLE genkeys");
    stmt.close();
}
}
//11
public class func{
	public void testSelect(){
    Statement stmt = _conn.createStatement();
    stmt.execute("select * from hold");
    stmt.close();
}
}
//12
public class func{
	public void tearDown(){
        Statement stmt = _conn.createStatement();
        stmt.execute("DROP TABLE hold");
        stmt.close();
}
}
//13
public class func{
	public void executeSQL(String sql){
      Statement stmt = conn.createStatement();
      stmt.execute(sql);
      stmt.close();
}
}
//14
public class func{
	public void tearDown(){
            st = conn.createStatement();
            st.execute("drop table if exists type");
                st.close();
}
}
//15
public class func{
	public void setUp(){
        Statement st = conn.createStatement();
        st.execute(DatabaseCreator.CREATE_TABLE_SIMPLE1);
        st.close();
}
}
//16
public class func{
	public void after(){
    Statement stmt = conn.createStatement();
    stmt.execute("DROP TABLE uuidtest");
    stmt.close();
}
}
//17
public class func{
	public void execute(String sql){
    final Statement statement = connection.createStatement();
    statement.execute(sql);
    statement.close();
}
}
//18
public class func{
	public void loadData(JdbcDataSource ds){
        connection = ds.getConnection();
        Statement stmt = connection.createStatement();
        stmt.execute("CREATE TABLE ROLES AS SELECT * FROM CSVREAD('classpath:roles.csv',null,'lineComment=#')");
        stmt.close();
}
}
//19
public class func{
	public void executeInsert(){
            Statement statement = connection.createStatement();
                statement.execute("insert into employee (name) values ('john doe')");
                statement.close();
}
}
//20
public class func{
	public void execute(String sql){
    Statement statement = connection.createStatement();
      statement.execute(sql);
      statement.close();
}
}
//21
public class func{
	public void tearDown(){
        Statement st = createStatement();
        st.executeUpdate("DROP FUNCTION PADSTRING");
        st.execute("drop view tran_table");
        st.close();
}
}
//22
public class func{
	public void setSchema(String schema){
        Statement stm = createStatement();
        stm.execute("SET SCHEMA " + schema);
        stm.close();
}
}
//23
public class func{
	public void setTimeout(long t){
        Statement stm = createStatement();
        stm.execute("call syscs_util.syscs_set_database_property(" +
                    "'derby.locks.waitTimeout', '" + t + "')");
        stm.close();
}
}
//24
public class func{
	public void checkConnection(){
      Statement st = getConnection().createStatement();
         st.execute("SELECT true");
         st.close();
}
}
//25
public class func{
	public void updateHeartbeat(){
    Statement st = getConnection().createStatement();
    st.execute("UPDATE ttirc_system SET value = NOW() WHERE "+m_dbKeyParam+" = 'MASTER_HEARTBEAT'");
    st.close();
}
}
//26
public class func{
	public void grantRevokeAfterSettingSQLAuthProperty(){
    Statement stmt = createStatement();
      stmt.execute("revoke select on GR_TAB from some_user");
      stmt.close();
}
}
//27
public class func{
	public void shutdown(final boolean active){
            final Statement statement = getConnection().createStatement();
            statement.execute("SHUTDOWN");
            statement.close();
}
}
//28
public class func{
	public void createTable(){
        for (int i = 0; i < PROCEDURES.length; i++) {
            stmt.execute(PROCEDURES[i]);
        }
        stmt.close();
}
}
//29
public class func{
	public void dropDb(String user,String... dbs){
    for(String db : dbs) {
      statement.execute("DROP DATABASE IF EXISTS " + db + " CASCADE");
    }
    statement.close();
}
}
//30
public class func{
	public void createDb(String user,String... dbs){
    for(String db : dbs) {
      assertTrue(db + " is not part of known test dbs which will be cleaned up after the test", allowedDBs.contains(db));
      statement.execute("CREATE DATABASE " + db);
    }
    statement.close();
}
}
//31
public class func{
	public void testReload(){
    Connection connection = context.createConnection(USER1_1);
    Statement statement = context.createStatement(connection);
    statement.execute("RELOAD");
    statement.close();
}
}
//32
public class func{
	public void adminCreatePartition(){
    Connection connection = context.createConnection(ADMIN1);
    Statement statement = context.createStatement(connection);
    statement.execute("ALTER TABLE tb1 ADD IF NOT EXISTS PARTITION (b = '1') ");
    statement.close();
}
}
//33
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("drop table app.t1");
        stmt.close();
}
}
//34
public class func{
	public void setUp(){
        Statement stmt = createStatement();
        stmt.execute ("create table testblob (data blob)");
        stmt.close();
}
}
//35
public class func{
	public void setUp(){
        Statement st = cx.createStatement();
        st.execute("DROP TABLE IF EXISTS noindex");
        st.close();
}
}
//36
public class func{
	public void adminCreate(String db,String table){
    if (table != null) {
      statement.execute("CREATE table " + db + "." + table + " (a string)");
    }
    statement.close();
}
}
//37
public class func{
	public void tearDown(){
        Statement st = createStatement();
        st.execute("drop table lobTable100M");
        st.close();
}
}
//38
public class func{
	public void setUp(){
        Statement st = createStatement();
        st.execute("create table lobTable100M(bl blob(100M))");
        st.close();
}
}
//39
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("drop table GR_TAB");
        stmt.close();
}
}
//40
public class func{
	public void cleanup(){
        Statement dropStmt = this.conn.createStatement();
        dropStmt.execute("DROP TABLE actor_states");
        dropStmt.close();
}
}
//41
public class func{
	public void insertThreePoints(){
      Statement st = cx.createStatement();
        st.execute("INSERT INTO spatial (geom) VALUES (ST_GeomFromText('POINT(2 2)', 4326))");
        st.close();
}
}
//42
public class func{
	public void loadSQL(Connection connection,String resource,HypersonicPreprocessor sqlPreprocessor){
        if (sqlPreprocessor != null) {
            sql = sqlPreprocessor.preprocessSQL(sql);
        }
        stmt.execute(sql);
        stmt.close();
}
}
//43
public class func{
	public void setUp(){
         stmt.execute("CREATE TABLE " + JDBC.escape(tableName) + "(id int)");
         stmt.close();
}
}
//44
public class func{
	public void setUp(){
    Statement stmt = createStatement();
    stmt.executeUpdate("create table t1 (c11 int, c12 smallint, c13 double, c14 char(3))");
    stmt.execute("insert into t2 values (-1),(-2)");
    stmt.close();
}
}
//45
public class func{
	public void tearDown(){
         stmt.execute("DROP TABLE " + JDBC.escape(tableName));
         stmt.close();
}
}
//46
public class func{
	public void testMetaDataGetClassicTableTypes(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.CLASSIC.toString());
    stmt.close();
}
}
//47
public class func{
	public void testMetaDataGetTablesClassic(){
    stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
        " = " + TableTypeMappings.CLASSIC.toString());
    stmt.close();
}
}
//48
public class func{
	public void test_0(){
        stmt.execute("select 1");
        stmt.close();
}
}
//49
public class func{
	public void setUp(){
    connDDL = openDefaultConnection();
    Statement s = connDDL.createStatement();
    s.execute(
    "CREATE TABLE PED001 (A INT NOT NULL, B DECIMAL(6,4), C VARCHAR(20))");
    s.close();
}
}
//50
public class func{
	public void setUp(){
        Statement s = createStatement();
        s.execute("delete from t1");
        s.close();
}
}
//51
public class func{
	public void traceMarker(){
            Statement statement = delegatingConnection.createStatement();
                statement.execute(null);
                statement.close();
}
}
//52
public class func{
	public void setUp(){
        Statement s = createStatement();
        s.execute("insert into EXCEPTION_TABLE1 (id, data)" +
                  "values (1, 'data1')");
        s.close();
}
}
//53
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("DROP TABLE T0");
        stmt.close();
}
}
//54
public class func{
	public void createSQLJSchema(){
    Statement stmt = m_connection.createStatement();
    stmt.execute("GRANT USAGE ON SCHEMA sqlj TO public");
    stmt.close();
}
}
//55
public class func{
	public void executeStatement(String sql){
      Logger.info(this, "Executing " + sql);
      boolean ret=stmt.execute(sql);
      stmt.close();
}
}
//56
public class func{
	public void body(Connection conn){
                    s.execute("delete from t");
                s.close();
}
}
//57
public class func{
	public void tearDown(){
        Statement s = createStatement();
        s.execute("drop table EXCEPTION_TABLE1");
        s.close();
}
}
//58
public class func{
	public void tearDown(){
        Statement st = createStatement();
        st.execute("DROP TABLE TEST_TABLE");
        st.close();
}
}
//59
public class func{
	public void installTrigger(Connection cx,String tableName,String geomName,String triggerAction,String referencing,String triggerStmt){
        LOGGER.fine("trigger SQL : " + sql);
            s.execute(sql);
            s.close();
}
}
//60
public class func{
	public void setUp(){
        stmt.execute("ALTER TABLE testerr ADD CONSTRAINT testerr_pk PRIMARY KEY (id)");
        stmt.close();
}
}
//61
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute ("drop table testblob");
        stmt.close();
}
}
//62
public class func{
	public void createDDL(){
        stmt.execute("CREATE PROCEDURE BASIC_CALL_0(INOUT F1 FLOAT, INOUT F2 DOUBLE, INOUT F3 REAL, INOUT F4 DATE, INOUT F5 TIME, INOUT F6 SMALLINT, INOUT F7 SMALLINT, INOUT F8 INTEGER, INOUT F9 BIGINT, INOUT F10 DECIMAL(9,2), INOUT F11 TIMESTAMP, INOUT F12 VARCHAR(128) FOR BIT DATA, INOUT F13 VARCHAR(256), INOUT F14 VARCHAR(256), INOUT F15 VARCHAR(256), INOUT F16 VARCHAR(256), INOUT F17 SMALLINT) "
                     + "LANGUAGE JAVA PARAMETER STYLE JAVA EXTERNAL NAME '"
                     + BasicTypeTest.class.getName()
                     + ".basic_process_0' " + "DYNAMIC RESULT SETS 1");
        stmt.close();
}
}
//63
public class func{
	public void tearDown(){
            Statement st = HsqlConn.createStatement();
            st.execute("SHUTDOWN");
            st.close();
}
}
//64
public class func{
	public void configureConnection(){
    Statement stmt = createStatement();
    stmt.execute(
        "set hive.fetch.output.serde = org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe");
    stmt.close();
}
}
//65
public class func{
	public void execute(ReviewDb db,String sql){
    Statement s = ((JdbcSchema) db).getConnection().createStatement();
      s.execute(sql);
      s.close();
}
}
//66
public class func{
	public void select(OracleConnection oracleConn){
        Statement stmt = oracleConn.createStatement();
        stmt.execute("SELECT 1 FROM DUAL");
        stmt.close();
}
}
//67
public class func{
	public void setUp(){
        Statement stmt = createStatement();
        stmt.execute("create table GR_TAB (id int)");
        stmt.close();
}
}
//68
public class func{
	public void clear(){
    Statement st = TestUtils.getConnection().createStatement();
    st.execute("SPARQL CLEAR GRAPH <" + TEST_GRAPH_NAME + ">");
    st.close();
}
}
//69
public class func{
	public void exchangeSubpartition(Connection connection,OracleTable table,String subPartitionName,OracleTable subPartitionTable){
        String.format("ALTER TABLE %s EXCHANGE SUBPARTITION %s WITH TABLE %s",
            table.toString(), subPartitionName, subPartitionTable.toString());
    statement.execute(sql);
    statement.close();
}
}
//70
public class func{
	public void setUp(){
        Statement stmt = createStatement();
        stmt.execute("insert into app.t1 values (1, 'one'), "
            + "(2, 'two'), (4, 'four')");
        stmt.close();
}
}
//71
public class func{
	public void doExecute(ConcurrentTestCommandExecutor executor){
      Statement stmt = executor.getConnection().createStatement();
        stmt.execute(sql);
        stmt.close();
}
}
//72
public class func{
	public void tearDown(){
        rollback();
        Statement stmt = createStatement ();
        stmt.execute ("drop table updateClob");
        stmt.close();
}
}
//73
public class func{
	public void executeOnMaster(String sql){
         Statement s = getMasterConnection().createStatement();
         s.execute(sql);
         s.close();
}
}
//74
public class func{
	public void setSchema(String schema){
    Statement stmt = createStatement();
    stmt.execute("use " + schema);
    stmt.close();
}
}
//75
public class func{
	public void setupTestTableWithData(String tableName,Path dataFilePath,Connection hs2Conn){
    stmt.execute("load data local inpath '"
        + dataFilePath.toString() + "' into table " + tableName);
    stmt.close();
}
}
//76
public class func{
	public void setUp(){
        Statement stmt = createStatement ();
        stmt.execute ("create table updateClob " +
                "(id integer primary key, data clob)");
        stmt.close();
}
}
//77
public class func{
	public void testStatementCopyOut(){
        Statement stmt = con.createStatement();
            stmt.execute("COPY copytest TO STDOUT");
        stmt.close();
}
}
//78
public class func{
	public void testStatementCopyIn(){
        Statement stmt = con.createStatement();
            stmt.execute("COPY copytest FROM STDIN");
        stmt.close();
}
}
//79
public class func{
	public void testWarningsAreCleared(){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TEMP TABLE unused (a int primary key)");
        stmt.executeQuery("SELECT 1");
        assertNull(stmt.getWarnings());
        stmt.close();
}
}
//80
public class func{
	public void deleteSqlByID(int sqlmap_file_id){
      stmt = conn.createStatement();
      stmt.execute(command);
      int rows=stmt.getUpdateCount();
      stmt.close();
      logger.info(rows+" is deleted.");
}
}
//81
public class func{
	public void setUp(){
            Statement s = createStatement();
            s.execute("CREATE FUNCTION  PADSTRING (DATA VARCHAR(32000), "
                    + "LENGTH INTEGER) RETURNS VARCHAR(32000) EXTERNAL NAME "
                    + "'org.apache.derbyTesting.functionTests.util.Formatters"
                    + ".padString' LANGUAGE JAVA PARAMETER STYLE JAVA");
            createLockTableQueryEntries(s);
            s.close();
}
}
