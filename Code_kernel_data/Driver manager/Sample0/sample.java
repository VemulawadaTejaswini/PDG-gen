//0
public class func{
	public void getConnection(){
        if (username == null && password == null) {
            log.log(Level.FINE, "connect to {0}", connectionUrl);
            conn = DriverManager.getConnection(connectionUrl);
        } else {
            log.log(Level.FINE, "connect to {0} with ''{1}''/''{2}''",
                    new Object[] { connectionUrl, username, password });
            conn = DriverManager.getConnection(connectionUrl, username, password);
        }
        return new DatabaseConnection(conn, schema);
}
}
//1
public class func{
	public void init(){
        DriverManager.registerDriver(new Driver());
        connCell = DriverManager.getConnection("jdbc:h2:~/" + NAMESPACE_CELL + ";DATABASE_TO_UPPER=FALSE", "sa", "");
        createTables(connCell, NAMESPACE_CELL, INPUT_TABLE, OUTPUT_CELLS_TABLE);
        deleteData(connCell, NAMESPACE_CELL, INPUT_TABLE, OUTPUT_CELLS_TABLE);
        connEntity = DriverManager.getConnection("jdbc:h2:~/" + NAMESPACE_ENTITY + ";DATABASE_TO_UPPER=FALSE", "sa", "");
        createTables(connEntity, NAMESPACE_ENTITY, INPUT_TABLE, OUTPUT_ENTITY_TABLE);
        deleteData(connEntity, NAMESPACE_ENTITY, INPUT_TABLE, OUTPUT_ENTITY_TABLE);
}
}
//2
public class func{
	public void testReadOnly(){
    Connection con = DriverManager.getConnection(TestUtil.getURL("readOnly", true), TestUtil.getUser(), TestUtil.getPassword());
    assertNotNull(con);
    assertTrue(con.isReadOnly());
    con.close();
    con = DriverManager.getConnection(TestUtil.getURL("readOnly", false), TestUtil.getUser(), TestUtil.getPassword());
    assertNotNull(con);
    assertFalse(con.isReadOnly());
    con.close();
    con = DriverManager.getConnection(TestUtil.getURL(), TestUtil.getUser(), TestUtil.getPassword());
    assertNotNull(con);
    assertFalse(con.isReadOnly());
    con.close();
}
}
//3
public class func{
	public void getConnection(){
    Class.forName(job.get(DBConfiguration.DRIVER_CLASS_PROPERTY));
    if(job.get(DBConfiguration.USERNAME_PROPERTY) == null) {
      return DriverManager.getConnection(job.get(DBConfiguration.URL_PROPERTY));
    } else {
      return DriverManager.getConnection(
          job.get(DBConfiguration.URL_PROPERTY), 
          job.get(DBConfiguration.USERNAME_PROPERTY), 
          job.get(DBConfiguration.PASSWORD_PROPERTY));
    }
}
}
//4
public class func{
	public void testReadOnly(){
        TestUtil.initDriver(); // Set up log levels, etc.
        Connection con = DriverManager.getConnection(TestUtil.getURL() + "&readOnly=true", TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertTrue(con.isReadOnly());
        con.close();
        con = DriverManager.getConnection(TestUtil.getURL() + "&readOnly=false", TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertFalse(con.isReadOnly());
        con.close();
        con = DriverManager.getConnection(TestUtil.getURL(), TestUtil.getUser(), TestUtil.getPassword());
        assertNotNull(con); 
        assertFalse(con.isReadOnly());
        con.close();
}
}
//5
public class func{
	public void testClearOtherConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn1);
      pooled.clearSpecialConnection(conn2);
      pooled.close();
}
}
//6
public class func{
	public void testSaveOtherConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn2);
      pooled.close();
}
}
//7
public class func{
	public void testCloseDelay(){
            conn = DriverManager.getConnection(url, user, password);
            conn.close();
        conn = DriverManager.getConnection(url, user, password);
        conn.createStatement().execute("SHUTDOWN");
}
}
//8
public class func{
	public void getConnection(String postfix){
      con1 = DriverManager.getConnection("jdbc:hive2://localhost:10000/" + postfix,
          "", "");
      con1 = DriverManager.getConnection("jdbc:hive2:///" + postfix, "", "");
    assertNotNull("Connection is null", con1);
    assertFalse("Connection should not be closed", con1.isClosed());
}
}
//9
public class func{
	public void getConnection(){
      if(jdbcUsername == null || jdbcUsername.length() == 0) {
        connection = DriverManager.getConnection(jdbcUrl);
      } else {
        connection = DriverManager.getConnection(jdbcUrl, jdbcUsername,
            jdbcPassword);
      }
      connection.setAutoCommit(false);
}
}
//10
public class func{
	public void connect(){
        m_c = (m_suser == null && m_spassword == null)
        ? DriverManager.getConnection(m_surl)
        : DriverManager.getConnection(m_surl, m_suser, m_spassword);         
        m_c.setAutoCommit(true);
}
}
//11
public class func{
	public void createConnection(DbPoolConfig singleConfig){
      if(MyStringUtil.isBlank(singleConfig.getUser())){
        con = DriverManager.getConnection(singleConfig.getUrl());
      }else{
        con = DriverManager.getConnection(singleConfig.getUrl(), singleConfig.getUser(), singleConfig.getPassword());
      }
      System.out.println("è��æ��æ��" + singleConfig.getName() + "å��å»�ä��ä��æ��ç��è��æ��");
      System.out.println("æ��æ��å��å»�ä��å��URLç��è��æ��: " + singleConfig.getUrl() + " user: " + singleConfig.getUser() + " pd: " + singleConfig.getPassword());
    return new Conn(con,singleConfig.getType());
}
}
//12
public class func{
	public void testLocalIndexCreationWithSaltingShouldFail(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null, null);
        Connection conn1 = DriverManager.getConnection(getUrl());
        Connection conn2 = DriverManager.getConnection(getUrl());
            conn2.createStatement().executeQuery("SELECT * FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME).next();
}
}
//13
public class func{
	public void testQueryOptimizerShouldSelectThePlanWithMoreNumberOfPKColumns(){
        Connection conn1 = DriverManager.getConnection(getUrl());
        Connection conn2 = DriverManager.getConnection(getUrl());
}
}
//14
public class func{
	public void getConnection(){
        if (url.startsWith("jdbc:hsqldb:")) {
            // Hsqldb requires a username, but doesn't support username as part
            // of the URL, durn it. Assume that the username is "sa".
            return DriverManager.getConnection(url, "sa", "");
        } else {
            return DriverManager.getConnection(url);
        }
}
}
//15
public class func{
	public void testLocalIndexTableRegionSplitPolicyAndSplitKeys(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null,"('e','i','o')");
        Connection conn1 = DriverManager.getConnection(getUrl());
        Connection conn2 = DriverManager.getConnection(getUrl());
}
}
//16
public class func{
	public void MergeDatabase(){
        mergedConn = DriverManager.getConnection("jdbc:h2:/home/cruise/projects/cruise-dbs/merged/db/h2db/cruise", "sa", null);
        printScalar(mergedConn, "SELECT MAX(id) FROM buildStateTransitions");
        fromConn = DriverManager.getConnection("jdbc:h2:/home/cruise/projects/cruise-dbs/mingle/db/h2db/cruise", "sa", null);
        printScalar(fromConn, "SELECT MAX(id) FROM buildStateTransitions");
}
}
//17
public class func{
	public void bad9(){
        Connection connection = DriverManager.getConnection("url", "user", PWD1);
        System.out.println(connection.getCatalog());
        connection = DriverManager.getConnection("url", "user", pass);
        System.out.println(connection.getCatalog());
}
}
//18
public class func{
	public void getConnection(){
      prop.setProperty("user", JDBCProfileStore.databaseUser(dbName));
      prop.setProperty("password", JDBCProfileStore.databasePassword(dbName));
      Class driverClass = Class.forName(JDBCProfileStore.driver(dbName, 0));
      DriverManager.registerDriver((java.sql.Driver) driverClass.newInstance());
      Connection conn = DriverManager.getConnection(JDBCProfileStore.databaseURL(dbName), prop);
}
}
//19
public class func{
	public void setup(){
    conn = DriverManager.getConnection(getUrl(), props);
    Statement stmt = conn.createStatement();
    stmt.execute("UPSERT INTO test VALUES ('FA')");    
    stmt.close();
}
}
//20
public class func{
	public void cleanUpDerbyDatabases(){
        conn = DriverManager.getConnection(dbURL);
        Statement stat = conn.createStatement();
        stat.executeUpdate("DROP TABLE books");
        stat.close();
}
}
//21
public class func{
	public void cleanUpDerbyDatabases(){
       conn = DriverManager.getConnection(dbURL);
       Statement stat = conn.createStatement();
       stat.executeUpdate("DROP TABLE newbooks");
       stat.close();
}
}
//22
public class func{
	public void cleanUpDerbyDatabases(){
      conn = DriverManager.getConnection(dbURL);
      Statement stat = conn.createStatement();
      stat.executeUpdate("DROP TABLE books");
      stat.close();
}
}
//23
public class func{
	public void CreateTable(){
      conn=DriverManager.getConnection("jdbc:sqlite"+FILENAME);
      Statement st = (Statement) conn.createStatement();
      st.executeUpdate("create table goods_tm(_id integer primary key autoincrement,goodsCategoryTid text,goodsid text,goodsname text,memberprice text,pictureurl text)");
}
}
//24
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(getUrl());
        conn.setAutoCommit(true);
        stmt = conn.createStatement();
        stmt.execute("CREATE TABLE without_nulls (" +
                        "id SMALLINT NOT NULL PRIMARY KEY, " +
                        "name VARCHAR) " +
                "VERSIONS = 1000, KEEP_DELETED_CELLS = false");
}
}
//25
public class func{
	public void init(Partition p){
        conn = DriverManager.getConnection(jdbcNeo4JDeepJobConfig.getConnectionUrl(),
                jdbcNeo4JDeepJobConfig.getUsername(),
                jdbcNeo4JDeepJobConfig.getPassword());
        Statement statement = conn.createStatement();
}
}
//26
public class func{
	public void main(String[] args){
    properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/dbconfig.properties"));
    DBConfig config = new DBConfig(properties);
    DriverManager.registerDriver((Driver)Class.forName(config.getDriverClass()).newInstance());
    Connection connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    DatabaseMetadata metadata = new DatabaseMetadata(connection);
    TableMetadata tableMetadata = metadata.getTableMetadata(null, null, "schema_version");
    for (ColumnMetadata columnMetadata : tableMetadata.getColumns().values()) {
      System.out.println(columnMetadata.getName() + " " + columnMetadata.getTypeName() + " " + columnMetadata.getTypeCode());
    }
}
}
//27
public class func{
	public void setUpBeforeClass(){
    conn = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mydb", "sa", "");
    stmt = conn.createStatement();
}
}
//28
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(url, "sa", "");
        stmt = conn.createStatement();
}
}
//29
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(url, "querydsl", "querydsl");
        stmt = conn.createStatement();
}
}
//30
public class func{
	public void initialize(){
      conn = DriverManager.getConnection(this.path, this.username,
          this.password);
      stmt = conn.createStatement();
}
}
//31
public class func{
	public void run(){
        conn = DriverManager.getConnection(
                "jdbc:h2:mem:", "sa", "");
        stat = conn.createStatement();
        stat.execute(
                "create table test(id int primary key, name varchar)");
}
}
//32
public class func{
	public void HigoQueryService(Map conf){
      conn = DriverManager.getConnection(url, "", "");
      stmt = conn.createStatement();
}
}
//33
public class func{
	public void getInstance(){
           conn = DriverManager.getConnection(GlobalVar.db, GlobalVar.username, GlobalVar.password);
           stmt=conn.createStatement();
}
}
//34
public class func{
	public void assertInvalidLDAPDrvMgrConnectionFails(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url, user, password).close();
}
}
//35
public class func{
	public void assertConnectionOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
        DriverManager.getConnection(url, user, password).close();
}
}
//36
public class func{
	public void testIsClosed(){
        assertFalse(conn.isClosed());
        conn.close();
        assertTrue(conn.isClosed());
        conn = DriverManager.getConnection("jdbc:sqlite:/" + dbFile.getPath());
        assertFalse(conn.isClosed());
        Statement st = conn.createStatement();
        st.execute("select * from zoo");
}
}
//37
public class func{
	public void setUp(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(dbName),
        System.getProperty("user.name"), "bar");
    stmt = hs2Conn.createStatement();
    stmt.execute("USE " + dbName);
}
}
//38
public class func{
	public void openConnect(){
      DriverManager.setLoginTimeout(waittime);
      conn = DriverManager.getConnection(url, this.prop);
      LOG.info(" get Connection ok: " + url);
      LOG.error(" get Connection failed: " + url);
}
}
//39
public class func{
	public void freeze(){
        log.debug(String.format("Freezing database [%s]", getUrl()));
            Statement s = DriverManager.getConnection(getUrl()).createStatement();
            s.executeUpdate("CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
            s.close();
}
}
//40
public class func{
	public void init(){
        properties.load(BarChartSample.class.getResourceAsStream("/config.properties"));
        Class.forName(properties.getProperty("db.driver"));
        connection = DriverManager.getConnection(
            properties.getProperty("db.url"),
            properties.getProperty("db.username"),
            properties.getProperty("db.password")
        );
}
}
//41
public class func{
	public void setup(){
        connection = DriverManager.getConnection(dbURL);
        connection.setAutoCommit(true);
        stmt = connection.createStatement();
}
}
//42
public class func{
	public void start(){
    String driver = dbConfig.getDriver();
    Class.forName(driver);
    String url = Utils.replaceParams(dbConfig.getDbURL(), metaData);
    Properties prop = Utils.replaceParams(dbConfig.getConfigProperty(), metaData);
    conn = DriverManager.getConnection(url, prop);
    conn.setAutoCommit(false);
}
}
//43
public class func{
	public void assertShutdownWOUPFail(String expectedSqlState,String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url2);
}
}
//44
public class func{
	public void assertConnectionWOUPOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
        DriverManager.getConnection(url2).close();
}
}
//45
public class func{
	public void assertConnectionFail(String dbName){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url);
}
}
//46
public class func{
	public void assertShutdownFail(String expectedSqlState,String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName) +
            DriverManager.getConnection(url, user, password);
}
}
//47
public class func{
	public void assertConnectionFail(String expectedSqlState,String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url, user, password);
}
}
//48
public class func{
	public void assertShutdownWOUPOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url, null);
}
}
//49
public class func{
	public void assertShutdownOK(String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName) +
        DriverManager.getConnection(url, user, password);
}
}
//50
public class func{
	public void assertConnectionWOUPFail(String expectedSqlState,String dbName,String user,String password){
        String url = TestConfiguration.getCurrent().getJDBCUrl(dbName);
            DriverManager.getConnection(url2);
}
}
//51
public class func{
	public void testFairSchedulerPrimaryQueueMapping(){
    miniHS2.setConfProperty(FairSchedulerConfiguration.ALLOCATION_FILE, "fair-scheduler-test.xml");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user2", "bar");
}
}
//52
public class func{
	public void testFairSchedulerSecondaryQueueMapping(){
    miniHS2.setConfProperty(FairSchedulerConfiguration.ALLOCATION_FILE, "fair-scheduler-test.xml");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user3", "bar");
}
}
//53
public class func{
	public void testQueueMappingCheckDisabled(){
    miniHS2.setConfProperty(
        HiveConf.ConfVars.HIVE_SERVER2_MAP_FAIR_SCHEDULER_QUEUE.varname, "false");
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user1", "bar");
}
}
//54
public class func{
	public void getConnection(String userName){
    return DriverManager.getConnection(miniHS2.getJdbcURL(), userName, "bar");
}
}
//55
public class func{
	public void testConnection(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL());
}
}
//56
public class func{
	public void testConnection(){
    hs2Conn = DriverManager.getConnection(
        miniHS2.getJdbcURL() + ";auth=noSasl", sessionUserName, "foo");
}
}
//57
public class func{
	public void getConnection(String userName){
    return DriverManager.getConnection(miniHS2.getJdbcURL());
}
}
//58
public class func{
	public void testFairSchedulerQueueMapping(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user1", "bar");
}
}
//59
public class func{
	public void testProxyAuth(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL("default",
        ";hive.server2.proxy.user=" + MiniHiveKdc.HIVE_TEST_USER_1));
    verifyProperty(SESSION_USER_NAME, MiniHiveKdc.HIVE_TEST_USER_1);
}
}
//60
public class func{
	public void thaw(){
        log.debug(String.format("Derby thawing database [%s]", getUrl()));
            Statement s = DriverManager.getConnection(getUrl()).createStatement();
            s.executeUpdate("CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
            s.close();
}
}
//61
public class func{
	public void connect(){
        String url = (String)getSession().getDatasourceLogin().getProperty("url");
        connection = DriverManager.getConnection(url, "aquser", "aquser");
        connection.setAutoCommit(false);
}
}
//62
public class func{
	public void openConnection(){
    Class.forName(SystemGlobals.getValue(ConfigKeys.DATABASE_DRIVER));
    return DriverManager.getConnection(SystemGlobals.getValue(ConfigKeys.DATABASE_JFORUM_URL));
}
}
//63
public class func{
	public void getConnection(String usr,String passwd){
      Class.forName(System.getProperty("driver")).newInstance();
      Connection con = DriverManager.getConnection(System
          .getProperty("database"), usr, passwd);
}
}
//64
public class func{
	public void testSimple2(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
//65
public class func{
	public void getConnectionWithMultiplyFunction(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
//66
public class func{
	public void testDifferentTypesSameFields(){
    Connection connection = DriverManager.getConnection("jdbc:optiq:");
        connection.unwrap(OptiqConnection.class);
    final SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
//67
public class func{
	public void getConnectionWithMultiplyFunction(){
        DriverManager.getConnection("jdbc:optiq:");
        connection.unwrap(OptiqConnection.class);
    SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
//68
public class func{
	public void testSimple(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
//69
public class func{
	public void setUp(){
    Connection connection = DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
//70
public class func{
	public void createConnection(){
                  DriverManager.getConnection("jdbc:optiq:");
                  connection.unwrap(OptiqConnection.class);
                  optiqConnection.getRootSchema();
}
}
//71
public class func{
	public void setUp(){
    Connection connection = DriverManager.getConnection("jdbc:optiq:");
    OptiqConnection optiqConnection = connection.unwrap(OptiqConnection.class);
    SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
//72
public class func{
	public void openConnect(String url,String user,String pass){
    DriverManager.setLoginTimeout(timeout);
    conn = DriverManager.getConnection(url, user, pass);
    LOG.debug(" get Connection ok: " + url);
}
}
//73
public class func{
	public void testGetSplitsWithSkipScanFilter(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        PhoenixConnection pconn = conn.unwrap(PhoenixConnection.class);
        PTable table = pconn.getMetaDataCache().getTable(new PTableKey(pconn.getTenantId(), TABLE_NAME));
        TableRef tableRef = new TableRef(table);
        List<HRegionLocation> regions = pconn.getQueryServices().getAllTableRegions(tableRef.getTable().getPhysicalName().getBytes());
        List<KeyRange> ranges = getSplits(tableRef, scan, regions, scanRanges);
        assertEquals("Unexpected number of splits: " + ranges.size(), expectedSplits.size(), ranges.size());
}
}
//74
public class func{
	public void getConnection(){
            int oldTimeout = DriverManager.getLoginTimeout();
            DriverManager.setLoginTimeout(m_timeout);
            Connection conn = DriverManager.getConnection(m_url, m_properties);
            DriverManager.setLoginTimeout(oldTimeout);
}
}
//75
public class func{
	public void SqliteHelper(File f){
    connection = DriverManager.getConnection("jdbc:sqlite:" + f.getAbsolutePath());
    statement = connection.createStatement();
    statement.setQueryTimeout(30);
}
}
//76
public class func{
	public void getConnection(){
    String password = PROPERTIES.getProperty("jdbc.password");
      Class.forName(driver);
      connection = DriverManager.getConnection(url, username, password);
}
}
//77
public class func{
	public void canConnect(String url,String username,String password){
        String type = getTypeForUrl( url );
            Class.forName( getDriver( type ) );
            Connection conn = DriverManager.getConnection( url, username, password );
}
}
//78
public class func{
	public void createConnection(){
              for (Map.Entry<String, String> entry : map.entrySet()) {
                info.setProperty(entry.getKey(), entry.getValue());
              }
              return (OptiqConnection) DriverManager.getConnection(
                  "jdbc:optiq:", info);
}
}
//79
public class func{
	public void createConnection(){
      for (Map.Entry<String, String> entry : map.entrySet()) {
        info.setProperty(entry.getKey(), entry.getValue());
      }
          DriverManager.getConnection("jdbc:calcite:", info);
}
}
//80
public class func{
	public void openConnection(){
        Class.forName(drvSettings.getClassName());
        openedConnection = DriverManager.getConnection(drvSettings.getJDBCUrl(), drvSettings.
            getAccessLogin(), drvSettings.getAccessPasswd());
}
}
//81
public class func{
	public void connect(final ConnectionInfo connectionInfo,final Boolean readOnly){
      Class.forName(jdbcInfo.getDriverClass());
      jdbcConnection = DriverManager.getConnection(jdbcInfo.getConnectionString(), jdbcInfo.getProperties());
}
}
//82
public class func{
	public void JdbcWriter(JdbcDeepJobConfig jdbcDeepJobConfig){
        Class.forName(jdbcDeepJobConfig.getDriverClass());
        this.conn = DriverManager.getConnection(jdbcDeepJobConfig.getConnectionUrl(),
                jdbcDeepJobConfig.getUsername(),
                jdbcDeepJobConfig.getPassword());
}
}
//83
public class func{
	public void testConnectionNeg(){
      String url = miniHS2.getJdbcURL().replaceAll(";principal.*", "");
      hs2Conn = DriverManager.getConnection(url);
}
}
//84
public class func{
	public void startConnection(){
            String url = getUrl();
                DriverManager.setLoginTimeout(getTimeout());
                con = DriverManager.getConnection(url , user, passwd);
                log(Level.ERROR, e, "Sql error for %s: %s" , url, e);
}
}
//85
public class func{
	public void createConnection(String user,String password){
    DriverManager.setLoginTimeout(0);
    Connection connection =  DriverManager.getConnection(url, user, password);
}
}
//86
public class func{
	public void connect(Configuration hiveconf){
      DriverManager.setLoginTimeout(3); // stats should not block
      conn = DriverManager.getConnection(connectionString);
}
}
//87
public class func{
	public void start(){
        DriverManager.setLoginTimeout(10);
        con = DriverManager.getConnection(url , user, passwd);
}
}
//88
public class func{
	public void getConnection(String driver,String url,Properties prop){
    DriverManager.setLoginTimeout(1);
    return DriverManager.getConnection(url, prop);
}
}
//89
public class func{
	public void setConnection(){
        String host = "jdbc:" + TARDIS.plugin.getConfig().getString("storage.mysql.url") + "?autoReconnect=true";
        String user = TARDIS.plugin.getConfig().getString("storage.mysql.user");
        String pass = TARDIS.plugin.getConfig().getString("storage.mysql.password");
            connection = DriverManager.getConnection(host, user, pass);
            connection.setAutoCommit(true);
}
}
//90
public class func{
	public void createConnection(String driverClassName,String url){
    connection = DriverManager.getConnection(url);
    connection.setAutoCommit(false);
}
}
//91
public class func{
	public void setConnection(String path){
        connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        connection.setAutoCommit(true);
}
}
//92
public class func{
	public void initDatabase(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        connection.setAutoCommit(false);
        createTweetTable(connection);
}
}
//93
public class func{
	public void createConnection(String driverClassName,String url){
    connection = DriverManager.getConnection(url);
    connection.setAutoCommit(false);
}
}
//94
public class func{
	public void createConnection(String driverClassName,String url){
    connection = DriverManager.getConnection(url);
    connection.setAutoCommit(false);
}
}
//95
public class func{
	public void loadData(long ts){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
}
}
//96
public class func{
	public void nextConnection(String url){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(nextTimestamp()));
        return DriverManager.getConnection(url, props);
}
}
//97
public class func{
	public void testGroupByCase(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 1));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            gbt.executeQuery(conn,GROUPBY3);
}
}
//98
public class func{
	public void init(){
    connection = DriverManager.getConnection("jdbc:h2:~/ehcache-demo-peeper", "sa", "");
    Statement statement = connection.createStatement();
      statement.execute("CREATE TABLE IF NOT EXISTS PEEPS (" +
          "id bigint auto_increment primary key," +
          "PEEP_TEXT VARCHAR(142) NOT NULL" +
          ")");
}
}
//99
public class func{
	public void getConnection0(boolean readonly){
        if (readonly) props.setProperty("hsqldb.files_readonly", "true");
        return DriverManager.getConnection(databaseUrl, props);
}
}
//100
public class func{
	public void MySqlClient(String hostport,String user,String pass){
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            stmt.execute("create table data(transaction_id bigint PRIMARY KEY AUTO_INCREMENT, content TEXT);");
}
}
//101
public class func{
	public void createDatabase(File dbHome,String user,String password){
    DriverManager.registerDriver(new Driver());
    DriverManager.getConnection(url).close();
}
}
//102
public class func{
	public void should_start_and_stop(){
      DriverManager.registerDriver(new Driver());
      DriverManager.getConnection(driverUrl).close();
}
}
//103
public class func{
	public void test_OpenCloseJDBC(){
      DriverManager.registerDriver(new Driver());
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost/TEST");
}
}
//104
public class func{
	public void connect(SQLiteConfig config){
            connection = DriverManager.getConnection("jdbc:sqlite:".concat(db), config.toProperties());
            statement = connection.createStatement();
            statement.setQueryTimeout(queryTimeout);
}
}
//105
public class func{
	public void shouldCreateConnectionWithDriverManagerAfterRegisteringDriver(){
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(validUrl, validProperties);
}
}
//106
public class func{
	public void JDBCAdapter(String url,String driverName,String user,String passwd){
            connection = DriverManager.getConnection(url, user, passwd);
            statement = connection.createStatement();
}
}
//107
public class func{
	public void setUp(){
        connection = DriverManager.getConnection(url, "sa", "");
        statement = connection.createStatement();
}
}
//108
public class func{
	public void destroyTable(){
        ConnectionQueryServices services = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class).getQueryServices();
        HBaseAdmin admin = services.getAdmin();
                admin.disableTable(PRODUCT_METRICS_NAME);
                admin.deleteTable(PRODUCT_METRICS_NAME);
}
}
//109
public class func{
	public void destroyIndexTable(){
        ConnectionQueryServices services = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class).getQueryServices();
        HBaseAdmin admin = services.getAdmin();
            admin.disableTable(INDEX_TABLE_FULL_NAME);
            admin.deleteTable(INDEX_TABLE_FULL_NAME);
}
}
//110
public class func{
	public void testWorkingWithDates(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        final JdbcDataContext dc = new JdbcDataContext(conn);
        final Schema schema = dc.getDefaultSchema();
        JdbcTestTemplates.createInsertAndUpdateDateTypes(dc, schema, "test_table");
}
}
//111
public class func{
	public void testWorkingWithDates(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:working_with_dates", USERNAME, PASSWORD);
        final JdbcDataContext dc = new JdbcDataContext(connection);
        final Schema schema = dc.getDefaultSchema();
        JdbcTestTemplates.createInsertAndUpdateDateTypes(dc, schema, "test_table");
}
}
//112
public class func{
	public void testSuccessfulConnect(){
        String user = getTestConfiguration().getUserName();
        String password = getTestConfiguration().getUserPassword();
        DriverManager.getConnection(url, user, password).close();
}
}
//113
public class func{
	public void testUnsuccessfulConnect(){
        String url = getTestConfiguration().getJDBCUrl("nonexistentDatabase");
        String user = getTestConfiguration().getUserName();
        String password = getTestConfiguration().getUserPassword();
            DriverManager.getConnection(url, user, password).close();
}
}
//114
public class func{
	public void createConnection(){
      con = DriverManager.getConnection("jdbc:mysql://"
          + "localhost" + "/" + "moparclassic",
          "root", "");
      statement = con.createStatement();
      statement.setEscapeProcessing(true);
}
}
//115
public class func{
	public void createConnection(){
      con = DriverManager.getConnection("jdbc:mysql://"
          + Config.MYSQL_HOST + "/" + Config.MYSQL_DB,
          Config.MYSQL_USER, Config.MYSQL_PASS);
      statement = con.createStatement();
      statement.setEscapeProcessing(true);
}
}
//116
public class func{
	public void testCreateInsertAndUpdate(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:" + getName(), USERNAME, PASSWORD);
        JdbcDataContext dc = new JdbcDataContext(connection);
        JdbcTestTemplates.simpleCreateInsertUpdateAndDrop(dc, "metamodel_test_simple");
}
}
//117
public class func{
	public void testCreateInsertAndUpdate(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcDataContext dc = new JdbcDataContext(conn);
        JdbcTestTemplates.simpleCreateInsertUpdateAndDrop(dc, "metamodel_test_simple");
}
}
//118
public class func{
	public void PersonMapStore(){
            con = DriverManager.getConnection("jdbc:hsqldb:mydatabase", "SA", "");
            con.createStatement().executeUpdate(
                    "create table if not exists person (id bigint not null, name varchar(45), primary key (id))");
}
}
//119
public class func{
	public void ConnectToDB(){
        con = DriverManager.getConnection(connectionname,dbUser,dbPassword);
        stmt= con.createStatement();  ///// changed 20.03.2013
        meta= this.con.getMetaData();
}
}
//120
public class func{
	public void testSelectColumnMoreThanOnce(){
        initEntityHistoryTableValues("abcd", getDefaultSplits("abcd"), date, 100l);
        ResultSet rs = DriverManager.getConnection(getUrl()).createStatement().executeQuery(query);
        assertTrue(rs.next());
        rs.getObject("NEW_VALUE");
        assertFalse(rs.next());
}
}
//121
public class func{
	public void testCompositePrimaryKeyCreation(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcDataContext dc = new JdbcDataContext(conn);
        JdbcTestTemplates.compositeKeyCreation(dc, "metamodel_test_composite_keys");
}
}
//122
public class func{
	public void testPerformance(){
            DriverManager.getConnection(url, user, password).close();
}
}
//123
public class func{
	public void testInvalidUpsertSelect(){
        PhoenixConnection conn = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class);
        conn.createStatement().execute("CREATE TABLE t1 (k1 INTEGER NOT NULL, k2 VARCHAR, v VARCHAR, CONSTRAINT pk PRIMARY KEY (k1,k2))");
        conn.createStatement().execute("CREATE TABLE t2 (k3 INTEGER NOT NULL, v VARCHAR, CONSTRAINT pk PRIMARY KEY (k3))");
        conn.createStatement().execute("CREATE VIEW v1 AS SELECT * FROM t1 WHERE k1 = 1");
            conn.createStatement().executeUpdate("UPSERT INTO v1 SELECT k3,'foo',v FROM t2");
}
}
//124
public class func{
	public void assertViewType(String[] views,ViewType viewType){
        PhoenixConnection conn = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class);
        conn.createStatement().execute(ct);
}
}
//125
public class func{
	public void createConnection(Properties p){
      Connection conn = DriverManager.getConnection(p.getProperty("db_uri").trim(), p.getProperty("db_user")
          .trim(), p.getProperty("db_password").trim());
}
}
//126
public class func{
	public void getConnection(Properties props){
        String pass = props.getProperty("db2.jdbc.password");
        return DriverManager.getConnection(url, user, pass);
}
}
//127
public class func{
	public void connectionOK(Properties props){
        String password = props.getProperty("password");
        Connection conn = DriverManager.getConnection("jdbc:mysql://prod.company.com/production", username, password);
}
}
//128
public class func{
	public void run(){
                    Connection conn = DriverManager.getConnection(getUrl());
                    ResultSet tablesRs = conn.getMetaData().getTables(null, null, null, null);
                    while (tablesRs.next()) {
                        // Just make sure we run over all records
                    }
                    tablesRs.close();
}
}
//129
public class func{
	public void testToDate_CustomTimeZoneViaQueryServicesAndCustomFormat(){
        Connection customTimeZoneConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(
                -ONE_HOUR_IN_MILLIS,
                callToDateFunction(
                        customTimeZoneConn, "TO_DATE('1970-01-01', 'yyyy-MM-dd')").getTime());
}
}
//130
public class func{
	public void testToDate_CustomTimeZoneViaQueryServices(){
        Connection customTimeZoneConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(
                -ONE_HOUR_IN_MILLIS,
                callToDateFunction(customTimeZoneConn, "TO_DATE('1970-01-01 00:00:00.000')").getTime());
}
}
//131
public class func{
	public void testByteInstrAscendingFilter(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", "abcdefghijkl","fgh");
        testInstrFilter(conn, queryToExecute,"abcdefghijkl");
}
}
//132
public class func{
	public void testMultiByteInstrDecending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", "AɚɦFGH","ɚɦ");
        testInstr(conn, queryToExecute, 2);
}
}
//133
public class func{
	public void createConnection(int port,String user,String password,String schema){
                (Connection) DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + schema,
                                                         user,
                                                         password);
}
}
//134
public class func{
	public void doConnCommitInt(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.commit();
}
}
//135
public class func{
	public void doConnCommitInt(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                conn.commit();
}
}
//136
public class func{
	public void doConnCommit(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                conn.commit();
}
}
//137
public class func{
	public void doConnCommit(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.commit();
}
}
//138
public class func{
	public void test_o(){
        Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
        com.mysql.jdbc.Connection mysqlConn = (com.mysql.jdbc.Connection) conn;
}
}
//139
public class func{
	public void newInstance(File dir){
    String path = dir.getAbsolutePath() + "/index";
    Connection connection = DriverManager
        .getConnection(url, user, password);
    return new ConnectionManager(connection);
}
}
//140
public class func{
	public void getMySqlConnection(){
          connection = (Connection) DriverManager.getConnection(m_url, m_username, m_password);       
}
}
//141
public class func{
	public void setUp(){
        _connection = DriverManager.getConnection("jdbc:derby:jar:(" + dbFile.getAbsolutePath()
                + ")derby_testdb;territory=en");
}
}
//142
public class func{
	public void setUpCubeConn(){
        cubeConnection = DriverManager.getConnection("jdbc:calcite:model=" + olapTmp.getAbsolutePath(), props);
}
}
//143
public class func{
	public void getConnectionInstance(){
      connection = (Connection) DriverManager.getConnection(url, user, pwd);
}
}
//144
public class func{
	public void getConnection(boolean tenantSpecific,String tenantId){
            checkNotNull(tenantId);
            return createTenantConnection(tenantId);
        return DriverManager.getConnection(getUrl());
}
}
//145
public class func{
	public void testSingleByteInstrDescendingNoString(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", "abcde fghijkl","lmn");
        testInstr(conn, queryToExecute, 0);
}
}
//146
public class func{
	public void nextConnection(String url){
        return DriverManager.getConnection(getUrl(), props);
}
}
//147
public class func{
	public void testForcingRowKeyOrderNotUseRoundRobinIterator(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        testForceRowKeyOrder(conn, true);
}
}
//148
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(getUrl());
}
}
//149
public class func{
	public void testLpadZeroPadding(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//150
public class func{
	public void testDefaultFill(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//151
public class func{
	public void testEmptyFillExpr(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//152
public class func{
	public void connect(){
        conn = DriverManager.getConnection(connectionString);
        conn.setAutoCommit(false);
        conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        updatePreviewReplyStmt = conn.prepareStatement(updatePreviewReplyQuery);
}
}
//153
public class func{
	public void getConnection(final String url,final String user,final String password){
            LOG.info("Connecting to " + url + " with no credentials");
            return DriverManager.getConnection(url);
}
}
//154
public class func{
	public void DesktopSQLiteDBLogStorage(String dbName){
            LOG.info("Connecting to db by url: {}", dbURL);
            connection = DriverManager.getConnection(dbURL);
}
}
//155
public class func{
	public void testConnectionMySqlDriver(){
        String fullConnectionStr = String.format("jdbc:google:mysql://%s?user=%s&password=%s", connectionStr, user, pw);
        Connection conn = DriverManager.getConnection(fullConnectionStr);
}
}
//156
public class func{
	public void init(){
                DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/?%s", host, port, params), user, password);
        DefaultDatabaseLoader defaultDatabaseLoader = new DefaultDatabaseLoader(jdbcConnection, dbName, dbPentahoDW);
        defaultDatabaseLoader.createDatabase();
        defaultDatabaseLoader.populateDatabase();
}
}
//157
public class func{
	public void getConnection(String url,String user,String password){
        Connection jdbcConnection = DriverManager.getConnection(url, user, password);
        return new DatabaseConnection(jdbcConnection);
}
}
//158
public class func{
	public void createConnection(){
    Connection jdbcConnection = DriverManager.getConnection(
        PropertiesUtil.JDBC_URL, PropertiesUtil.JDBC_USERNAME,
        PropertiesUtil.JDBC_PASSWD);
    return new DatabaseConnection(jdbcConnection);
}
}
//159
public class func{
	public void loadDataFromFile(String fileName){
            jdbcConnection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + databaseName + "?sessionVariables=FOREIGN_KEY_CHECKS=0", user, password);
            IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);
            databaseConnection.getConfig().setProperty(DatabaseConfig.FEATURE_CASE_SENSITIVE_TABLE_NAMES, Boolean.TRUE);
}
}
//160
public class func{
	public void testBadConnectionAttribute(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/badAttribute;upgrade=notValidValue");
}
}
//161
public class func{
	public void testDatabaseNotFound(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/testbase", p);
}
}
//162
public class func{
	public void testNoUserOrPassword(){
      Connection c = DriverManager.getConnection(
          "jdbc:derby://" + getTestConfiguration().getHostName()
                    + ":" + getTestConfiguration().getPort() + "/testbase");
}
}
//163
public class func{
	public void connectToDB(DBStrings dbstrings){
        Connection conn = DriverManager.getConnection(url,
                dbstrings.getUsername(), dbstrings.getPassword());
}
}
//164
public class func{
	public void connectToDB(DBStrings dbstrings){
        return DriverManager.getConnection(url,
                dbstrings.getUsername(), dbstrings.getPassword());
}
}
//165
public class func{
	public void connectToDB(DBStrings dbstrings){
        Connection conn = DriverManager.getConnection (url,
                           dbstrings.getUsername(), dbstrings.getPassword());
}
}
//166
public class func{
	public void testNullDividend(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, SMALL_VALUE);
}
}
//167
public class func{
	public void testDividend(long dividend){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, dividend);
}
}
//168
public class func{
	public void getConnection(Properties props,Configuration conf){
        String url = getConnectionUrl(props, conf);
        LOG.info("Creating connection with the jdbc url: " + url);
        PropertiesUtil.extractProperties(props, conf);
        return DriverManager.getConnection(url, props);
}
}
//169
public class func{
	public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        for (double d : new double[] { 0.0, 1.0, 123.1234}) {
            testSignedNumberSpec(conn, d);
        }
}
}
//170
public class func{
	public void getConnection(){
    conn = DriverManager.getConnection(QueryUtil.getUrl(this.conf.get(SERVER_NAME)), props).unwrap(PhoenixConnection.class);
    conn.setAutoCommit(false);
    setup(conn);
}
}
//171
public class func{
	public void main(String[] args){
      Connection conn = DriverManager.getConnection("jdbc:mdbtools:" + filename);
      ResultSet rset = conn.getMetaData().getTables(null,null,null,null);
      while (rset.next())
        System.out.println(rset.getString("table_name"));
      rset.close();
}
}
//172
public class func{
	public void open(){
      conn = DriverManager.getConnection(url, username, password);
      LOG.error(url+","+username+","+password,e);
      LOG.error(url+","+username+","+password,e);
}
}
//173
public class func{
	public void testNestedConnection(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.saveSpecialConnection(conn1);
      pooled.releaseConnection(conn1);
      pooled.close();
}
}
//174
public class func{
	public void testReleaseUnknown(){
    JdbcPooledConnectionSource pooled = new JdbcPooledConnectionSource(DEFAULT_DATABASE_URL);
          new JdbcDatabaseConnection(DriverManager.getConnection(DEFAULT_DATABASE_URL));
      pooled.releaseConnection(conn1);
      pooled.close();
}
}
//175
public class func{
	public void init(){
                create = DSL.using(DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD), JOOQ_DIALECT);
}
}
//176
public class func{
	public void getConnection(){
        return DriverManager.getConnection((String) url, username, password);
}
}
//177
public class func{
	public void getConnection(){
            String passwd = (String) p.get("password");
            return DriverManager.getConnection(url, user, passwd);
}
}
//178
public class func{
	public void setUp(){
      con = DriverManager.getConnection("jdbc:derby:memory:" + dbName);
      context = DSL.using(con, SQLDialect.DERBY);
      jinq = JinqJooqContext.using(context, App.APP);
}
}
//179
public class func{
	public void beforeClass(){
    ctx = DSL.using(DriverManager.getConnection("jdbc:h2:mem:test"), SQLDialect.H2);
    ctx.execute("INSERT INTO orders values (456, 789, '123 Main Street', 'SF', null)");
}
}
//180
public class func{
	public void setIsolationJDBC(int isolation){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
        c.setTransactionIsolation(isolation);
}
}
//181
public class func{
	public void getConnection(String driverClass,String url,String userName,String password){
        logger.info("Connecting to database on " + url);
        conn = DriverManager.getConnection(url, userName, password);
}
}
//182
public class func{
	public void doConnectionSetIsolation(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
}
}
//183
public class func{
	public void connect(String url,String login,String password){
            logger.info("Connecting: url=" + url + ", userID=" + login);
            return new Connection(DriverManager.getConnection(url, login, password));
            throw new DatabaseException("Failed to connect: url=" + url + ", userID=" + login, e);
}
}
//184
public class func{
	public void testLpadZeroOutputStringLength(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//185
public class func{
	public void testLpadTrucate(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//186
public class func{
	public void testMultiByteReverseAscending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", s);
        testReverse(conn, s);
}
}
//187
public class func{
	public void nextConnection(){
        conn = DriverManager.getConnection(getUrl(), props);
}
}
//188
public class func{
	public void testLpadFillLengthGreaterThanPadLength(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//189
public class func{
	public void test(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//190
public class func{
	public void setUpTestCase(){
        DriverManager.getDriver(
            "jdbc:proxy:org.apache.drill.jdbc.Driver:jdbc:drill:zk=local" );
        DriverManager.getConnection( "jdbc:proxy::jdbc:drill:zk=local" );
}
}
//191
public class func{
	public void doConnectionSetIsolation(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.setTransactionIsolation(conn.TRANSACTION_SERIALIZABLE);
}
}
//192
public class func{
	public void createConnection(String dbname,String host,String port,String user,String passwd,boolean profileSQL){
        String url = makeURL(dbname, host, port, user, passwd, profileSQL);
        connection = DriverManager.getConnection(url);
        logger.info("opening ConnectionURL: " + url);
}
}
//193
public class func{
	public void newInstance(String url){
        Connection connection = DriverManager.getConnection(url);
        return new Sql(connection);
}
}
//194
public class func{
	public void runTest(){
        Driver d2 = DriverManager.getDriver("jdbc:h2v1_1:mem:test");
        connection = DriverManager.getConnection("jdbc:h2:mem:test");
        DriverManager.deregisterDriver(d2);
}
}
//195
public class func{
	public void DB(String connURL,Properties connProperties){
        _conn = DriverManager.getConnection(connURL, connProperties);
        _driverName = DriverManager.getDriver(connURL).getClass().getName();
}
}
//196
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(getUrl());
        converter = new StringToArrayConverter(conn, ":", PVarchar.INSTANCE);
}
}
//197
public class func{
	public void setUp(){
        upsertListener = mock(CsvUpsertExecutor.UpsertListener.class);
        conn = DriverManager.getConnection(getUrl());
        upsertExecutor = new CsvUpsertExecutor(conn, columnInfoList, preparedStatement, upsertListener, ":");
}
}
//198
public class func{
	public void createTenantConnection(String tenantId){
        return DriverManager.getConnection(getUrl(), props);
}
}
//199
public class func{
	public void newInstance(String url,String user,String password){
        Connection connection = DriverManager.getConnection(url, user, password);
        return new Sql(connection);
}
}
//200
public class func{
	public void newInstance(String url,Properties properties){
        Connection connection = DriverManager.getConnection(url, properties);
        return new Sql(connection);
}
}
//201
public class func{
	public void initTable(){
        testConn = DriverManager.getConnection(getUrl(), props);
        assertEquals(Consistency.STRONG, ((PhoenixConnection)testConn).getConsistency());
}
}
//202
public class func{
	public void createConnection(String catalog){
        String url = format("jdbc:presto://%s/%s", server.getAddress(), catalog);
        return DriverManager.getConnection(url, "test", null);
}
}
//203
public class func{
	public void createConnection(){
        String url = format("jdbc:presto://%s", server.getAddress());
        return DriverManager.getConnection(url, "test", null);
}
}
//204
public class func{
	public void getConnection(String url,String user,String password){
      return DriverManager.getConnection(url, user, password);
      LOG.error("%s, %s, %s", e, url, user, password);
}
}
//205
public class func{
	public void getDiskDatabase(String path){
      return DriverManager.getConnection("jdbc:h2:" + path);
      throw new RuntimeException(
          "Could not connect to database: " + path, e);
}
}
//206
public class func{
	public void MatchDatabase(String dbUrl,String dbUser,String dbPassword){
      conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
      throw new RuntimeException("Could not get database connection to " + dbUrl, e);
}
}
//207
public class func{
	public void openConnection(){
            connection = DriverManager.getConnection("jdbc:sqlite:" + sqliteFile.getAbsolutePath());
            throw new RuntimeException("Error reading sqlite file " + sqliteFile.getAbsolutePath(), e);
}
}
//208
public class func{
	public void shutdownDerby(int nDatabaseType){
        log.debug("about to shutdonw DerbyDB with: {}", sURL);
        DriverManager.getConnection(sURL);
}
}
//209
public class func{
	public void createConnection(String catalog,String schema){
        String url = format("jdbc:presto://%s/%s/%s", server.getAddress(), catalog, schema);
        return DriverManager.getConnection(url, "test", null);
}
}
//210
public class func{
	public void open(){
      String url = "jdbc:sqlserver://" + getHostname() + ":" + getPort() + ";databaseName=" + getDatabase() + ";user=" + getUsername() + ";password=" + getPassword();
        this.connection = DriverManager.getConnection(url, getUsername(), getPassword());
}
}
//211
public class func{
	public void open(){
      String url = "jdbc:derby:net://" + getHostname() + ":" + getPort() + "/" + getDatabase();
        connection = DriverManager.getConnection(url, getUsername(), getPassword());
}
}
//212
public class func{
	public void JdbcNeo4JWriter(JdbcNeo4JDeepJobConfig config){
        this.conn = DriverManager.getConnection(jdbcNeo4JDeepJobConfig.getConnectionUrl(),
                jdbcNeo4JDeepJobConfig.getUsername(),
                jdbcNeo4JDeepJobConfig.getPassword());
}
}
//213
public class func{
	public void createConnection(final int index){
        final DatabasePlatform dbPlatform = DatabasePlatformFactory.FACTORY.getDatabasePlatform();
        return DriverManager.getConnection(
                dbPlatform.getUrl(index),
                dbPlatform.getUser(),
                dbPlatform.getPassword());
}
}
//214
public class func{
	public void getConnection(final DatabasePlatform dbPlatform){
        return DriverManager.getConnection(
                dbPlatform.getUrl(0),
                dbPlatform.getUser(),
                dbPlatform.getPassword());
}
}
//215
public class func{
	public void setUp(){
        Properties props = ConnectionUtil.getProperties();
        connection = DriverManager.getConnection(ConnectionUtil.getURL(), props);
}
}
//216
public class func{
	public void setUp(){
        Properties props = ConnectionUtil.getProperties();
        connection = DriverManager.getConnection(ConnectionUtil.getURL(), props);
}
}
//217
public class func{
	public void _failOver(String serverHost,int serverPort,String databasePath,String dbSubPath,String replicatedDb){
        util.DEBUG(connectionURL);
            Connection conn = DriverManager.getConnection(connectionURL);
            util.DEBUG("failOver Unexpectedly connected as: " + connectionURL);
}
}
//218
public class func{
	public void getConnection(String serverHost,int serverPort,String databasePath,String dbSubPath,String replicatedDb){
        String connectionURL = serverURL( db, serverHost, serverPort );
        util.DEBUG(connectionURL);
        return DriverManager.getConnection(connectionURL);
}
}
//219
public class func{
	public void open(String driver,String url,Properties props){
            Connection connection = DriverManager.getConnection(url, props);
            ConnectionsAccess.attach(name, connection, url);
            throw new InitException("Failed to connect to JDBC URL: " + url, e);
}
}
//220
public class func{
	public void open(String driver,String url,String user,String password){
            Connection connection = DriverManager.getConnection(url, user, password);
            ConnectionsAccess.attach(name, connection, url);
            throw new InitException("Failed to connect to JDBC URL: " + url, e);
}
}
//221
public class func{
	public void getConnection(){
      return DriverManager.getConnection(SystemGlobals.getValue(ConfigKeys.DATABASE_CONNECTION_STRING));
}
}
//222
public class func{
	public void getConnection(String connectionUrl,String username,String passwd){
        String url = connectionUrl.substring(connectionUrl.indexOf("//") + 2);
        connectionUrl = "jdbc:sqlite:" + url.substring(0, url.length() - 2);
        return DriverManager.getConnection(connectionUrl, username, passwd);
}
}
//223
public class func{
	public void connectWithOldVersion(String url,Properties info){
        url = "jdbc:h2v1_1:" + url.substring("jdbc:h2:".length()) +
        return DriverManager.getConnection(url, info);
}
}
//224
public class func{
	public void createConnectionWithUserPassword(Properties props){
        return DriverManager.getConnection(getURL(), props);
}
}
//225
public class func{
	public void createConnection(){
            DriverManager.getConnection(
                getURL(),
                info);
}
}
//226
public class func{
	public void creatConnection(){
      con = DriverManager.getConnection(url, userName, password); // ������»�����url��Ö��Լ���������������Ӳ���
      con.setAutoCommit(true); // ����ϵͳ���Զ����Ӳ���
}
}
//227
public class func{
	public void creatConnection(){
      con = DriverManager.getConnection(url);
      con.setAutoCommit(true);
}
}
//228
public class func{
	public void createOracleConnection(){
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost/orcl",
                "glowroot", "glowroot");
        insertRecords(connection);
}
}
//229
public class func{
	public void createPostgresConnection(){
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/glowroot",
                "glowroot", "glowroot");
        insertRecords(connection, "bytea", "text");
}
}
//230
public class func{
	public void doConnRollback(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.rollback();
}
}
//231
public class func{
	public void getConnection(){
            connection = DriverManager.getConnection(url);
            connection.setReadOnly(true);
}
}
//232
public class func{
	public void getConnection(){
            connection = DriverManager.getConnection(url, userName, (password != null) ? password : "");
            connection.setReadOnly(true);
}
}
//233
public class func{
	public void setUp(){
        firstConnection = DriverManager.getConnection(getConnectionURL());
}
}
//234
public class func{
	public void setUp(){
        secondConnection = DriverManager.getConnection(getConnectionURL());
}
}
//235
public class func{
	public void nextConnection(){
            this.conn =  DriverManager.getConnection(getUrl() + ';' + TENANT_ID_ATTRIB + '=' + "tenant1", props);
}
}
//236
public class func{
	public void nextConnection(){
            conn = DriverManager.getConnection(getUrl(), props);
}
}
//237
public class func{
	public void getConnection(){
        return DriverManager.getConnection(dbUrl(), user, password);
}
}
//238
public class func{
	public void getConnection(){
        return DriverManager.getConnection(dbUrl());
}
}
//239
public class func{
	public void testNullInputStringSB(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//240
public class func{
	public void testArrayPrependFunctionNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTableWithVarArray(conn, "VARCHAR", s, null);
        PhoenixArray array2 = (PhoenixArray) conn.createArrayOf("VARCHAR", s2);
}
}
//241
public class func{
	public void testCharOfSizeOn(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:char_of_size_one", USERNAME, PASSWORD);
        JdbcTestTemplates.meaningOfOneSizeChar(connection);
}
}
//242
public class func{
	public void testInterpretationOfNull(){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:interpretation_of_null", USERNAME, PASSWORD);
        JdbcTestTemplates.interpretationOfNulls(conn);
}
}
//243
public class func{
	public void getConnection(){
    LOG.debug("Metric store connection url: " + url);
      return DriverManager.getConnection(url);
}
}
//244
public class func{
	public void doConnRollback(){
                Connection conn = DriverManager.getConnection("jdbc:default:connection");
                conn.rollback();
}
}
//245
public class func{
	public void getSQLiteConnection(){
        conn = DriverManager.getConnection("jdbc:sqlite:/" + dbFile.getPath());
        assertNotNull("Connection created ", conn);
}
}
//246
public class func{
	public void makeConnection(){
    String connUri = buildConnectionUri(tajoMasterAddress.getHostName(), tajoMasterAddress.getPort(),
        DEFAULT_DATABASE_NAME);
    Connection conn = DriverManager.getConnection(connUri);
    assertTrue(conn.isValid(100));
}
}
//247
public class func{
	public void setUpBeforeClass(){
        conn = DriverManager.getConnection(getUrl());
}
}
//248
public class func{
	public void setUpBeforeClass(){
        conn = DriverManager.getConnection(getUrl());
}
}
//249
public class func{
	public void testSetConsistencyInURL(){
            Connection conn = DriverManager.getConnection(getUrl() + PhoenixRuntime.JDBC_PROTOCOL_TERMINATOR +
                    "Consistency=TIMELINE", props);
            assertEquals(Consistency.TIMELINE, ((PhoenixConnection)conn).getConsistency());
}
}
//250
public class func{
	public void testGetConnection(){
    DriverManager.getConnection("jdbc:taju://" + tajoMasterAddress.getHostName() + ":" + tajoMasterAddress.getPort()
      + "/default");
}
}
//251
public class func{
	public void testInterpretationOfNull(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.interpretationOfNulls(conn);
}
}
//252
public class func{
	public void testCharOfSizeOne(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.meaningOfOneSizeChar(conn);
}
}
//253
public class func{
	public void openConnection(){
        Connection conn = DriverManager.getConnection(url, user, password);
        connections.add(conn);
}
}
//254
public class func{
	public void testUnsignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        testUnsignedNumberSpec(conn, 123.1234, 1);
}
}
//255
public class func{
	public void testGroupByScanWithRegexpSubstr(){
        Connection conn = DriverManager.getConnection(getUrl());
        testGroupByScanWithRegexpSubstr(conn, null, "Report");
}
}
//256
public class func{
	public void openConnection(){
        Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
        connections.add(conn);
}
}
//257
public class func{
	public void initTable(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
}
}
//258
public class func{
	public void getConnection(){
    Connection conn = DriverManager.getConnection(props
        .getProperty("jdbc.url")+"?useUnicode=true&characterEncoding=utf-8", props.getProperty("jdbc.user"), props
        .getProperty("jdbc.password"));
}
}
//259
public class func{
	public void openDB(Properties props){
        return DriverManager.getConnection(getURL(), props);
}
}
//260
public class func{
	public void openPrivilegedDB(){
        return DriverManager.getConnection(getURL(), properties);
}
}
//261
public class func{
	public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        testSignedNumberSpec(conn, -123.1234);
}
}
//262
public class func{
	public void connectMysql(){
        String password = props.getProperty(PWD); //"";
        connection = DriverManager.getConnection(url+dbName,userName,password);
}
}
//263
public class func{
	public void createConnection(){
    return DriverManager.getConnection(getDSN(), getUserName(), getPassword());
}
}
//264
public class func{
	public void createConnection(){
            return DriverManager.getConnection(getUrl(), getUsername(), getPassword());
}
}
//265
public class func{
	public void getConnection(String connStr,String user,String pass){
                return new ConnectionProxy(new StateFactory(), DriverManager.getConnection(connStr));
}
}
//266
public class func{
	public void getConnection(String dbType,String url,String dbSchema,String username,String password){
    return new ConnectionProxy(dbType, DriverManager.getConnection(url.trim(), username.trim(), StringUtils.trim(password)), StringUtils.trim(dbSchema));
}
}
//267
public class func{
	public void getResultSet(){
    m_statement = DriverManager.getConnection("jdbc:default:connection")
        .prepareStatement("SELECT * FROM propertyExample()");
    return m_statement.executeQuery();
}
}
//268
public class func{
	public void getResultSet(){
    m_statement = DriverManager.getConnection("jdbc:default:connection")
        .createStatement();
    return m_statement.executeQuery("SELECT * FROM pg_user WHERE "
        + m_filter);
}
}
//269
public class func{
	public void openSlaveDB(){
        return DriverManager.getConnection(TestUtil.getURL(getSlaveServer(), getSlavePort()), props);
}
}
//270
public class func{
	public void testConnect(){
                Connection c = jDriver.connect(getConnectionURL(), null);
                assertFalse(c.isClosed());
                DriverManager.getConnection(getConnectionURL());
}
}
//271
public class func{
	public void testCatalogsLocal(){
    final Connection connection = DriverManager.getConnection(
        "jdbc:avatica:remote:factory=" + LJS);
}
}
//272
public class func{
	public void getConnection(){
        return DriverManager.getConnection(HSQL_CONNECTION_URL, HSQL_USER, "");
}
}
//273
public class func{
	public void getHiveConnection(){
        return DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hive", "");
}
}
//274
public class func{
	public void connect(){
            log.info("Connecting to " + jdbcUrl);
            connect = DriverManager.getConnection(jdbcUrl);
            statement = connect.createStatement();
}
}
//275
public class func{
	public void getcon(){
      con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db_Cars","sa","");
}
}
//276
public class func{
	public void connect(){
        String dbPath = "jdbc:sqlite:" + dbFile.getAbsolutePath();
        return DriverManager.getConnection(dbPath);
}
}
//277
public class func{
	public void setup(){
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root");
}
}
//278
public class func{
	public void createConnection(){
        Connection connection = DriverManager.getConnection("jdbc:postgresql://" + m_dbSvr + ":5432/"+m_dbName, m_dbUser, m_dbPass);
}
}
//279
public class func{
	public void call(){
                    DriverManager.getConnection(url);
}
}
//280
public class func{
	public void reinitSequences(){
            conn = DriverManager.getConnection(jdbcUrl, user, password);
}
}
//281
public class func{
	public void createConnection(String dbURL){
      conn = DriverManager.getConnection(dbURL);
}
}
//282
public class func{
	public void run(){
                    DriverManager.getConnection(url, user, pw);
}
}
//283
public class func{
	public void createConnection(){
            Connection conn = DriverManager.getConnection(dbServer, dbLogin, dbPassword);
}
}
//284
public class func{
	public void testInvalidPrimaryKeyDecl(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//285
public class func{
	public void testExecute(){
        remover.setConnection(DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD));
        remover.setUpgradeDir(UPGRADE_DIR);
        remover.execute();
}
}
//286
public class func{
	public void getConnection(final String url,final String username,final String password,final String driverClass){
    return DriverManager.getConnection(url, username, password);
}
}
//287
public class func{
	public void getConnection(){
            return DriverManager.getConnection(_jdbcUrl);
}
}
//288
public class func{
	public void checkConnectionExists(String url,String user,String password){
    String  driver = JDBC.getDriverString(url);
      JDBC.loadDriver(driver);
      DriverManager.getConnection(url, user, password);
}
}
//289
public class func{
	public void simpleOpenCon(String conString,Properties properties){
    Connection con = DriverManager.getConnection(conString, properties);
}
}
//290
public class func{
	public void makeConnection(){
        Connection conn = DriverManager.getConnection(workConf.getDBConnection(),
                workConf.getDBUsername(),
                workConf.getDBPassword());
        Catalog.setSeparator(conn);
}
}
//291
public class func{
	public void init(){
    connection = DriverManager.getConnection(URL);
}
}
//292
public class func{
	public void getConnection(){
        return DriverManager.getConnection(connectionString);
}
}
//293
public class func{
	public void newConnection(){
      return DriverManager.getConnection("jdbc:derby:memory:derbyDB;territory=en_US");
}
}
//294
public class func{
	public void newConnection(){
      return DriverManager.getConnection("jdbc:hsqldb:mem:.");
}
}
//295
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, user, password);
}
}
//296
public class func{
	public void getConnection(){
    return DriverManager.getConnection(dbLocation + "?host="+host+ "&user="
      + dbusername + "&password=" + dbpassword + "&characterEncoding=utf-8&"
      + "useUnicode=true");
}
}
//297
public class func{
	public void createDB(String dbName){
      return DriverManager.getConnection("jdbc:derby:"+dbName+";create=true");
}
}
//298
public class func{
	public void getConnection(String url,String user,String password){
      connection = DriverManager.getConnection(url, user, password);
}
}
//299
public class func{
	public void getDerbyConnection(String sDatabaseName){
    Connection connection = DriverManager.getConnection(databaseURL + sDatabaseName);
}
}
//300
public class func{
	public void getConnection(){
    final Connection c = DriverManager.getConnection( proxoolAlias );
}
}
//301
public class func{
	public void connect(String database,String host,int port,String user,String pass){
            return DriverManager.getConnection(
                "jdbc:mysql://"+host+":"+port+"/"+database+"?useUnicode=true&characterEncoding=UTF8", user, pass);
}
}
//302
public class func{
	public void getConnection(){
        this.jdbcMasterConnection = DriverManager.getConnection("jdbc:mysql://" + masterServer + "/" + dbRelease, dbUser, dbPassword);
}
}
//303
public class func{
	public void shutdownDb(String jvmVersion,String serverHost,int serverPort,String dbPath,String replicatedDb,String clientHost){
            DriverManager.getConnection(dbURL+";shutdown=true");
}
}
//304
public class func{
	public void doshutdown(){
      conn = DriverManager.getConnection(dbURL +
        ";shutdown=true");
}
}
//305
public class func{
	public void getConnection(){
            return DriverManager.getConnection(m_url, m_properties);
}
}
//306
public class func{
	public void tearDown(){
                DriverManager.getConnection( "jdbc:derby:sessions;shutdown=true" );
}
}
//307
public class func{
	public void isro(){
        DriverManager.getConnection(
        "jdbc:default:connection").getMetaData().isReadOnly();
}
}
//308
public class func{
	public void connect(){
            connection = DriverManager.getConnection(protocol + ":" + Mediator.getRuntimeDirectory() + database + ";create=true;"
                    + "user=" + username + ";password=" + password + "");
}
}
//309
public class func{
	public void getConnection(String driverClass,String url,String username,String password){
            return DriverManager.getConnection(url, username, password);
}
}
//310
public class func{
	public void openConnection(){
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/"+dbName, dbUser, dbPassword );
}
}
//311
public class func{
	public void testCSVUpsertWithAllColumn(){
        PhoenixConnection conn = DriverManager.getConnection(getUrl()).unwrap(PhoenixConnection.class);
}
}
//312
public class func{
	public void buildConnection(){
        return DriverManager.getConnection(url, username, password);
}
}
//313
public class func{
	public void getConnection(){
            return DriverManager.getConnection(url, dbProperties);
}
}
//314
public class func{
	public void getConnection(String dbName){
      return DriverManager.getConnection(DBCP_DRIVER + dbName);
}
}
//315
public class func{
	public void init(){
    final String dataDirName = ApplicationSettings.instance().getApplicationDataDirectory().getAbsolutePath();
    connection = DriverManager.getConnection("jdbc:h2:" + dataDirName + "/baralga;DB_CLOSE_ON_EXIT=FALSE", "baralga-user", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
}
}
//316
public class func{
	public void connect(){
        return DriverManager.getConnection(getJdbcUrl(), getJdbcUsername(), getJdbcPassword());
}
}
//317
public class func{
	public void getConnection(){
    conn = DriverManager.getConnection("jdbc:derby:"+DB_NAME+";create=true",SCHEMA_NAME, this.getDbkey());
}
}
//318
public class func{
	public void getJdbcConnection(){
    return DriverManager.getConnection(getProperty(TAJO_JDBC_URI));
}
}
//319
public class func{
	public void makeConnection(String jdbcURL){
            return DriverManager.getConnection(jdbcURL,
                                               Access.getUser(),
                                               Access.getPassword()) ;
}
}
//320
public class func{
	public void buildConnection(){
        return DriverManager.getConnection(url, username, password);
}
}
//321
public class func{
	public void newCleanup(){
            DriverManager.getConnection(
                "jdbc:default:connection");
        return new LucidDbTestCleanup(conn);
}
}
//322
public class func{
	public void ImportConfigurationJDBC(String url,String user,String password,String table){
        this.connection = DriverManager.getConnection(url, user, password);
}
}
//323
public class func{
	public void ImportConfigurationJDBC(String url,String table){
        this.connection = DriverManager.getConnection(url);
}
}
//324
public class func{
	public void connect(String jdbcUrl,String usr,String psw){
        return DriverManager.getConnection(jdbcUrl, usr, psw);
}
}
//325
public class func{
	public void getConnection(){
              _conn = DriverManager.getConnection (url, username, password);
}
}
//326
public class func{
	public void tearDown(){
            DriverManager.getConnection("jdbc:derby:target/testdb;shutdown=true");
}
}
//327
public class func{
	public void getConnection(){
    return DriverManager.getConnection(jdbcUrl, "", "");
}
}
//328
public class func{
	public void shutdownDerby(){
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//329
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, user, passwd);
}
}
//330
public class func{
	public void getConnection(){
    Connection c = DriverManager.getConnection(
     "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=c:/tech97.mdb"
      );
}
}
//331
public class func{
	public void startH2(){
        DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:test;USER=foo;PASSWORD=bar");
}
}
//332
public class func{
	public void connectToDatabase(String databasePropertiesFile){
        connection = DriverManager.getConnection(url, username, password);
}
}
//333
public class func{
	public void buildConnection(){
        return DriverManager.getConnection(url, username, password);
}
}
//334
public class func{
	public void connect(String connectionString,Properties info){
        currentConnection = DriverManager.getConnection(connectionString, info);
}
}
//335
public class func{
	public void getConnection(){
        return DriverManager.getConnection(connectionString);
}
}
//336
public class func{
	public void getConnection(String url){
    ConnectionInfo info = new ConnectionInfo(url);
    return DriverManager.getConnection(info.getUri(), info.getProperties());
}
}
//337
public class func{
	public void createConnectionWithUserPassword(){
        return DriverManager.getConnection(
            getURL(), USER, PASSWORD);
}
}
//338
public class func{
	public void getJdbcConnection(String url,Properties props){
        return DriverManager.getConnection(url, props);
}
}
//339
public class func{
	public void connectClients(String URL){
        Connection conn = DriverManager.getConnection(URL);
}
}
//340
public class func{
	public void getConnection(String url,String login,String password){
        return DriverManager.getConnection(url, login, password);
}
}
//341
public class func{
	public void main(String[] args){
        Connection conn = DriverManager.getConnection(url, "querydsl", "querydsl");
}
}
//342
public class func{
	public void prepareDerbyDatabase(){
    conn = DriverManager.getConnection(dbURL);
}
}
//343
public class func{
	public void establishConnection(){
      dbConn = DriverManager.getConnection(dbURL);
}
}
//344
public class func{
	public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        testSignedNumberSpec(conn, -123.1234, -1);
}
}
//345
public class func{
	public void DbAdapter(){
    mConn = DriverManager.getConnection("jdbc:sqlite:assets/pokemon.db");
    mStat = mConn.createStatement();
}
}
//346
public class func{
	public void getConnection(){
    return DriverManager.getConnection(this.getJDBCUrl());
}
}
//347
public class func{
	public void testNoFactory(){
        DriverManager.getConnection("jdbc:avatica:remote:");
}
}
//348
public class func{
	public void ljs(){
    return DriverManager.getConnection("jdbc:avatica:remote:factory=" + QRJS);
}
}
//349
public class func{
	public void mjs(){
    return DriverManager.getConnection("jdbc:avatica:remote:factory=" + MJS);
}
}
//350
public class func{
	public void getConn(String dbHost,String dbPort,String dbName,String dbUser,String dbPassword){
    Connection conn = DriverManager.getConnection(connStr);
}
}
//351
public class func{
	public void getMasterConnection(){
            String url = masterURL(replicatedDb);
            masterConn = DriverManager.getConnection(url);
}
}
//352
public class func{
	public void initJdbc(){
            conn = (PGConnection) DriverManager.getConnection("jdbc:pgsql://" + this.getHost() + ":" + this.getPort() + "/" + this.getDatabase(), this.getUser(), this.getPass());
}
}
//353
public class func{
	public void openConnection(String connString){
        Connection conn = DriverManager.getConnection( connString );
}
}
//354
public class func{
	public void connection(){
            return DriverManager.getConnection("jdbc:h2:~/jool-test", "sa", "");
}
}
//355
public class func{
	public void HsqlDB(String uri,String loadFile){
        this.connection = DriverManager.getConnection(uri, "sa", "");
}
}
//356
public class func{
	public void DBWrapper(){
    connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
}
}
//357
public class func{
	public void setUpConnection(){
    connection = DriverManager.getConnection( "jdbc:drill:zk=local" );
}
}
//358
public class func{
	public void initDatabase(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        createTweetTable(connection);
        populateTweetTable(connection);
}
}
//359
public class func{
	public void getConnection(){
            return DriverManager.getConnection(_connectionUrl);
}
}
//360
public class func{
	public void getDerbyConnection(){
        return DriverManager.getConnection( "jdbc:default:connection" );
}
}
//361
public class func{
	public void testSingleByteInstrAscending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", "abcdefghijkl","fgh");
        testInstr(conn, queryToExecute, 6);
}
}
//362
public class func{
	public void initDatabase(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        createTweetTable(connection);
        populateTweetTable(connection);
}
}
//363
public class func{
	public void initConenction(){
            return DriverManager.getConnection("jdbc:phoenix");
}
}
//364
public class func{
	public void newConnection(){
            return dataSource != null ? dataSource.getConnection() : DriverManager.getConnection(connectionURL, username,
                                                                                                 password);
}
}
//365
public class func{
	public void getConnection(String connectionUrl,String username,String passwd){
        return DriverManager.getConnection(connectionUrl, username, passwd);
}
}
//366
public class func{
	public void ArchiveVTI(String archiveSuffix){
        _connection = DriverManager.getConnection( "jdbc:default:connection" );
}
}
//367
public class func{
	public void getSlaveConnection(){
        this.jdbcSlaveConnection = DriverManager.getConnection("jdbc:mysql://" + slaveServer + "/" + dbRelease, dbUser, dbPassword);
}
}
//368
public class func{
	public void connect(String url,String dbuser,String dbpass){
        conn = DriverManager.getConnection(url, dbuser, dbpass);
}
}
//369
public class func{
	public void setupDatabase(){
        connection = DriverManager.getConnection("jdbc:h2:mem:simplepush", "sa", "");
}
}
//370
public class func{
	public void getConnectionHSQLDB(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j", "sa", "");
}
}
//371
public class func{
	public void getConnectionInternal(String url,String user,String password){
        return DriverManager.getConnection(url, user, password);
}
}
//372
public class func{
	public void testDifferentOperators(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.differentOperatorsTest(conn);
}
}
//373
public class func{
	public void getConnection(){
        String url = "jdbc:h2:" + getBaseDir() + "/halt";
        return DriverManager.getConnection(url, "sa", "sa");
}
}
//374
public class func{
	public void HsqlDB(String uri,String databaseDriver,String loadFile){
        this.connection = DriverManager.getConnection(uri, "sa", "");
}
}
//375
public class func{
	public void getSqlSessionFactoryJavaConfig(){
    Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:xmlextref", "sa", "");
    initDb(c);
}
}
//376
public class func{
	public void open(String host,String dbname,String user,String passwd){
      Connection con = DriverManager.getConnection(dburl, user, passwd);
      setConnection(con);
}
}
//377
public class func{
	public void getFirebird(){
        return DriverManager.getConnection(url, "querydsl", "querydsl");
}
}
//378
public class func{
	public void getConnection(){
        return DriverManager.getConnection(driverProperties.getDatabaseConnectionUrl());
}
}
//379
public class func{
	public void getConnection(){
        return DriverManager.getConnection(this.getUrl(), properties);
}
}
//380
public class func{
	public void canon(){
    return DriverManager.getConnection(CONNECTION_SPEC.url,
        CONNECTION_SPEC.username, CONNECTION_SPEC.password);
}
}
//381
public class func{
	public void getConnection(String tenantId,boolean testEnabled){
        return DriverManager.getConnection(url, props);
}
}
//382
public class func{
	public void testUngroupedAggregation(){
        Connection conn = DriverManager.getConnection(url, TEST_PROPERTIES);
}
}
//383
public class func{
	public void singleSpan(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        sink.initForTesting(conn);
                createAndFlush(sink, traceid, Span.ROOT_SPAN_ID, 10, "root", 12, 13,
                    "host-name.value", "test annotation for a span");
        validateTraces(Collections.singletonList(record), conn, traceid);
}
}
//384
public class func{
	public void connectJdbc(String driverName,String url,String login,String password){
      result = DriverManager.getConnection(url, login, password);
}
}
//385
public class func{
	public void createConnection(MolgenisOptions options){
      Connection conn = DriverManager.getConnection(options.db_uri.trim(), options.db_user.trim(),
          options.db_password.trim());
}
}
//386
public class func{
	public void getConnectionWithProps(Properties props){
        return DriverManager.getConnection(dbUrl, props);
}
}
//387
public class func{
	public void getConnection(){
    return DriverManager.getConnection(this.url, this.user, this.pass);
}
}
//388
public class func{
	public void getConnection(final String username,final String password){
  return DriverManager.getConnection(url, username, password);
}
}
//389
public class func{
	public void JDBCPyramidIO(String driverClassName,String dbUrl){
    _connection = DriverManager.getConnection(dbUrl);
}
}
//390
public class func{
	public void geH2Connection(){
        return DriverManager.getConnection("jdbc:h2:mem:my_test;", "sa", "");
}
}
//391
public class func{
	public void openConnection(){
    connection = DriverManager.getConnection("jdbc:mysql://"
        + this.hostname + ":" + this.port + "/" + this.database,
        this.user, this.password);
}
}
//392
public class func{
	public void createConnection(){
        return DriverManager.getConnection("jdbc:h2:~/todo", "sa", "");
}
}
//393
public class func{
	public void USQL(String databaseFilename){
      connection = DriverManager.getConnection("jdbc:sqlite:"+databaseFilename);
}
}
//394
public class func{
	public void getConnection(String url,String user,String password){
        return DriverManager.getConnection(url, user, password);
}
}
//395
public class func{
	public void getConnection(String url,String user,String pass){
        getLog().debug("[getConnection] url='" + url + "' user='" + user + "' pass='******'");
        return DriverManager.getConnection(url, user, pass);
}
}
//396
public class func{
	public void testAutomaticConversionWhenInsertingString(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:auto_conversion", USERNAME, PASSWORD);
        JdbcTestTemplates.automaticConversionWhenInsertingString(connection);
}
}
//397
public class func{
	public void MySQL(){
      return DriverManager.getConnection(db, user, pass);
}
}
//398
public class func{
	public void closeConnection(Connection conn){
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//399
public class func{
	public void HsqlBackend(int siteId){
            final String connectionURL = "jdbc:hsqldb:mem:x" + String.valueOf(siteId);
            dbconn = DriverManager.getConnection(connectionURL, "sa", "");
            dbconn.setAutoCommit(true);
            dbconn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
}
}
//400
public class func{
	public void createConnection(){
        return DriverManager.getConnection("jdbc:h2:mem:", "sa", "");
}
}
//401
public class func{
	public void getHsqldbConnection(String user,WebgoatContext context){
    String url = context.getDatabaseConnectionString().replaceAll("\\$\\{USER\\}", user);
    return DriverManager.getConnection(url, "sa", "");
}
}
//402
public class func{
	public void makeConnection(){
      con = DriverManager.getConnection(url, uid, pwd);
}
}
//403
public class func{
	public void start(){
        connection = DriverManager.getConnection(url);
}
}
//404
public class func{
	public void connect(){
        con = DriverManager.getConnection("jdbc:sqlite:plugins/AuthMe/" + database + ".db");
}
}
//405
public class func{
	public void ConnectionPool(){
                    conn = DriverManager.getConnection(url, username, password);
                    pool.add(conn);
}
}
//406
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(getUrl(), props);
}
}
//407
public class func{
	public void connectDatabase(){
            _con = DriverManager.getConnection(_url, _userName, _password);
}
}
//408
public class func{
	public void testConnection(String driver,String url,String user,String password){
            conn = DriverManager.getConnection(url, user, password);
}
}
//409
public class func{
	public void openConnection(File path,String name,boolean createIfNotExists){
                sb.append(";ifexists=true");
            return DriverManager.getConnection(sb.toString(), "SA", "");
}
}
//410
public class func{
	public void open(String url){
        return DriverManager.getConnection(url, "sa", "");
}
}
//411
public class func{
	public void open(){
        connection = DriverManager.getConnection("jdbc:h2:file:" + getFile().getAbsolutePath());
}
}
//412
public class func{
	public void shutdown(){
        DriverManager.getConnection(shutdownDatabaseCommand);
}
}
//413
public class func{
	public void getConnection(){
    return DriverManager.getConnection(databaseUrl);
}
}
//414
public class func{
	public void PostgresConnector(String connectionURL,String driverName,String username,String password){
      db = DriverManager.getConnection(connectionURL, username, password);
}
}
//415
public class func{
	public void getConnection(String url){
    Connection conn = DriverManager.getConnection(getUrl(), props);
}
}
//416
public class func{
	public void getConnection(){
            return DriverManager.getConnection(getJdbcConnectionURL(), props);
}
}
//417
public class func{
	public void dump(String fileName){
        Connection jdbcConnection = DriverManager.getConnection(getUrl(databaseName, port, params), user, password);
}
}
//418
public class func{
	public void testCustomAuthentication(){
      DriverManager.getConnection(url, "wronguser", "pwd");
}
}
//419
public class func{
	public void createConnection(boolean autocommit){
        conn = DriverManager.getConnection(this.getConnectionString(), this.getUsername(), this.getPassword());    
}
}
//420
public class func{
	public void getConnection(){
        return DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
}
}
//421
public class func{
	public void doCreateConnection(String driver,String url,String username,String password){
        return DriverManager.getConnection(url, username, password);
}
}
//422
public class func{
	public void doCreateConnection(String driver,String url,String username,String password){
        return DriverManager.getConnection(url, username, password);
}
}
//423
public class func{
	public void initTable(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
}
}
//424
public class func{
	public void open(String dbServer,String port,String databaseName,String dbUserName,String dbPassword){
            conn = DriverManager.getConnection(connectionString, dbUserName, dbPassword);
}
}
//425
public class func{
	public void shutdownEmbeddedDB(String username,String password){
            DriverManager.getConnection("jdbc:derby:;shutdown=true",
                                        username,
                                        password);
}
}
//426
public class func{
	public void openConnection(){
                return DriverManager.getConnection(url);
}
}
//427
public class func{
	public void testSignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//428
public class func{
	public void createSQLConnection(){
       con = DriverManager.getConnection("jdbc:hsqldb:file:target/test-classes/hsql/test_dj_db", "sa", "");
}
}
//429
public class func{
	public void getConnection(){
      return DriverManager.getConnection(url,username,password);
}
}
//430
public class func{
	public void getMySqlConnection(){
      conn = DriverManager.getConnection("jdbc:mysql://" + host + "/"
          + database + "?" + "user=" + login + "&" + "password="
          + password);
}
}
//431
public class func{
	public void getCon(String url,String user,String passwd){
    Connection theCon = DriverManager.getConnection(url, user, passwd);
}
}
//432
public class func{
	public void getConnectionWithTracingFrequency(Properties props,Tracing.Frequency frequency){
        return DriverManager.getConnection(getUrl(), props);
}
}
//433
public class func{
	public void setUp(){
        zkQuorum = "localhost:" + hbaseTestUtil.getZkCluster().getClientPort();
        conn = DriverManager.getConnection(PhoenixRuntime.JDBC_PROTOCOL
                + PhoenixRuntime.JDBC_PROTOCOL_SEPARATOR + zkQuorum);
}
}
//434
public class func{
	public void test_0(){
        DriverManager.getConnection(url, user, password);
}
}
//435
public class func{
	public void testShutdown(){
            DriverManager.getConnection(
                    "jdbc:derby:memory:/tmp/myDB;shutdown=true");
}
}
//436
public class func{
	public void getCon(){
            con = DriverManager.getConnection(url);
}
}
//437
public class func{
	public void getConnection(){
     con=DriverManager.getConnection(uri,user,password);           //��������
}
}
//438
public class func{
	public void getConnection(String driver,String url,String username,String pwd){
    localConn = DriverManager.getConnection(url, username, pwd);
}
}
//439
public class func{
	public void getConnection(String driver,String connectString){
    localConn = DriverManager.getConnection(connectString);
}
}
//440
public class func{
	public void getTransactionIsolationJDBC(){
        return DriverManager.getConnection("jdbc:default:connection").
                getTransactionIsolation();
}
}
//441
public class func{
	public void QueryExecuter(String connectionString,String username,String password){
        connection = DriverManager.getConnection(connectionString, username, password);
}
}
//442
public class func{
	public void nextGenericConnection(){
        conn = DriverManager.getConnection(getUrl(), props);    
}
}
//443
public class func{
	public void connect(){
        this.con = DriverManager.getConnection("jdbc:sqlite:plugins/AuthMe/" + database + ".db");
}
}
//444
public class func{
	public void getConnection(String user,String password,String url){
            cx = DriverManager.getConnection(url);
}
}
//445
public class func{
	public void createConnection(String driver,String url,String user,String password){
        return DriverManager.getConnection(url, user, password);
}
}
//446
public class func{
	public void getConnectionByUrl(String dbPoolUrl){
        return DriverManager.getConnection(dbPoolUrl);
}
}
//447
public class func{
	public void _getSQLConnection(){
            return DriverManager.getConnection(db + "?autoReconnect=true&user=" + username + "&password=" + password);
}
}
//448
public class func{
	public void openConnection(){
            conn = DriverManager.getConnection( "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName, dbUser, dbPassword );
}
}
//449
public class func{
	public void tearDownCluster(){
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//450
public class func{
	public void setUpH2Conn(){
        h2Connection = DriverManager.getConnection("jdbc:h2:mem:db" + (h2InstanceCount++), "sa", "");
        H2Database h2DB = new H2Database(h2Connection, config);
        h2DB.loadAllTables(joinType);
}
}
//451
public class func{
	public void setUp(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        createPersonTable(connection);
        populatePersonTable(connection);
}
}
//452
public class func{
	public void getNestedConnection(){
        return DriverManager.getConnection( "jdbc:default:connection" );
}
}
//453
public class func{
	public void testEncodeNullInput(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//454
public class func{
	public void Condb(){
      con = DriverManager.getConnection(url);
}
}
//455
public class func{
	public void connDB(){
       conn = DriverManager.getConnection(URL,user,pwd);
}
}
//456
public class func{
	public void main(String[] args){
        c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432", "jon", "jon");
}
}
//457
public class func{
	public void openConnections(){
        m_conn = DriverManager.getConnection(m_jdbc, m_user, m_password);
        m_conn.setAutoCommit(false);
}
}
//458
public class func{
	public void createSqlServerConnection(){
                DriverManager.getConnection("jdbc:sqlserver://localhost", "sa", "password");
        insertRecords(connection);
}
}
//459
public class func{
	public void initialize(){
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
}
}
//460
public class func{
	public void newSpecialSQliteIndex(){
    conn = DriverManager.getConnection("jdbc:sqlite::memory:");
}
}
//461
public class func{
	public void createConnection(IString connectString){
      Connection conn = DriverManager.getConnection(connectString.getValue());
}
}
//462
public class func{
	public void testNoSCNInConnectionProps(){
        DriverManager.getConnection(getUrl(), props);
}
}
//463
public class func{
	public void setUpConnection(){
    connection = DriverManager.getConnection( "jdbc:drill:zk=local" );
}
}
//464
public class func{
	public void getConnection(ConnectionInfo info){
        return DriverManager.getConnection(info.getUrl(), info.getParamsAsProperties());
}
}
//465
public class func{
	public void beforeClass(){
    start = Main.start(new String[]{Factory.class.getName()});
    final int port = start.getPort();
    remoteConnection = DriverManager.getConnection(
        "jdbc:avatica:remote:url=http://localhost:" + port);
}
}
//466
public class func{
	public void getConnection(){
        Connection conn = DriverManager.getConnection(url, "sa", "");
}
}
//467
public class func{
	public void testConnectWithHash(){
        String pwd = StringUtils.convertBytesToHex(
                SHA256.getKeyPasswordHash("SA", "sa".toCharArray()));
        Connection conn2 = DriverManager.getConnection(
                "jdbc:h2:mem:test;PASSWORD_HASH=TRUE", "sa", pwd);
}
}
//468
public class func{
	public void testConnectWithHash(){
        Connection conn = DriverManager.getConnection(
                "jdbc:h2:mem:test", "sa", "sa");
}
}
//469
public class func{
	public void getConnection(){
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_service_book", "root", "root");
}
}
//470
public class func{
	public void openSQLiteConn(){
      conn=DriverManager.getConnection("jdbc:sqlite:"+FILENAME);    
}
}
//471
public class func{
	public void createConnection(boolean autocommit){
    conn = DriverManager.getConnection(this.getConnectionString()+";create=true",this.getSchemaName(), this.getPassword());   
}
}
//472
public class func{
	public void getTenantConnection(String tenantId){
        return DriverManager.getConnection(getUrl(), tenantProps);
}
}
//473
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, prop);
}
}
//474
public class func{
	public void getConnection(Properties info){
    return DriverManager.getConnection(url, info);
}
}
//475
public class func{
	public void prepareDatabase(String sqlFile,DbImportConfiguration dbImportConfiguration){
    Statement stmt = DriverManager.getConnection(dbImportConfiguration.getUrl()).createStatement();
}
}
//476
public class func{
	public void prepareConnection(String dbURL){
    dbConn = DriverManager.getConnection(dbURL);
}
}
//477
public class func{
	public void test(){
            DriverManager.getConnection("jdbc:teiid:Parts@invalidConfig.properties;version=1"); //$NON-NLS-1$
}
}
//478
public class func{
	public void createConnection(){
      return DriverManager.getConnection(connectionURL, user, password);
}
}
//479
public class func{
	public void getConnection(){
      conn = DriverManager.getConnection(CONN_URL, USERNAME, PASSWORD);
}
}
//480
public class func{
	public void createConnection(String dbSchema){
        return DriverManager.getConnection(cloudDbUrl, properties.getProperty("db."+dbSchema+".username"),
                properties.getProperty("db."+dbSchema+".password"));
}
}
//481
public class func{
	public void getConnection(){
            return DriverManager.getConnection(url(), user(), password());
}
}
//482
public class func{
	public void getConnection(){
            Connection conn = DriverManager.getConnection(url, user, password);
            setAutoCommit(conn, autoCommit);
            setIsolation(conn, isolation);
}
}
//483
public class func{
	public void getConnection(String url,String username,String password){
        return DriverManager.getConnection(url, username, password);
}
}
//484
public class func{
	public void startServer(){
        conn = DriverManager.getConnection("jdbc:voltdb://localhost:21212", "defaultadmin", "admin");
}
}
//485
public class func{
	public void getConnection(final String username,final String password){
        return DriverManager.getConnection(jdbcUrl, username, password);
}
}
//486
public class func{
	public void TableBuilder(){
    m_conn = DriverManager.getConnection("jdbc:postgresql://localhost/thhal", "thhal", null);
}
}
//487
public class func{
	public void run(){
      Connection connection = DriverManager.getConnection(url, user, password);
        availableConnections.add(new ConnectionData(connection));
}
}
//488
public class func{
	public void openClient(){
    connection = DriverManager.getConnection("jdbc:drill:zk=local", null);
}
}
//489
public class func{
	public void getConnection(){
    return DriverManager.getConnection(this.url, username, password);
}
}
//490
public class func{
	public void getDefaultConnection(){
    return DriverManager.getConnection( "jdbc:default:connection" );
}
}
//491
public class func{
	public void finalize(){
                DriverManager.getConnection("jdbc:derby:;shutdown=true").close();
}
}
//492
public class func{
	public void SQLValidator(){
    session=org.h2.engine.Engine.getInstance().createSession(connInfo);
    this.connection = DriverManager.getConnection(URL,properties);
}
}
//493
public class func{
	public void getConnection(){
            return DriverManager.getConnection(jdbcUrl);
}
}
//494
public class func{
	public void checkTableExists(String url,String user,String password,String table){
      conn = DriverManager.getConnection(url, user, password);
      return checkTableExists(conn, table);
      DBUtil.closeConnection(log, conn);
}
}
//495
public class func{
	public void getDatabaseConnection(){
      return DriverManager.getConnection(JdbcStudentService.URL, 
                        JdbcStudentService.USERNAME, 
                        JdbcStudentService.PASSWORD);
}
}
//496
public class func{
	public void createConnection(){
            DriverManager.getConnection(
                getURL(),
                new Properties());
}
}
//497
public class func{
	public void setUp(){
        Connection conn = DriverManager.getConnection(create_url);
}
}
//498
public class func{
	public void initializeJdbcDriverAndConnection(ScrutineerCommandLineOptions options){
            return DriverManager.getConnection(options.jdbcURL, options.jdbcUser, options.jdbcPassword);
}
}
//499
public class func{
	public void dropDatabase(){
      DriverManager.getConnection(DROP_DERBY_URL);
}
}
//500
public class func{
	public void getSlaveConnection(){
            String url = slaveURL(replicatedDb);
            slaveConn = DriverManager.getConnection(url);
}
}
//501
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, properties);
}
}
//502
public class func{
	public void connect(){
        return DriverManager.getConnection("jdbc:derby:scan;create=true");
}
}
//503
public class func{
	public void createConnection(){
            return DriverManager.getConnection("jdbc:h2:data/data", "sa", "");
}
}
//504
public class func{
	public void getConnection(final String sqlDBUrl,final String sqlUser,final String sqlPassword){
    con = DriverManager.getConnection (dbUrl);
}
}
//505
public class func{
	public void connectClients(){
            m_connections[i] = DriverManager.getConnection("jdbc:voltdb://localhost:21212");
}
}
//506
public class func{
	public void getConnection(){
      _conn = DriverManager.getConnection(_url, _username, _pw);
}
}
//507
public class func{
	public void createDatabase(){
    Connection con = DriverManager.getConnection(url, "sa", "");
}
}
//508
public class func{
	public void newConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j", USER_ID, PASSWORD);
}
}
//509
public class func{
	public void getDB2(){
        return DriverManager.getConnection(url, "db2inst1", "a3sd!fDj");
}
}
//510
public class func{
	public void setUpBeforeClass(){
      Connection con = DriverManager.getConnection("jdbc:derby:memory:" + dbName + ";create=true");
      new CreateJdbcDb(con).createDatabase();
}
}
//511
public class func{
	public void MySQLDriver(String dbFileNamePrefix,String username,String password){
          conn = DriverManager.getConnection("jdbc:mysql:" + dbFileNamePrefix,
              username,                     // username
              password);                    // password
}
}
//512
public class func{
	public void getTestDbConnection(){
      _connection = DriverManager
          .getConnection("jdbc:hsqldb:res:metamodel");
      _connection.setReadOnly(true);
}
}
//513
public class func{
	public void testNoConnectionInfo(){
            DriverManager.getConnection(PhoenixRuntime.JDBC_PROTOCOL);
}
}
//514
public class func{
	public void nextConnection(){
    conn = DriverManager.getConnection(getUrl(), props);
}
}
//515
public class func{
	public void getConnection(String url,String username,String password,String driver){
        return DriverManager.getConnection(url, username, myPass);
}
}
//516
public class func{
	public void startServer(){
        VoltDBConn = DriverManager
                .getConnection("jdbc:voltdb://localhost:21212");
}
}
//517
public class func{
	public void getConnection(){
    Connection conn = DriverManager.getConnection(url, user, password);
    c = new JDCConnection(conn, this);
    c.lease();
    connections.addElement(c);
    return c.getConnection();
}
}
//518
public class func{
	public void getConnection(String p0,String p1,String p2){
    return DriverManager.getConnection(p0, p1, p2);
}
}
//519
public class func{
	public void getTenantSpecificConnection(String tenantId){
        Connection conn = DriverManager.getConnection(getUrl(), tenantProps);
}
}
//520
public class func{
	public void getOracle(){
        return DriverManager.getConnection(url, "querydsl", "querydsl");
}
}
//521
public class func{
	public void getMySQL(){
        return DriverManager.getConnection(url, "querydsl", "querydsl");
}
}
//522
public class func{
	public void testRegister(){
        DriverManager.getConnection("jdbc:avatica:remote:");
}
}
//523
public class func{
	public void shutdownDatabase(){
                DriverManager.getConnection(url + ";shutdown=true");
}
}
//524
public class func{
	public void get(){
                return DriverManager.getConnection(url);
}
}
//525
public class func{
	public void getConnectionH2(){
        return DriverManager.getConnection("jdbc:h2:mem:Log4j", "sa", "");
}
}
//526
public class func{
	public void checkInvalidTerritoryFormat(String territory){
            String url = getReadWriteJDBCURL("fail3");
            DriverManager.getConnection(url);
            fail("connection without territory: " + url + "should have failed");
          assertSQLState("XJ041", se);
          assertSQLState("XBM0X", se.getNextException());
}
}
//527
public class func{
	public void testConnection(String driver,String url,String username,String password){
        connection = DriverManager.getConnection(url, username, password);
}
}
//528
public class func{
	public void createConnection(boolean isServer){
        return DriverManager.getConnection(link,
                            DBProperties.USER_NAME.toString(), DBProperties.PASSWORD.toString());
}
}
//529
public class func{
	public void stop(BundleContext context){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//530
public class func{
	public void openConnection(){
        connection = DriverManager.getConnection(url, user, password);
}
}
//531
public class func{
	public void getConnection(){
        conn = DriverManager.getConnection(url);
}
}
//532
public class func{
	public void getConnection(String dbUrl,Properties properties){
      pw.println("[NsSampleWork] Thread id - "+thread_id + "; requests database connection, dbUrl ="+dbUrl);
      conn = DriverManager.getConnection(dbUrl, properties);
}
}
//533
public class func{
	public void triggerDBFault(){
          cons[i] = DriverManager
              .getConnection("proxool.eucalyptus_walrus:net.sf.hajdbc.sql.Driver:jdbc:ha-jdbc:eucalyptus_walrus");
}
}
//534
public class func{
	public void testPlanForOrderByOrGroupByNotUseRoundRobin(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        testOrderByOrGroupByDoesntUseRoundRobin(conn, false);
}
}
//535
public class func{
	public void getConnection(){
          return DriverManager.getConnection(connectionString);
}
}
//536
public class func{
	public void getConnection(){
            return DriverManager.getConnection(proxoolURL, settings);
}
}
//537
public class func{
	public void tearDownAfterClass(){
         DriverManager.getConnection("jdbc:derby:memory:demoDB;drop=true");
}
}
//538
public class func{
	public void shutdownDB(String url){
            DriverManager.getConnection(url);
}
}
//539
public class func{
	public void SQLDB(String name){
        conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + name, 
                                           "SA", 
                                           "");
}
}
//540
public class func{
	public void getConnection(){
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nutch", "nutch", "nutch");
}
}
//541
public class func{
	public void createConnection(){
        return DriverManager.getConnection(conf.get("url"), conf.get("user"), conf.get("password"));
}
}
//542
public class func{
	public void buildConnection(Configuration pluginConfig){
        String credentials = pluginConfig.getSimple(CREDENTIALS_CONFIGURATION_PROPERTY).getStringValue();
        return DriverManager.getConnection(url, principal, credentials);
}
}
//543
public class func{
	public void init(){
                    setConnection(DriverManager.getConnection(getUrl()));
                    createTables();
}
}
//544
public class func{
	public void createConnection(String dataDir){
        File dataBase = new File(dataDir, "InvoiceDB.mdb");
        mConnection = DriverManager.getConnection(connectionString);
}
}
//545
public class func{
	public void setConnection(){
        conn = DriverManager.getConnection(sUrl);
}
}
//546
public class func{
	public void deleteDerby(){
                DriverManager.getConnection("jdbc:derby:" +
                        getBaseDir() + "/derby/test;shutdown=true", "sa", "sa");
}
}
//547
public class func{
	public void openSpatialDataBase(String dbName){
        return DriverManager.getConnection(databasePath,
                "sa", "sa");
}
}
//548
public class func{
	public void getConnection(String username,String password){
      return DriverManager.getConnection(url,username,password);
}
}
//549
public class func{
	public void connectionWithHardCodePassword2(){
        Connection conn = DriverManager.getConnection("jdbc:mysql://prod.company.com/production", "dba", MYSQL_PASSWORD);
}
}
//550
public class func{
	public void connectionWithHardCodePassword1(){
        Connection conn = DriverManager.getConnection("jdbc:mysql://prod.company.com/production", "root", "lamepassword");
}
}
//551
public class func{
	public void establishConnection(){
            connection = DriverManager.getConnection("jdbc:sqlite:db/" + HibernateUtil.getActiveDatabase() + ".cre");
}
}
//552
public class func{
	public void retrieveDynamicResults(int number,ResultSet[] rs1,ResultSet[] rs2,ResultSet[] rs3,ResultSet[] rs4){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
}
}
//553
public class func{
	public void f_testExecuteQueryWithNoDynamicResultSets_callable(){
        Connection connect = DriverManager.getConnection(create_url);
        CallableStatement cs = connect.prepareCall("CALL RETRIEVE_DYNAMIC_RESULTS(?)");
        cs.setInt(1, 0);
            cs.executeQuery();
}
}
//554
public class func{
	public void getConnection(){
        return DriverManager.getConnection(jdbcUrl);
}
}
//555
public class func{
	public void newConnection(){
    return DriverManager.getConnection(url, user, password);
}
}
//556
public class func{
	public void connect(String path_to_dbfile){
        String db_url = "jdbc:hsqldb:file:" + path_to_dbfile + ";crypt_key=" + getCryptKey() + ";crypt_type=blowfish";
        this.aConnection = DriverManager.getConnection(db_url, db_user, db_password);
}
}
//557
public class func{
	public void test_o(){
        Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
        OracleConnection oracleConn = (OracleConnection) conn;
}
}
//558
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(url, user, password);
}
}
//559
public class func{
	public void connect(){
    this.connection = DriverManager.getConnection(info.url, info.username,
        info.password);
}
}
//560
public class func{
	public void shutdown(){
        DriverManager.getConnection("jdbc:derby:tasks;shutdown=true");
}
}
//561
public class func{
	public void connect(){
      connection = DriverManager.getConnection(databaseUrl, connectionProperties);
}
}
//562
public class func{
	public void MySQLConnection(String hostname,int port,String username,String password){
            this.connection = DriverManager.getConnection("jdbc:mysql://" + hostname + ":" + port,
                    username, password);
}
}
//563
public class func{
	public void initSqlSessionFactory(){
      conn = DriverManager.getConnection("jdbc:hsqldb:mem:heavy_initial_load", "sa", "");
}
}
//564
public class func{
	public void Testdb(String dbname){
          conn = DriverManager.getConnection("jdbc:hsqldb:"
                                             + "mem:" + dbname ,       // filenames
                                             "sa",                     // username
                                             "");                      // password
}
}
//565
public class func{
	public void initMysqlClient(final String jdbcConf){
            this.connect = DriverManager.getConnection(jdbcUrl);
}
}
//566
public class func{
	public void getPooledConnection(){
            (JDBCConnection) DriverManager.getConnection(url, connProperties);
        return createPooledConnection(connection);
}
}
//567
public class func{
	public void testLpadFillLengthLessThanPadLength(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//568
public class func{
	public void setUp(){
    Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:annots", "sa", "");
}
}
//569
public class func{
	public void setUp(){
    Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:attest", "sa", "");
}
}
//570
public class func{
	public void getConnection(){
      connection = DriverManager.getConnection(driverUrl, username, password);  
}
}
//571
public class func{
	public void getConnection(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        return DriverManager.getConnection(URL, props);
}
}
//572
public class func{
	public void createConnection(String vdb,String propsFile,String addtionalStuff){
        return DriverManager.getConnection(url); 
}
}
//573
public class func{
	public void getDriverConnection(String driver,String url,String user,String pass){
        return DriverManager.getConnection(url, user, pass); 
}
}
//574
public class func{
	public void getNewtMySqlConnection(){
          return DriverManager.getConnection(m_url, m_username, m_password);           
}
}
//575
public class func{
	public void spinUpEmbeddedDB(Path randomTempDirectory,String driver,String protocol){
        Connection connection = DriverManager.getConnection(protocol + randomTempDirectory.toString() + "/tempDB;create=true");
}
}
//576
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, user, password);
}
}
//577
public class func{
	public void makeNewConnection(){
                DriverManager.getConnection(url, username, password);
}
}
//578
public class func{
	public void connect(){
        return DriverManager.getConnection(url);
}
}
//579
public class func{
	public void connection(){
    return DriverManager.getConnection("jdbc:hsqldb:mem:db", "sa", "");
}
}
//580
public class func{
	public void testEncode(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//581
public class func{
	public void setUp(){
        _connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
}
}
//582
public class func{
	public void setUp(){
        conn = DriverManager.getConnection("jdbc:h2:mem:");
}
}
//583
public class func{
	public void open(){
      this.c = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/" + this.database + "?autoReconnect=true", this.user, this.password);
}
}
//584
public class func{
	public void getCycleIsolationJDBC(){
        Connection c = DriverManager.getConnection("jdbc:default:connection");
}
}
//585
public class func{
	public void createConnection(){
    Connection conn = DriverManager.getConnection(m_jdbcUrl, m_dbUser, m_dbPass);
}
}
//586
public class func{
	public void setUp(){
        cx = DriverManager.getConnection("jdbc:h2:target/geodb");
}
}
//587
public class func{
	public void call(Context cx,Scriptable scope,Scriptable thisObj,Object[] params){
        return DriverManager.getConnection((String)params[1]);
}
}
//588
public class func{
	public void openConnection(){
    return DriverManager.getConnection(connectionString, DATABASE_USERNAME, DATABASE_PASSWORD);
}
}
//589
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, user, password);
}
}
//590
public class func{
	public void setUp(){
    conn = DriverManager.getConnection("jdbc:hsqldb:mem:mirage_test", "sa", "");
}
}
//591
public class func{
	public void stop(BundleContext context){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//592
public class func{
	public void shutdown(String catalog){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//593
public class func{
	public void reset(String catalog){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//594
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url);
}
}
//595
public class func{
	public void getConnection(){
                return DriverManager.getConnection(dbUrl, dbProperties);
                throw BatchMessages.MESSAGES.failToObtainConnection(e, dbUrl, dbProperties);
}
}
//596
public class func{
	public void getConnection(){
            conn = DriverManager.getConnection(jdbcUrl);
}
}
//597
public class func{
	public void tearDownJDBC(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//598
public class func{
	public void createConnection(Configuration conf){
    return DriverManager.getConnection(getCatalogUri(), this.connectionId, this.connectionPassword);
}
}
//599
public class func{
	public void dropDerbyDB(){
      DriverManager.getConnection("jdbc:derby:memory:coopr;drop=true");
}
}
//600
public class func{
	public void getConnection(){
  return DriverManager.getConnection(url, "sa", "");
}
}
//601
public class func{
	public void setUp(){
    inConnection = DriverManager.getConnection("jdbc:hsqldb:mem:originalDb", "SA", "");
    inConnection.createStatement().executeUpdate(CREATE_STATEMENT);
}
}
//602
public class func{
	public void setUp(){
    outConnection = DriverManager.getConnection("jdbc:hsqldb:mem:copiedDb", "SA", "");
    outConnection.createStatement().executeUpdate(CREATE_STATEMENT);
}
}
//603
public class func{
	public void getConnection(String userName,String passWord){
    Connection c = DriverManager.getConnection(dbURL, userName, passWord);
}
}
//604
public class func{
	public void createConnection(String user,String password){
    LOGGER.info("url: " + url);
    return DriverManager.getConnection(url, oProps);
}
}
//605
public class func{
	public void shouldAttachDetachConnection(){
        Connection connection = DriverManager.getConnection(url(), user(), password());
        Base.attach(connection);
        a(Base.connection()).shouldNotBeNull();
}
}
//606
public class func{
	public void stop(BundleContext context){
            DriverManager.getConnection(getDerbyJDBC_Shutdown("db"));
}
}
//607
public class func{
	public void setupHive(){
        connection = DriverManager.getConnection("jdbc:hive2://", "", "");
}
}
//608
public class func{
	public void openConnection(){
        return DriverManager.getConnection(url);
}
}
//609
public class func{
	public void createConnection(){
    Connection conn = DriverManager.getConnection(url, user, password);
}
}
//610
public class func{
	public void createConnection(){
      conn = DriverManager.getConnection("jdbc:derby:memory:chapter02DB;create=true", "APP", "APP");
}
}
//611
public class func{
	public void getConnection(){
    return ( auditDs != null ? auditDs.getConnection() : DriverManager.getConnection( AuditConnection.DRIVER_URL,
        AuditConnection.DRIVER_USERID, AuditConnection.DRIVER_PASSWORD ) );
}
}
//612
public class func{
	public void CandlepinLiquibaseResource(String changelogFile){
            String connectionUrl = getJdbcUrl("testing");
            Connection jdbcConnection = DriverManager.getConnection(connectionUrl, "sa", "");
            DatabaseConnection conn = new JdbcConnection(jdbcConnection);
}
}
//613
public class func{
	public void DatabaseStoredIndexTest(){
      connection = DriverManager.getConnection(DB_URL, "sa", "");
}
}
//614
public class func{
	public void testExternallyConfiguredLog4J(){
    Connection con = DriverManager.getConnection("jdbc:p6spy:h2:mem:p6spy", "sa", null);
}
}
//615
public class func{
	public void testUnsignedNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//616
public class func{
	public void testLpadFillLengthEqualPadLength(){
        Connection conn = DriverManager.getConnection(getUrl());
}
}
//617
public class func{
	public void connectToEPSGdatabase(){
            EPSGdbConn = DriverManager.getConnection( epsgPath );
}
}
//618
public class func{
	public void getConnection(){
        return DriverManager.getConnection(url, user, pass);
}
}
//619
public class func{
	public void internalGetConnection(String userName,String password){
        return DriverManager.getConnection(this.url, userName, password);
}
}
//620
public class func{
	public void getDBConn(){
        return DriverManager.getConnection(DBURL,USERNAME,PASSWORD);  
}
}
//621
public class func{
	public void getConnectionWithProps(String url,Properties props){
        return DriverManager.getConnection(url, props);
}
}
//622
public class func{
	public void foo(){
        DriverManager.getConnection("foo");
}
}
//623
public class func{
	public void start(BundleContext context){
        DriverManager.getConnection(getDerbyJDBC_Create("db"));
}
}
//624
public class func{
	public void using(String url){
            Connection connection = DriverManager.getConnection(url);
            return using(new DefaultConnectionProvider(connection, true), JDBCUtils.dialect(connection));
}
}
//625
public class func{
	public void getConnection(){
        conn = DriverManager.getConnection(connectionString, username, password);
}
}
//626
public class func{
	public void prepareDerbyInputDatabase(){
      conn = DriverManager.getConnection(dbURL);
}
}
//627
public class func{
	public void getCon(){
    Connection theCon = DriverManager.getConnection(url, user, password);
}
}
//628
public class func{
	public void getH2(){
        return DriverManager.getConnection(url, "sa", "");
}
}
//629
public class func{
	public void getHSQL(){
        return DriverManager.getConnection(url, "sa", "");
}
}
//630
public class func{
	public void buildConnection(){
        return DriverManager.getConnection(url, username, password);
}
}
//631
public class func{
	public void createConnection(String url,String user,String password){
            return DriverManager.getConnection(url, user, password);
}
}
//632
public class func{
	public void fromParams(ConfigurationParams params){
    String connectionString = params.getString(TransformationsConfigurationParametersNames.CONNECTION_STRING_LIN_REUTERS_PARAMETER_NAME);
    Connection connection = DriverManager.getConnection(connectionString);
    return new LinReutersFromDBLexicalResource(
        connection,
        params.getInt(TransformationsConfigurationParametersNames.LIMIT_LIN_REUTERS_PARAMETER_NAME)
        );
}
}
//633
public class func{
	public void getDefaultConnection(){
        return DriverManager.getConnection( "jdbc:default:connection" );
}
}
//634
public class func{
	public void open(){
            return DriverManager.getConnection("jdbc:h2:mem:" + name);
}
}
//635
public class func{
	public void getResultConnection(){
        return DriverManager.getConnection("jdbc:h2:./data/results");
}
}
//636
public class func{
	public void getCubrid(){
        return DriverManager.getConnection(url);
}
}
//637
public class func{
	public void getPostgreSQL(){
        return DriverManager.getConnection(url, "querydsl", "querydsl");
}
}
//638
public class func{
	public void getConnection(){
      return DriverManager.getConnection(instance.url);
}
}
//639
public class func{
	public void connect(String userName,String password,String fullurl,DriverType driver){
  Connection conn = DriverManager.getConnection(fullurl, userName,
      password);
}
}
//640
public class func{
	public void getConfigConnection(){
        return DriverManager.getConnection("jdbc:h2:mem:Log4j", USER_ID, PASSWORD);
}
}
//641
public class func{
	public void SQLValidator(){
    this.connection = DriverManager.getConnection(URL,properties);
}
}
//642
public class func{
	public void doGetConnection(Properties properties){
    Connection connection = DriverManager.getConnection(url, properties);
    configureConnection(connection);
}
}
//643
public class func{
	public void getConnection(String username,String password){
    return DriverManager.getConnection(this.url, username, password);
}
}
//644
public class func{
	public void getConnectionFromDriverManager(){
      return DriverManager.getConnection(
        "jdbc:postgresql://" + loginCredentials.getHost() + "/"
        + loginCredentials.getDatabase(),
          // + "?logLevel=2"
          loginCredentials.getUser(),
          loginCredentials.getPassword()
        );
}
}
//645
public class func{
	public void tearDown(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//646
public class func{
	public void testDefaultConn(){
        DriverManager.getConnection("jdbc:default:connection");
}
}
//647
public class func{
	public void getConnection(){
      connection = DriverManager.getConnection( getConnectionString() );
}
}
//648
public class func{
	public void getDBConnection(){
        return DriverManager.getConnection( jdbcUrl );
}
}
//649
public class func{
	public void getResultSetMetaData(String query){
        return new RSMDWrapper( DriverManager.getConnection( "jdbc:default:connection" ), query );
}
}
//650
public class func{
	public void urlTest3(){
            Connection conn = DriverManager.getConnection("jdbc:hbql;maxtablerefs=44");
            ConnectionImpl connimpl = (ConnectionImpl)conn;
            maxrefs = connimpl.getHConnectionImpl().getMaxTablePoolReferencesPerTable();
}
}
//651
public class func{
	public void JdbcDAO(final String location,final JPasswordField pfield){
      conn = DriverManager.getConnection(location);
    DatabaseLocationParser dlp = new DatabaseLocationParser(location);
}
}
//652
public class func{
	public void JdbcDAO(final String location,final JPasswordField pfield){
    conn = DriverManager.getConnection(dlp.getConnectionString(),
                                       dlp.getUsername(),
                                       new String(pfield.getPassword()));
}
}
//653
public class func{
	public void closeHibernateDerby(){
            DriverManager.getConnection(JDBC_DERBY_URL + ";shutdown=true");
}
}
//654
public class func{
	public void setUp(){
        final String jdbcUrl = constructJdbcUrl();
        logger.debug("Using JDBC URL: " + jdbcUrl);
        DriverManager.getConnection(jdbcUrl);
}
}
//655
public class func{
	public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hive", "");
    createTables(con);
    runQueries(con, numberOfQueryIterations);
}
}
//656
public class func{
	public void contextDestroyed(ServletContextEvent sce){
                DriverManager.getConnection( derbyUrl + ";shutdown=true");
}
}
//657
public class func{
	public void getBestRowId(String schema,String tableName,int scope,String nullable,ResultSet[] rs){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
}
}
//658
public class func{
	public void initialValue(){
                return DriverManager.getConnection(connectionURL);
}
}
//659
public class func{
	public void getConnection(){
        return DriverManager.getConnection(dsn, username, password);
}
}
//660
public class func{
	public void checkBadUrl(String url){
      DriverManager.getConnection(url, "", "");
}
}
//661
public class func{
	public void getConnection(){
      conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
}
}
//662
public class func{
	public void setup(){
        this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/orbit", "postgres", null);
}
}
//663
public class func{
	public void openConn(){
            this.connection = DriverManager.getConnection(toConnString(), username, password);
}
}
//664
public class func{
	public void getConfigConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j;ifexists=true", USER_ID, PASSWORD);
}
}
//665
public class func{
	public void openConnection(String driver,String url,String username,String password){
            attach(DriverManager.getConnection(url, username, password));
}
}
//666
public class func{
	public void createConnection(){
                return DriverManager.getConnection(_connectUri);
}
}
//667
public class func{
	public void makeConnection(String url,Properties connectionProps){
      return DriverManager.getConnection( url, connectionProps );
}
}
//668
public class func{
	public void connectToDB(String host,int port,String db,String user,String pass){
            conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db, user, pass);
}
}
//669
public class func{
	public void shutdown(){
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//670
public class func{
	public void getConnection(){
        conn = DriverManager.getConnection(dbUrl);
}
}
//671
public class func{
	public void cleanup(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//672
public class func{
	public void getConnection(){
                String pass = cfg.get ("jdbc.password");
                return DriverManager.getConnection(url,user,pass);
}
}
//673
public class func{
	public void getDerby(){
        return DriverManager.getConnection(url, "", "");
}
}
//674
public class func{
	public void getJdbcConnection(){
    String password = getProperty(HIVESERVER_PASSWORD);
    return DriverManager.getConnection(url, user, password);
}
}
//675
public class func{
	public void getConnection(String url){
      return DriverManager.getConnection(url);
}
}
//676
public class func{
	public void createConnection(String driver,String url,String user,String password){
        return DriverManager.getConnection(url, user, password);
}
}
//677
public class func{
	public void load(String filename){
      connection = DriverManager.getConnection("jdbc:sqlite:" + filename);
}
}
//678
public class func{
	public void getConnection(){
            return DriverManager.getConnection(Support_SQL.sqlUrl,
                    Support_SQL.sqlLogin, Support_SQL.sqlPassword);
            throw new SQLException("Failed to connect. url=" + Support_SQL.sqlUrl + ", sqlLogin="
                    + Support_SQL.sqlLogin + ", sqlPassword=" + Support_SQL.sqlPassword, e);
}
}
//679
public class func{
	public void createNewBootstrapConnection(){
    _bootstrapConn = DriverManager.getConnection(_url);
    _bootstrapConn.setAutoCommit(_autoCommit);
    _bootstrapConn.setTransactionIsolation(_isolationLevel);
}
}
//680
public class func{
	public void createCmsConn(){
    connection = DriverManager.getConnection(conn_url,username,password ); 
}
}
//681
public class func{
	public void deleteDatabase(String name){
            DriverManager.getConnection(shutdownUrl);
}
}
//682
public class func{
	public void getConnection(){
            return DriverManager.getConnection(url_, user_, password_);
}
}
//683
public class func{
	public void getConnection(LogChannelInterface log,DatabaseMeta dbMeta,String partitionId,int initialSize,int maximumSize){
    return DriverManager.getConnection( "jdbc:apache:commons:dbcp:" + buildPoolName( dbMeta, partitionId ) );
}
}
//684
public class func{
	public void createTemplate(String url){
        Connection conn = DriverManager.getConnection(url, "auser", "sa");
        SingleConnectionDataSource dataSource = new SingleConnectionDataSource(conn, false);
        return new JdbcTemplate(dataSource);
}
}
//685
public class func{
	public void nextConnection(){
        Connection con = DriverManager.getConnection(DatabaseCreator.nextUrl());
        DatabaseCreator.createDatabase(con);
}
}
//686
public class func{
	public void afterClassDihJdbcTest(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true;territory=en_US");
}
}
//687
public class func{
	public void setUpConnection(){
    connection = DriverManager.getConnection( "jdbc:drill:zk=local" );
    dbMetadata = connection.getMetaData();
}
}
//688
public class func{
	public void installRoutines(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    TestRoutines.installRoutines(conn);
}
}
//689
public class func{
	public void connect(){
                this.connection = DriverManager.getConnection(this.url);
}
}
//690
public class func{
	public void openConnection(boolean autocommit){
            DriverManager.getConnection(connUrl, user, passwd);
}
}
//691
public class func{
	public void getConnection(){
        final String url = "jdbc:h2:" + getBaseDir() +
        Connection conn = DriverManager.getConnection(url, "sa", "");
}
}
//692
public class func{
	public void getTeradata(){
        return DriverManager.getConnection("jdbc:teradata://teradata/dbc", "querydsl", "querydsl");
}
}
//693
public class func{
	public void getSQLite(){
        return DriverManager.getConnection("jdbc:sqlite:target/sample.db");
}
}
//694
public class func{
	public void getConnection(){
            DriverShim.loadAndRegister(getDriver(), _opts
                    .getValue(InstallOptions.DATABASE_DRIVERCLASS));
                    DriverManager.getConnection(_opts
                            .getValue(InstallOptions.DATABASE_JDBCURL), _opts
                            .getValue(InstallOptions.DATABASE_USERNAME), _opts
                            .getValue(InstallOptions.DATABASE_PASSWORD));
}
}
//695
public class func{
	public void getMemoryConnection(){
            return DriverManager.getConnection(dbMap.getConnectionString());
}
}
//696
public class func{
	public void newConnection(){
        return DriverManager.getConnection(H2_URL, USER_ID, PASSWORD);
}
}
//697
public class func{
	public void dropInMemoryDb(){
        StringBuffer sb = constructUrl().append(";drop=true");
            DriverManager.getConnection(sb.toString());
}
}
//698
public class func{
	public void createConnection(){
                return DriverManager.getConnection(_jdbcUrl);
}
}
//699
public class func{
	public void getConnection(){
      return DriverManager.getConnection(url);
}
}
//700
public class func{
	public void getConnection(){
      return DriverManager.getConnection(url, getUser(), getPassword());
}
}
//701
public class func{
	public void prepareConnection(){
    dbConn = DriverManager.getConnection(dbURL, username, password);
}
}
//702
public class func{
	public void getConnection(){
      return DriverManager.getConnection( jdbcConnectString, jdbcProperties );
}
}
//703
public class func{
	public void getConnection(){
        return DriverManager.getConnection(getURL());
}
}
//704
public class func{
	public void prepareDerbyDatabase(){
    conn = DriverManager.getConnection(dbURL);
}
}
//705
public class func{
	public void bad14(){
        return DriverManager.getConnection("url", "user", pwd);
}
}
//706
public class func{
	public void getConnection(){
                _connection = DriverManager.getConnection(_url, _username, _password);
}
}
//707
public class func{
	public void getConnection(){
      conn = DriverManager.getConnection(url, this.userName, this.password);
}
}
//708
public class func{
	public void open(){
        userDB = DriverManager.getConnection(USER_DB_URI, "webgoat_admin", "");
}
}
//709
public class func{
	public void createConnection(Configuration conf){
    return DriverManager.getConnection(getCatalogUri());
}
}
//710
public class func{
	public void getConnection(){
        return DriverManager.getConnection(uri, username, password);
}
}
//711
public class func{
	public void getJdbcConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:testdb");
}
}
//712
public class func{
	public void onShutdown(ApplicationEvent event){
        DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
//713
public class func{
	public void getHiveConnection(){
        return DriverManager.getConnection("jdbc:hive2:///", "", "");
}
}
//714
public class func{
	public void testInvalidateConnection(){
        Connection conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:test");
        assertNotNull(conn);
}
}
//715
public class func{
	public void getForeignConnection(String connectionURL){
        return DriverManager.getConnection( connectionURL );
}
}
//716
public class func{
	public void HSQLDatabase(String databaseName){
      conn = DriverManager.getConnection(jdbcURL + ";create=true", 
          HSQL_USER, HSQL_PASS);
}
}
//717
public class func{
	public void JDBCConnection(){
    this.conn = DriverManager.getConnection(PropertiesUtil.JDBC_URL, PropertiesUtil.JDBC_USERNAME, PropertiesUtil.JDBC_PASSWD);
}
}
//718
public class func{
	public void getConnection(){
        return DriverManager.getConnection(getUrl(), getUserName(), getPassword());
}
}
//719
public class func{
	public void _getConnection(){
    return DriverManager.getConnection(
      "jdbc:hsqldb:file:" + _fileName, "sa", "");
}
}
//720
public class func{
	public void connectDatabase(){
            _con = DriverManager.getConnection(_url, _userName, _password);
}
}
//721
public class func{
	public void getNewConnection(){
      return DriverManager.getConnection(configuration.getDatabaseUrl(),
              configuration.getDatabaseUser(),
              configuration.getDatabasePassword());
}
}
//722
public class func{
	public void getConnection(){
                  connection = DriverManager.getConnection(getUrl());
}
}
//723
public class func{
	public void getConnection(String driver,String jdbcURL,String user,String pass){
    return DriverManager.getConnection(jdbcURL, user, pass);
}
}
//724
public class func{
	public void runscript(File scriptFile){
            Connection connection = DriverManager.getConnection(__dbURL, "", "");
}
}
//725
public class func{
	public void createConnection(){
      return DriverManager.getConnection("jdbc:mysql://"
          + plugin.MySqlDir + "", "" + plugin.MySqlUser + "", ""
          + plugin.MySqlPass + "");
}
}
//726
public class func{
	public void beforeClass(){
        connection = DriverManager.getConnection("jdbc:h2:mem:events-jpa-quickstart", "sa", "sa");
}
}
//727
public class func{
	public void call(){
                return DriverManager.getConnection(dbURL, info);
}
}
//728
public class func{
	public void getConn(){
      m_conn = DriverManager.getConnection(m_url, m_username, m_passwd);
}
}
//729
public class func{
	public void getMySQLConnection(){
    return DriverManager.getConnection(url, id, passwd);
}
}
//730
public class func{
	public void run(){
                            conn = DriverManager.getConnection(
                                    url, user, password);
                            work(conn);
}
}
//731
public class func{
	public void test1(){
        c = DriverManager.getConnection( "mongodb://localhost/test" );
}
}
//732
public class func{
	public void test1(){
            c = DriverManager.getConnection( "mongodb://localhost/test" );
}
}
//733
public class func{
	public void urlTest1(){
            Connection conn = DriverManager.getConnection("jdbc:hbql;unknown=44");
}
}
//734
public class func{
	public void HSQLDriver(String dbFileNamePrefix,String username,String password){
        conn = DriverManager.getConnection("jdbc:hsqldb:" + dbFileNamePrefix,
            username,                     // username
            password);                    // password
}
}
//735
public class func{
	public void getConnection(){
            return DriverManager.getConnection(url, user, passwd);
}
}
//736
public class func{
	public void getConnection(){
    return DriverManager.getConnection(
        _tool.getDbServerHost() + "/" + _tool.getTestCatalog(), _tool.getUser(), _tool.getPassword());
}
}
//737
public class func{
	public void getConnection(){
      return DriverManager.getConnection(
          "jdbc:mysql://127.0.0.1:3306/showcase", "root", "123456");
}
}
//738
public class func{
	public void getConnection(){
      return DriverManager.getConnection(
          "jdbc:mysql://127.0.0.1:3306/showcase", "root", "root");
}
}
//739
public class func{
	public void getCon(){
      con=DriverManager.getConnection(url,user,password);
}
}
//740
public class func{
	public void MSSqlIO(){
      m_connection = DriverManager.getConnection(url, "sa", "admin");
}
}
//741
public class func{
	public void createConnection(){
    return DriverManager.getConnection(URL);
}
}
//742
public class func{
	public void getConnection(){
        return DriverManager.getConnection("jdbc:apache:commons:dbcp:test");
}
}
//743
public class func{
	public void createConnection(String testDB){
    return DriverManager.getConnection(
            "jdbc:mysql://"+ MySqlTestConfig.host + ":" +
                    MySqlTestConfig.port + "/" + testDB +
            "?elideSetAutoCommits=true" +
            "&useLocalTransactionState=true" +
            "&allowMultiQueries=true" +
            "&useLocalSessionState=true",
            MySqlTestConfig.user, MySqlTestConfig.pass);
}
}
//744
public class func{
	public void openConn(boolean autoCommit){
      conn = DriverManager.getConnection(url, username, password);
}
}
//745
public class func{
	public void connectToRemoteRepository(){
        Connection connection = DriverManager.getConnection(getRepositoryUrl(), driverProperties);
        assertNotNull(connection);
}
}
//746
public class func{
	public void shouldNotConnectWithInvalidRepositoryName(){
        DriverManager.getConnection(getContextPathUrl() + "/dummy", driverProperties);
}
}
//747
public class func{
	public void getConnectionWithProps(String url,Properties props){
    return DriverManager.getConnection(url, props);
}
}
//748
public class func{
	public void getConnection(final String username,final String password){
        return DriverManager.getConnection(jdbcUrl, username, password);
}
}
//749
public class func{
	public void openConnection(){
                return DriverManager.getConnection(url, username, password);
}
}
//750
public class func{
	public void setup(){
        JdbcDataSource ds = new JdbcDataSource();
    ds.setURL("jdbc:h2:./h2/foo");
        dbProperties.put(TransactionalDriver.XADataSource, ds);
        conn2 = DriverManager.getConnection(url, dbProperties);
}
}
//751
public class func{
	public void setUp(){
        Connection connection = DriverManager.getConnection(Framework.getProperty(URL_PROPERTY));
            doOnAllTables(connection, null, null, "DROP TABLE [%s]"); // no CASCADE...
            checkSupports(connection);
}
}
//752
public class func{
	public void open(){
        this.connection = DriverManager.getConnection(url, getUsername(), getPassword());
}
}
//753
public class func{
	public void getConnection(){
            connStr=connStr.trim();
            Connection conn=DriverManager.getConnection(connStr, userName, userPass);
}
}
