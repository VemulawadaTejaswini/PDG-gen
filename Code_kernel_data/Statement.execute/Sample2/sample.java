//0
public class func{
	public void doConnStmtNoRS(String text){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    Statement stmt = conn.createStatement();
    stmt.execute(text);
}
}
//1
public class func{
	public void createDDL(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_BASIC_TYPE (F1 FLOAT, F2 DOUBLE, F3 REAL, F4 DATE, F5 TIME, F6 SMALLINT, F7 SMALLINT, F8 INTEGER, F9 BIGINT, F10 DECIMAL(9,2), F11 TIMESTAMP, F12 BLOB, F13 VARCHAR(256), F14 VARCHAR(256), F15 VARCHAR(256), F16 VARCHAR(256), F17 SMALLINT)");
}
}
//2
public class func{
	public void destroyDatabase(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + database, "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}
//3
public class func{
	public void testCountDistinctNotNull(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("create table test(id int not null) as " +
                "select 1 from system_range(1, 10)");
        ResultSet rs = stat.executeQuery("select count(distinct id) from test");
        rs.next();
        assertEquals(1, rs.getInt(1));
        conn.close();
}
}
//4
public class func{
	public void verifyTableColumnContents(Connection connection,String table,String column,ColumnGenerator gen){
    Statement st = connection.createStatement();
    assertTrue(st.execute("SELECT " + column + " FROM " + table));
    ResultSet rs = st.getResultSet();
    for (int row = 0; rs.next(); ++row) {
      assertEquals(gen.getVerifyText(row), rs.getString(1));
    }
}
}
//5
public class func{
	public void tearDown(){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:race", "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}
//6
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_CLOB (ID INTEGER, DATA CLOB)");
}
}
//7
public class func{
	public void testDeleteGroup(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("delete from test where id not in " +
                "(select min(x) from test group by id)");
}
}
//8
public class func{
	public void shutdown(DataSource dataSource,String databaseName){
      Connection connection = dataSource.getConnection();
      Statement stmt = connection.createStatement();
      stmt.execute("SHUTDOWN");
}
}
//9
public class func{
	public void testEmptyStatements(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute(" ;");
}
}
//10
public class func{
	public void wrappedService(HttpServletRequest request,HttpServletResponse response,String[] path,java.util.LinkedHashMap<String,String> query){
        InitialContext jndiContext = new InitialContext();
        DataSource ds = (DataSource) jndiContext.lookup("java:comp/env/jdbc/connPool");
        Connection conn = ds.getConnection("root", "password");
        Statement stmt = conn.createStatement();
        boolean results = stmt.execute("SELECT NOW();");
        out.println("<br>results: " + results + "<br>");
}
}
//11
public class func{
	public void shutdown(DataSource dataSource,String databaseName){
        java.sql.Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();
        stmt.execute("SHUTDOWN");
}
}
//12
public class func{
	public void onRelease(JDBCDataStore store,Connection cx){
                st = cx.createStatement();
                st.execute(command);
                store.closeSafe(st);
}
}
//13
public class func{
	public void onBorrow(JDBCDataStore store,Connection cx){
                st = cx.createStatement();
                st.execute("SET @MYVAR = " + value);
                store.closeSafe(st);
}
}
//14
public class func{
	public void onBorrow(JDBCDataStore store,Connection cx){
                st = cx.createStatement();
                st.execute(command);
                store.closeSafe(st);
}
}
//15
public class func{
	public void before(){
        final Connection connection = dataSource.getConnection();
        final Statement statement = connection.createStatement();
        statement.execute("RUNSCRIPT FROM 'classpath:/backup.sql'");
}
}
//16
public class func{
	public void f_test_createIndex(){
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
}
}
//17
public class func{
	public void execute(String sql){
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
            JdbcUtils.close(conn);
}
}
//18
public class func{
	public void testDefaultMinMax(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("create sequence b START WITH 7320917853639540658 INCREMENT -1");
}
}
//19
public class func{
	public void testAlterSequenceColumn(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("INSERT INTO TEST (name) VALUES('Other World')");
}
}
//20
public class func{
	public void testSchemaSearchPath(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("CALL TEST_SEQ.CURRVAL");
}
}
//21
public class func{
	public void testRunscriptFromClasspath(){
        deleteDb("runscript");
        conn = getConnection("runscript");
        Statement stat = conn.createStatement();
        stat.execute("select * from version");
}
}
//22
public class func{
	public void testLobUpdateMany(){
        deleteDb("lob");
        Connection conn = getConnection("lob");
        Statement stat = conn.createStatement();
        stat.execute("create table post(id int primary key, text clob) as " +
                "select x, space(96) from system_range(1, 329)");
}
}
//23
public class func{
	public void testCreateAsSelect(){
        deleteDb("lob");
        conn = getConnection("lob");
        stat = conn.createStatement();
        stat.execute("create table test(id int, data clob) as select 1, space(10000)");
}
}
//24
public class func{
	public void dropTable(){
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        statement.execute("drop table ACCOUNT");
}
}
//25
public class func{
	public void tearDown(){
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        statement.execute("drop table ACCOUNT");
}
}
//26
public class func{
	public void migrate(Connection connection){
            statement = connection.createStatement();
            statement.execute("CREATE TRIGGER clinics_history_trigger AFTER INSERT ON clinics FOR EACH ROW CALL\n" +
                    "\"org.flywaydb.core.internal.dbsupport.h2.TestTrigger\";");
            JdbcUtils.closeStatement(statement);
}
}
//27
public class func{
	public void execute(Connection connection){
                            statement = connection.createStatement();
                            statement.execute("INSERT INTO test_user (name) VALUES ('Resolvix')");
                            JdbcUtils.closeStatement(statement);
}
}
//28
public class func{
	public void testKeyAsColumnInMySQLMode(){
        Connection c = getConnection("compatibility;MODE=MYSQL");
        Statement stat = c.createStatement();
        stat.execute("drop table test");
}
}
//29
public class func{
	public void testConstraintAlterTable(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("alter table parent add column p2 varchar");
}
}
//30
public class func{
	public void createDatabase(){
        Connection conn = getConnection();
        conn.setAutoCommit(false);
        Statement st = conn.createStatement();
        st.execute("DROP TABLE T1");
}
}
//31
public class func{
	public void testViewParameters(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute(
                "create view test as select 0 value, 'x' name from dual");
}
}
//32
public class func{
	public void testReferenceableIndexUsage(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("drop table if exists a, b");
}
}
//33
public class func{
	public void testInsertRollback(){
        Connection conn = getConnection();
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        stmt.execute(CREATE_TABLE);
}
}
//34
public class func{
	public void executeSQL(Connection con,String sql){
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        return stmt.getResultSet();
}
}
//35
public class func{
	public void fillSimpleTable3(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + SIMPLE_TABLE3 + " VALUES(3, 4)");
}
}
//36
public class func{
	public void fillSimpleTable1(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + SIMPLE_TABLE1 + " VALUES(2, 5, 7)");
}
}
//37
public class func{
	public void doInConnection(java.sql.Connection connection){
                Statement statement = connection.createStatement();
                statement.execute("set constraints all deferred;");
}
}
//38
public class func{
	public void createTable(){
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        statement.execute("create table ACCOUNT ( ACC_ID INTEGER , ACC_FIRST_NAME VARCHAR(255), ACC_LAST_NAME VARCHAR(255), ACC_EMAIL VARCHAR(255)  )");
}
}
//39
public class func{
	public void runSql(ConnectionProvider provider,String sql){
    Connection connection = provider.getConnection();
      Statement statement = connection.createStatement();
      statement.execute(sql);
}
}
//40
public class func{
	public void testLobServerMemory(){
        deleteDb("lob");
        Connection conn = getConnection("lob");
        Statement stat = conn.createStatement();
        stat.execute("CREATE TABLE TEST(ID INT, DATA CLOB)");
}
}
//41
public class func{
	public void fillCustomersTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_CUSTOMERS7);
}
}
//42
public class func{
	public void execute(String sql){
        MyBatisComponent component = camelContext.getComponent("mybatis", MyBatisComponent.class);
        Connection con = component.getSqlSessionFactory().getConfiguration().getEnvironment().getDataSource().getConnection();
        Statement stm = con.createStatement();
        stm.execute(sql);
}
}
//43
public class func{
	public void setupDatabase(){
    basicDataSource.setDriverClassName(jdbcDriver.class.getName());
    basicDataSource.setUrl("jdbc:hsqldb:mem:db");
    basicDataSource.setUsername("sa");
    basicDataSource.setPassword("");
    Connection connection = basicDataSource.getConnection();
    Statement statement = connection.createStatement();
    statement.execute("create table licenses (license varchar(512))");
}
}
//44
public class func{
	public void fillTestTable5(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + TEST_TABLE5 + " VALUES(3, '4')");
}
}
//45
public class func{
	public void fillOrdersTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_ORDERS10);
}
}
//46
public class func{
	public void dropTable(Connection con,String table){
        Statement stmt = con.createStatement();
        stmt.execute("DROP TABLE " + table + " IF EXISTS;");
}
}
//47
public class func{
	public void initializeConnection(Connection connection){
    Statement stmt = connection.createStatement();
      stmt.execute("ALTER SESSION SET NLS_TIMESTAMP_FORMAT = 'SYYYY-MM-DD HH24:MI:SS'");
}
}
//48
public class func{
	public void fillFKStrictTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + FKSTRICT_TABLE
                + " VALUES(3, 1, '3')");
}
}
//49
public class func{
	public void removeTable(Connection conn,String name){
    Statement stat = conn.createStatement();
    stat.execute("DROP TABLE "+name);
}
}
//50
public class func{
	public void testReadOnlyConnect(){
        deleteDb("readonlyConnect");
        Connection conn = getConnection("readonlyConnect;OPEN_NEW=TRUE");
        Statement stat = conn.createStatement();
        stat.execute("insert into test select x from system_range(1, 11)");
}
}
//51
public class func{
	public void runStatement(VersionedPostgisDataStore dataStore,String sqlStatement){
            conn = dataStore.getConnection(Transaction.AUTO_COMMIT);
            st = conn.createStatement();
            st.execute(sqlStatement);
            JDBCUtils.close(conn, Transaction.AUTO_COMMIT, null);
}
}
//52
public class func{
	public void forceQuery(Connection c,String query){
            Statement stmt = c.createStatement();
            stmt.execute(query);
}
}
//53
public class func{
	public void fillSalesPeopleTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_SALESPEOPLE6);
}
}
//54
public class func{
	public void testSortedSelect(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("drop table test");
}
}
//55
public class func{
	public void setupDatabase(Connection con){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TABLE " + TABLE_INDEX
                + "(name text, statement text, category text)");
}
}
//56
public class func{
	public void testClearSyntaxException(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
            stat.execute("select t.x, t.x t.y from dual t");
}
}
//57
public class func{
	public void runConsistencyChecker(Connection con,String tableName){
    Statement stmt = con.createStatement();
    stmt.execute("values SYSCS_UTIL.SYSCS_CHECK_TABLE('APP',  'EMP')");
}
}
//58
public class func{
	public void truncate(){
      connection = SymfonyDbFactory.getInstance().createConnection();
      Statement statement = connection.createStatement();
      statement.execute(QUERY_TRUNCATE);
}
}
//59
public class func{
	public void setup(Connection conn){
    Statement stmt = conn.createStatement ();
      stmt.execute("delete from departments where department_id >= 300");
}
}
//60
public class func{
	public void tablesExist(Connection c){
        final Statement stmt = c.createStatement();
            stmt.execute("SELECT count(*) FROM COP_WORKFLOW_INSTANCE");
}
}
//61
public class func{
	public void initializeConnection(Connection cx){
        Statement st = cx.createStatement();
        st.execute("set lockmode session where level=mvcc");
}
}
//62
public class func{
	public void initDatabaseAccess(Connection con){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE ALIAS IF NOT EXISTS NOW_MILLIS FOR \"java.lang.System.currentTimeMillis\";");
}
}
//63
public class func{
	public void testQueryTimeout(){
        deleteDb("cancel");
        Connection conn = getConnection("cancel");
        Statement stat = conn.createStatement();
        stat.execute("SET QUERY_TIMEOUT 10");
        assertThrows(ErrorCode.STATEMENT_WAS_CANCELED, stat).
                executeQuery("SELECT MAX(RAND()) " +
                        "FROM SYSTEM_RANGE(1, 100000000)");
}
}
//64
public class func{
	public void executeSql(String sql,Connection connection){
      Statement statement = connection.createStatement();
      statement.execute(sql);
}
}
//65
public class func{
	public void dropAll(Connection conn){
        Statement stat = conn.createStatement();
        stat.execute("DROP SCHEMA IF EXISTS " + SCHEMA);
}
}
//66
public class func{
	public void fillParentTable(Connection conn){
        Statement statement = conn.createStatement();
        statement
                .execute("INSERT INTO " + PARENT_TABLE + " VALUES(3, 'test3')");
}
}
//67
public class func{
	public void work(Connection conn){
                    Statement stat = conn.createStatement();
                    stat.execute(
                            "insert into temp values(1)");
}
}
//68
public class func{
	public void testEmptyColumn(){
        deleteDb("view");
        Connection conn = getConnection("view");
        Statement stat = conn.createStatement();
        stat.execute("select * from test_view where a between 1 and 2 and b = 2");
}
}
//69
public class func{
	public void runSQL(String sql,Connection cx){
        Statement st = cx.createStatement();
            st.execute(sql);
            close(st);
}
}
//70
public class func{
	public void dropDataIdsTempTable(Connection connection,String dataIdsTableName){
        Statement stmt = connection.createStatement();
        stmt.execute(query);
}
}
//71
public class func{
	public void truncate(Connection con){
            st = con.createStatement();
            st.execute(sql);
            close(st);
}
}
//72
public class func{
	public void setupTestTableWithData(String tableName,Path dataFilePath,Connection hs2Conn){
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("create table " + tableName
        + " (under_col int comment 'the under column', value string)");
}
}
//73
public class func{
	public void dropTab1(final Connection c){
        final Statement stmt = c.createStatement();
            stmt.execute("drop table tab1");
}
}
//74
public class func{
	public void getExecutedStatementWhereLoginName(String loginName){
    Connection conn = getConnection();
    Statement stmt = conn.createStatement();
    stmt.execute("select * from users where "+COLUMN_LOGIN+"='"+loginName+"'");
}
}
//75
public class func{
	public void dumpTable(Connection conn){
    Statement stmt = conn.createStatement ();
    ResultSet rset = stmt.executeQuery ("select region_id, region_name from regions order by region_id");
    while (rset.next ())
      System.out.println (rset.getInt(1) + " " + rset.getString (2));
    stmt.execute ("delete from regions where region_id > 100");
}
}
//76
public class func{
	public void testNoBegin(){
        Connection connection = ConnectionHelper.getConnection(null);
            Statement st = connection.createStatement();
            String sql = getValidationQuery(connection);
            st.execute(sql);
}
}
