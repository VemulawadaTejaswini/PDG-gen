//0
public class func{
	public void execute(Connection connection){
                    while (testGroups.next()) {
                        testIdsStatement.setString(1, testGroups.getString(1));
                        ResultSet testExecutions = testIdsStatement.executeQuery();
                        while (testExecutions.next()) {
                            testNames.add(testExecutions.getString(1));
                        }
                        testExecutions.close();
                    }
}
}
//1
public class func{
	public void testArray(Connection conn){
        prep.setObject(1, new Object[] { new BigDecimal("1"), "2" });
        ResultSet rs = prep.executeQuery();
        rs.next();
        assertEquals("1", rs.getString(1));
        rs.next();
        assertEquals("2", rs.getString(1));
        assertFalse(rs.next());
}
}
//2
public class func{
	public void testReverse(Connection conn,String s){
        rs = conn.createStatement().executeQuery("SELECT reverse(pk) FROM REVERSE_TEST");
        assertTrue(rs.next());
        assertEquals(reverse, rs.getString(1));
        assertFalse(rs.next());
        PreparedStatement stmt = conn.prepareStatement("SELECT pk FROM REVERSE_TEST WHERE pk=reverse(?)");
        stmt.setString(1, reverse);
        rs = stmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(s, rs.getString(1));
        assertFalse(rs.next());
}
}
//3
public class func{
	public void addAllocatedVMs(AsyncRequest asyncRequest,Connection c){
        pstmt.setString(1, asyncRequest.getId());
        ResultSet rs = pstmt.executeQuery();
        if (rs == null || !rs.next()) {
            return;
        }
        do {
            asyncRequest.addAllocatedVM(rs.getInt(1));
        } while (rs.next());
        pstmt.close();
}
}
//4
public class func{
	public void testCreateArrayWithNonStandardDelimiter(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT ?::box[]");
        pstmt.setArray(1, _conn.createArrayOf("box", in));
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        Array arr = rs.getArray(1);
        ResultSet arrRs = arr.getResultSet();
        assertTrue(arrRs.next());
        assertEquals(in[0], arrRs.getObject(2));
        assertTrue(arrRs.next());
        assertEquals(in[1], arrRs.getObject(2));
        assertFalse(arrRs.next());
}
}
//5
public class func{
	public void testGroupByPlusOne(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(6, rs.getInt(1));
            assertFalse(rs.next());
            conn.close();
}
}
//6
public class func{
	public void testSelectWithSubtractionExpression(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(rs.getString(1), ROW8);
            assertEquals(rs.getInt(2), 0);
            assertFalse(rs.next());
            conn.close();
}
}
//7
public class func{
	public void testCoerceTinyIntToSmallInt(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(ROW9, rs.getString(1));
            assertFalse(rs.next());
            conn.close();
}
}
//8
public class func{
	public void getCharacterIdAndNameFromDatabase(String name){
    Connection con = DatabaseConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("SELECT id, name, buddyCapacity FROM characters WHERE name LIKE ?");
    ps.setString(1, name);
    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
      ret = new CharacterIdNameBuddyCapacity(rs.getInt("id"), rs.getString("name"), rs.getInt("buddyCapacity"));
    }
    rs.close();
}
}
//9
public class func{
	public void testColumnOnBothSides(){
        Properties props = new Properties(TEST_PROPERTIES);
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(rs.getString(1), ROW7);
            assertFalse(rs.next());
            conn.close();
}
}
//10
public class func{
	public void testFoundIndexOnPartialEvalCaseStatement(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(ROW9, rs.getString(1));
            assertFalse(rs.next());
            conn.close();
}
}
//11
public class func{
	public void check(Connection conn,int len,String expectedCluster){
        for (int i = 0; i < len; i++) {
            prep.setInt(1, i);
            ResultSet rs = prep.executeQuery();
            rs.next();
            assertEquals("Data" + i, rs.getString(2));
            assertFalse(rs.next());
        }
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT VALUE FROM INFORMATION_SCHEMA.SETTINGS WHERE NAME='CLUSTER'");
        String cluster = rs.next() ? rs.getString(1) : "''";
        assertEquals(expectedCluster, cluster);
}
}
//12
public class func{
	public void testOptimizeInJoinSelect(){
        PreparedStatement prep = conn.prepareStatement(
                "select * from item where id in (select x from opt())");
        ResultSet rs = prep.executeQuery();
        assertTrue(rs.next());
        assertEquals(1, rs.getInt(1));
        assertFalse(rs.next());
        conn.close();
}
}
//13
public class func{
	public void testDecimalSubtraction2Expression(){
        Properties props = new Properties(TEST_PROPERTIES);
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(rs.getString(1), ROW8);
            assertFalse(rs.next());
            conn.close();
}
}
//14
public class func{
	public void testDoubleMultiplyExpression(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(ROW1, rs.getString(1));
            assertFalse(rs.next());
            conn.close();
}
}
//15
public class func{
	public void testLongSubtractionExpression(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(rs.getString(1), ROW8);
            assertFalse(rs.next());
            conn.close();
}
}
//16
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT count(*) FROM %s WHERE namespace = ?", CONFLICTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, namespace)));
                ps.setString(1, namespace);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    count = rs.getInt(1);
                }
                rs.close();
                return Integer.valueOf(count);
}
}
//17
public class func{
	public void testUngroupedAggregationNoWhere(){
        Properties props = new Properties(TEST_PROPERTIES);
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(9, rs.getLong(1));
            assertFalse(rs.next());
            conn.close();
}
}
//18
public class func{
	public void testCountIsNull(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(6, rs.getLong(1));
            assertFalse(rs.next());
            conn.close();
}
}
//19
public class func{
	public void getUserById(int id){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement prep = conn.prepareStatement("SELECT USENAME FROM PG_CATALOG.PG_USER WHERE OID=?");
        prep.setInt(1, id);
        ResultSet rs = prep.executeQuery();
        if (rs.next()) 
        {
            res = rs.getString(1);
        }
        rs.close();
}
}
//20
public class func{
	public void testSumDouble(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertTrue(Doubles.compare(rs.getDouble(1), 0.015)==0);
            assertFalse(rs.next());
            conn.close();
}
}
//21
public class func{
	public void testSumFloat(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertTrue(Floats.compare(rs.getFloat(1), 0.15f)==0);
            assertFalse(rs.next());
            conn.close();
}
}
//22
public class func{
	public void existsSequence(String schemaName,String seqName,Connection con){
    PreparedStatement ps = con.prepareStatement(
        "select seqschema,seqname from syscat.sequences where seqschema = ? and seqname = ?");
    ps.setString(2,seqName);
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      retval = true;
    rs.close();
}
}
//23
public class func{
	public void getTableRowCount(Connection conn,String table){
    PreparedStatement statement = conn.prepareStatement("SELECT COUNT(*) FROM " + table);
      ResultSet rs = statement.executeQuery();
        if (rs.next()) {
          return rs.getInt(1);
        }
        rs.close();
}
}
//24
public class func{
	public void testDateInList(){
            statement.setDate(1, new Date(0));
            statement.setDate(2, date);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(ROW1, rs.getString(1));
            assertFalse(rs.next());
}
}
//25
public class func{
	public void getCurrrentSchemaName(Connection con){
    PreparedStatement ps= con.prepareStatement("select current schema from sysibm.sysdummy1");
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      result=rs.getString(1);
    rs.close();
}
}
//26
public class func{
	public void existsTable(String schemaName,String tableName,Connection con){
    PreparedStatement ps = con.prepareStatement(
        "SELECT TABNAME FROM SYSCAT.TABLES WHERE TABSCHEMA = ? AND TABNAME = ?");
    ps.setString(2,tableName);
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      retval = true;
    rs.close();
}
}
//27
public class func{
	public void aliasExists(Connection conn,String aliasName){
        PreparedStatement   ps = conn.prepareStatement( "select count(*) from sys.sysaliases where alias = ?" );
        ps.setString( 1, aliasName );
        ResultSet   rs = ps.executeQuery();
        rs.next();
        int retval = rs.getInt( 1 );
        rs.close();
}
}
//28
public class func{
	public void main(String[] args){
     Connection c = DriverManager.getConnection("jdbc:hsqldb:file:target/test-classes/hsql/test_dj_db", "sa", "");
     PreparedStatement ps = c.prepareStatement("SELECT * FROM Customer");
     ResultSet rs = ps.executeQuery();
     while (rs.next()) {
       log.info(rs.getString("firstname")+ ", " + rs.getString("lastname"));
    }
    rs.close();
}
}
//29
public class func{
	public void containsTable(String table,Connection connection){
    PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) AS ct FROM sqlite_master WHERE type = ? AND name = ?");
    stmt.setString(2, table);
    ResultSet resultSet = stmt.executeQuery();
      return resultSet.next() && resultSet.getInt("ct") > 0;
      resultSet.close();
}
}
//30
public class func{
	public void readRows(String dataSourceURL,String dataSourceName){
    Connection connection = DriverManager.getConnection(dataSourceURL, USER, PASSWORD);    
    PreparedStatement stmt = connection.prepareStatement(QUERY_SELECT);
    ResultSet rs = stmt.executeQuery();
    while(rs.next()) {
      int id = rs.getInt(1);
      list.add(id);
      LOGGER.info("read {} from {}", id, dataSourceName);
    }
    rs.close();
}
}
//31
public class func{
	public void run(Connection conn,int location,String sub_nbr){
      PreparedStatement stmt = this.getPreparedStatement(conn, getSubscriber);
      stmt.setString(1, sub_nbr);
      ResultSet results = stmt.executeQuery();
      if (results.next()) {
        long s_id = results.getLong(1);
        results.close();
        stmt = this.getPreparedStatement(conn, updateSubscriber);
        stmt.setInt(1, location);
        stmt.setLong(2, s_id);
        return stmt.executeUpdate();
        }
      results.close();
}
}
//32
public class func{
	public void upgradeGuestOs(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SELECT * from guest_os WHERE id=138");
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                pstmt = conn.prepareStatement("INSERT INTO `cloud`.`guest_os` (id, category_id, display_name) VALUES (138, 7, 'None')");
                pstmt.executeUpdate();
                s_logger.debug("Inserted NONE category to guest_os table");
            }
            rs.close();
}
}
//33
public class func{
	public void dropIndexIfExists(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SHOW INDEX FROM domain WHERE KEY_NAME = 'path'");
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                pstmt = conn.prepareStatement("ALTER TABLE `cloud`.`domain` DROP INDEX `path`");
                pstmt.executeUpdate();
                s_logger.debug("Unique key 'path' is removed successfully");
            }
            rs.close();
}
}
//34
public class func{
	public void getDatabaseProperty(String propertyName,Connection conn){
        PreparedStatement getDBP =  conn.prepareStatement(
        "VALUES SYSCS_UTIL.SYSCS_GET_DATABASE_PROPERTY(?)");
        getDBP.setString(1, propertyName);
        ResultSet rs = getDBP.executeQuery();
        rs.next();
        String value = rs.getString(1);
        rs.close();
}
}
//35
public class func{
	public void loadAll(){
      Connection con = (Connection) DatabaseConnection.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT * FROM maplestocks ORDER BY stockid");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        stocks.add(new MapleStock(rs.getString("name"), rs.getString("ticker"), rs.getInt("count"), rs.getInt("value"), rs.getInt("change")));
      }
}
}
//36
public class func{
	public void getAgreProductList(String sqlStr,Connection nuodbConnection,PreparedStatement stmt2){
            stmt2 = nuodbConnection.prepareStatement(sqlStr);
            rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                map.put(rs2.getString(2), rs2.getInt(1));
            }
            Assert.assertNotNull(rs2);
            closeAll(rs2, stmt2);
}
}
//37
public class func{
	public void getNXCodeValid(String code,boolean validcode){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT `valid` FROM nxcode WHERE code = ?");
      ps.setString(1, code);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        validcode = rs.getInt("valid") != 0;
      }
      rs.close();
}
}
//38
public class func{
	public void loadMacsIfNescessary(){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT macs FROM accounts WHERE id = ?");
      ps.setInt(1, accId);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        for (String mac : rs.getString("macs").split(", ")) {
          if (!mac.equals("")) {
            macs.add(mac);
          }
        }
      }
      rs.close();
}
}
//39
public class func{
	public void dumpScenarios(PrintStream ps,String pattern){
        PreparedStatement stmt= fConnection.prepareStatement("select NAME from SCENARIO where NAME like ? order by NAME"); //$NON-NLS-1$
        stmt.setString(1, pattern);
        ResultSet rs= stmt.executeQuery();
        while (rs.next())
            ps.println(rs.getString(1));
        rs.close();
}
}
//40
public class func{
	public void i_getMostRecentRebuild(Connection conn){
        PreparedStatement stmt = conn.prepareStatement(GET_MOST_RECENT_REBUILD);
            rs = stmt.executeQuery();
            if (rs.next()) {
                mostRecent = rs.getLong(1);
            }
            if (rs != null) rs.close();
            stmt.close();
}
}
//41
public class func{
	public void select(Connection conn,String key){
        PreparedStatement stmt = conn.prepareStatement(upsert);
            stmt.setString(1, key);
            results = stmt.executeQuery();
            if(results.next())
                return results.getString(1);
            else
                return null;
}
}
//42
public class func{
	public void hasBannedIP(){
      ps.setString(1, session.getRemoteAddress().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      if (rs.getInt(1) > 0) {
        ret = true;
      }
      rs.close();
}
}
//43
public class func{
	public void fire(Connection conn,ResultSet oldCont,ResultSet newCont){
        smt.setString(1, oldCont.getString("identifier"));
        ResultSet rs=smt.executeQuery();
        rs.next();
        int versions=rs.getInt(1);
        rs.close(); smt.close();
}
}
//44
public class func{
	public void getNXCode(String code,String type){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT `" + type + "` FROM nxcode WHERE code = ?");
      ps.setString(1, code);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        item = rs.getInt(type);
      }
      rs.close();
}
}
//45
public class func{
	public void getGlobalProperty(Connection connection,String gp){
    PreparedStatement select = connection
            .prepareStatement("select property_value from global_property where property = ?");
      select.setString(1, gp);
      ResultSet resultSet = select.executeQuery();
      if (resultSet.next()) {
        return resultSet.getString(1);
      } else {
        throw new IllegalArgumentException("Global property not found " + gp);
      }
}
}
//46
public class func{
	public void routineExists(Connection conn,String functionName){
        PreparedStatement ps = chattyPrepare( conn, "select count (*) from sys.sysaliases where alias = ?" );
        ps.setString( 1, functionName );
        ResultSet rs = ps.executeQuery();
        rs.next();
        boolean retval = rs.getInt( 1 ) > 0 ? true : false;
        rs.close();
}
}
//47
public class func{
	public void getCustomersCount(){
        stmt.setInt(1, partner.getId());
        ResultSet result = stmt.executeQuery();
        if (result.next()) {
            retValue = result.getInt(1);
        }
        result.close();
}
}
//48
public class func{
	public void checkSnapshotUsage(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("select count(*) from cloud_usage.cloud_usage cu inner join cloud.snapshots s " +
            "where cu.usage_id = s.id and cu.usage_type = 9 and cu.start_date > s.removed"+lastCheckId);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next() && (rs.getInt(1) > 0)){
            errors.append("Error: Found "+rs.getInt(1)+" snapshot usage records which are created after snapshot is removed");
            errors.append("\n");
            return false;
        }
}
}
//49
public class func{
	public void getOrderFrequencyIdForConceptId(Connection connection,Integer conceptIdForFrequency){
    PreparedStatement orderFrequencyIdQuery = connection
            .prepareStatement("select order_frequency_id from order_frequency where concept_id = ?");
    orderFrequencyIdQuery.setInt(1, conceptIdForFrequency);
    ResultSet orderFrequencyIdResultSet = orderFrequencyIdQuery.executeQuery();
    if (!orderFrequencyIdResultSet.next()) {
      return null;
    }
    return orderFrequencyIdResultSet.getInt("order_frequency_id");
}
}
//50
public class func{
	public void checkTemplateISOUsage(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("select count(*) from cloud_usage.cloud_usage cu inner join cloud.template_zone_ref tzr " +
            "where cu.usage_id = tzr.template_id and cu.zone_id = tzr.zone_id and cu.usage_type in (7,8) and cu.start_date > tzr.removed"+lastCheckId);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next() && (rs.getInt(1) > 0)){
            errors.append("Error: Found "+rs.getInt(1)+" template/ISO usage records which are created after it is removed");
            errors.append("\n");
            return false;
        }
}
}
//51
public class func{
	public void load(int cid){
      Connection con = (Connection) DatabaseConnection.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT * FROM maplestocks_data WHERE cid = ?");
      ps.setInt(1, cid);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        ret.add(new Pair<String ,Integer>(MapleStocks.getInstance().tickerOf(rs.getInt("stockid")), rs.getInt("shares")));
      }
}
}
//52
public class func{
	public void getTableName(Connection conn,int tableId){
          conn.prepareStatement("SELECT " + COL_TABLES_NAME + " FROM " + TB_TABLES + " WHERE " + COL_TABLES_PK + "=?");
      pstmt.setInt(1, tableId);
      res = pstmt.executeQuery();
      if (!res.next()) {
        throw new TajoInternalError("Cannot get any table name from TID");
      }
      return res.getString(1);
      CatalogUtil.closeQuietly(pstmt, res);
}
}
//53
public class func{
	public void isSatisified(){
               java.sql.Connection c = dataSource.getConnection();
                    PreparedStatement s = c.prepareStatement("SELECT LAST_ACKED_ID FROM ACTIVEMQ_ACKS WHERE PRIORITY=" + priority);
                    ResultSet rs = s.executeQuery();
                    if (rs.next()) {
                        id = rs.getInt(1);
                    }
                    if (c!=null) {
                        c.close();
                    }
}
}
//54
public class func{
	public void getUserNameInternal(){
            connection = getPooledConnectionProvider().getPooledConnection();
            statement = connection.prepareStatement(FIND_ROLE_BY_OID);
            statement.setLong(1, pgRoleOid);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("rolname");
            }
            safeClose(connection, statement, resultSet);
}
}
//55
public class func{
	public void messageTableCount(){
        java.sql.Connection c = dataSource.getConnection();
            PreparedStatement s = c.prepareStatement("SELECT COUNT(*) FROM ACTIVEMQ_MSGS");
            ResultSet rs = s.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            if (c!=null) {
                c.close();
            }
}
}
//56
public class func{
	public void getUserById(Connection conn,int id){
        PreparedStatement prep = conn.prepareStatement("SELECT NAME FROM INFORMATION_SCHEMA.USERS WHERE ID=?");
        prep.setInt(1, id);
        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            return rs.getString(1);
        }
}
}
//57
public class func{
	public void getConceptUuid(Connection connection,int conceptId){
    PreparedStatement select = connection.prepareStatement("select uuid from concept where concept_id = ?");
      select.setInt(1, conceptId);
      ResultSet resultSet = select.executeQuery();
      if (resultSet.next()) {
        return resultSet.getString(1);
      } else {
        throw new IllegalArgumentException("Concept not found " + conceptId);
      }
}
}
//58
public class func{
	public void run(PreparedStatement stm){
                            stm.setInt(1, profile.getUserId());
                            ResultSet rs = stm.executeQuery();
                            while (rs.next()) {
                                String bagName = rs.getString("sharer");
                                if (!ret.containsKey(bagName)) {
                                    ret.put(bagName, new HashSet<String>());
                                }
                                ret.get(bagName).add(rs.getString("bagname"));
                            }
}
}
//59
public class func{
	public void get(String id){
    PreparedStatement stmt = connection.prepareStatement("SELECT " + FIELDS + " FROM " + TABLE_NAME + " WHERE ID = ?");
    stmt.setString(1, id);
    ResultSet rs = stmt.executeQuery();
    if (rs.next()) {
      result = buildHeaderFromResultSet(rs);
    } 
    rs.close();
}
}
//60
public class func{
	public void getMessage(String messageId,Clob[] returnedData){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement stmt = conn.prepareStatement("select MESSAGE_JSON from JSON_MESSAGE where MESSAGE_ID = ?");
    stmt.setString( 1, messageId);
    ResultSet results = stmt.executeQuery();
    if (results.next()) {
      returnedData[0] = results.getClob(1);
    }
}
}
//61
public class func{
	public void getUserOid(String user,PooledConnectionProvider pooledConnectionProvider){
            connection = pooledConnectionProvider.getPooledConnection();
            statement = connection.prepareStatement(FIND_ROLE_BY_NAME);
            statement.setString(1, user);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getLong("oid");
            }
            safeClose(connection, statement, resultSet);
}
}
//62
public class func{
	public void find(String stockDatabaseId){
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
      Date date = new Date(rs.getTimestamp(1).getTime());
      DataType dataType = DataType.valueOf(rs.getString(2));
      Double price = rs.getDouble(3);
      Integer size = rs.getInt(4);
      TickPoint point = new TickPoint(date, dataType, price, size);
      result.add(point);
    }
    rs.close();
}
}
//63
public class func{
	public void reportLeasOwnerShipAndDuration(Connection connection){
            statement = connection.prepareStatement(getStatements().getLeaseOwnerStatement());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                LOG.info(getLeaseHolderId() + " Lease held by " + resultSet.getString(1) + " till " + new Date(resultSet.getLong(2)));
            }
            close(statement);
}
}
//64
public class func{
	public void checkInstanceGroup(Connection conn,String groupName,long accountId){
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM  instance_group WHERE name = ? and account_id = ?");
        pstmt.setString(1, groupName);
        pstmt.setLong(2, accountId);
        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) {
            return false;
        } else {
            return true;
        }
}
}
//65
public class func{
	public void testWrap(){
        Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "xxx");
        ResultSet rs = stmt.executeQuery();
        rs.next();
        rs.close();
}
}
//66
public class func{
	public void call(){
                        int x = (int) (Math.random() * 2);
                        prep.setInt(1, x);
                        ResultSet rs = prep.executeQuery();
                        rs.next();
                        String data = rs.getString(2);
                        if (data.length() != 10000 + x) {
                            throw new Exception(data.length() + " != " + x);
                        }
                        rs.close();
}
}
//67
public class func{
	public void countSamples(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            n= set.getInt(1);
        ps.println("samples with variation " + v + ": " + n); //$NON-NLS-1$ //$NON-NLS-2$
}
}
//68
public class func{
	public void executeStatement(PreparedStatement statement){
                            Table table = index.getTable();
                            statement.setString(1, table.getSchema().getName());
                            statement.setString(2, table.getName());
                            statement.setString(3, index.getName());
                            ResultSet expressions = statement.executeQuery();
                            if (expressions.next()) {
                                expression = expressions.getString(1);
                            }
}
}
//69
public class func{
	public void fire(Connection conn,ResultSet oldIdent,ResultSet newIdent){
            smt.setString(1, newIdent.getString("host_inode"));
            smt.setString(2, newParentPath);
            smt.setString(3, newIdent.getString("id"));
            ResultSet rs=smt.executeQuery();
            boolean found=rs.next();
            rs.close(); smt.close();
}
}
//70
public class func{
	public void isPrivateIPAllocated(String ip,long podId,long zoneId,PreparedStatement stmt){
      stmt.clearParameters();
          stmt.setString(1, ip);
          stmt.setLong(3, podId);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
                return (rs.getString("taken") != null);
            } else {
                return false;
            }
}
}
//71
public class func{
	public void getTextID(String text){
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1, text);
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()) {
            id = resultSet.getInt("id");
        }
}
}
//72
public class func{
	public void select(Set<String> atts,PreparedStatement pstmt){
    ResultSet row=pstmt.executeQuery();
    while(row.next())
      {
      String s=this.expression.eval(row);
      if(s==null || s.isEmpty()) continue;
      atts.add(s);
      }
    row.close();
}
}
//73
public class func{
	public void executeStatement(PreparedStatement statement){
                        for (String parameter : parameters) {
                            statement.setString(index++, parameter);
                        }
                        ResultSet columns = statement.executeQuery();
                        while (columns.next()) {
                            Table table = addTable(inspectionResults, columns.getString("TABLE_SCHEMA"), null,
                                    columns.getString("TABLE_NAME"));
                            Column column = table.addColumn(columns.getString("COLUMN_NAME"));
                            column.setJdbcType(getJdbcType(column.getJdbcType(), columns.getString("COLUMN_TYPE")));
                        }
}
}
//74
public class func{
	public void checkIsolationLevel(Connection conn){
        PreparedStatement pstmt = conn.prepareStatement("SELECT @@global.tx_isolation, @@session.tx_isolation;");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            s_logger.info("global isolation = " + rs.getString(1));
            s_logger.info("session isolation = " + rs.getString(2));
        }
}
}
//75
public class func{
	public void countDatapoints(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("datapoints with variation " + v + ": " + set.getInt(1)); //$NON-NLS-1$ //$NON-NLS-2$
}
}
//76
public class func{
	public void countScalars(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("scalars with variation " + v + ": " + set.getInt(1)); //$NON-NLS-1$ //$NON-NLS-2$
}
}
//77
public class func{
	public void count(PrintStream ps){
        PreparedStatement stmt= fConnection.prepareStatement("select count(*) from SCALAR where DATAPOINT_ID not in (select DATAPOINT.ID from DATAPOINT)"); //$NON-NLS-1$
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("count: " + set.getInt(1)); //$NON-NLS-1$
        set.close();
}
}
//78
public class func{
	public void run(PreparedStatement stm){
                stm.setString(2, value);
                ResultSet rs = stm.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1) > 0;
                }
}
}
//79
public class func{
	public void traceMarker(){
                    connection.prepareStatement("select * from employee where name like ?");
                preparedStatement.setString(1, "john%");
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    rs.getString(1);
                }
                preparedStatement.close();
}
}
//80
public class func{
	public void print(){
            PreparedStatement statement = persistenceManager.getConnection().prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                logger.log(result.getInt("players") + "\t" + result.getString("number1")
                        + "\t" + result.getString("number2") + "\t" + result.getString("type") + "\t"
                        + result.getDouble("wins"));
            }
}
}
//81
public class func{
	public void noOfNodes(){
        ps.setString(1, getQuery());
        ResultSet results = ps.executeQuery();
        results.next();
        int no = results.getInt(1);
        results.close();
}
}
//82
public class func{
	public void showCompareData(PreparedStatement psS,String[] expectedValues){
    ResultSet rs = psS.executeQuery();
    while (rs.next()) {
                        String actualValue = rs.getInt(1) + " " + showData(rs.getBytes(2)) + "  " + rs.getInt(3) + " " + showData(rs.getBytes(4));
      assertEquals(expectedValues[i],actualValue);
      i++;
    }
    rs.close();
}
}
//83
public class func{
	public void run(Connection conn,int keyname,Map<Integer,String> results){
        PreparedStatement stmt = this.getPreparedStatement(conn, readStmt);
        stmt.setInt(1, keyname);          
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          for(int i=1;i<11;i++)
            results.put(i, r.getString(i));
        }
        r.close();
}
}
//84
public class func{
	public void countAllDimensions(PrintStream ps){
        PreparedStatement stmt= fConnection.prepareStatement("select distinct DIM_ID from SCALAR"); //$NON-NLS-1$
        ResultSet set= stmt.executeQuery();
        while (set.next()) {
            Dim dimension= Dim.getDimension(set.getInt(1));
            if (dimension != null)
                countDimension(ps, dimension);
        }
}
}
//85
public class func{
	public void checkDbName(Connection conn,String expectedDbName){
        PreparedStatement ps = conn.prepareStatement("values syscs_util.SYSCS_GET_DATABASE_NAME()");
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals( rs.getString( 1 ),  expectedDbName);
        rs.close();
}
}
//86
public class func{
	public void getDomainCount(String macAddress){
    PreparedStatement prep = dbInstance.prepareStatement("select count(distinct d.name) as num_domains from domains d inner join requests r on d.id = r.domain_id inner join clients c on c.id = r.client_id where c.mac_address = ?;");
    prep.setString(1, macAddress);
    ResultSet rs = prep.executeQuery();
      rs.next();
      int numDomains = rs.getInt("num_domains");
      rs.close();
}
}
//87
public class func{
	public void getStringValue(String table,String fieldToGet,String fieldToMatchAgainst,String valueToMatchAgainst){
      PreparedStatement prep = dbInstance.prepareStatement("select " + fieldToGet + " from " + table + " where " + fieldToMatchAgainst + " = ?;");
      prep.setString(1, valueToMatchAgainst);
      ResultSet rs = prep.executeQuery();
      rs.next();
      String value = rs.getString(fieldToGet);
      rs.close();
}
}
//88
public class func{
	public void ConfigDao(){
        this.connection = getConnection();
            this.connection.prepareStatement("SELECT * FROM config;");
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("member") + "\t" + rs.getString("config"));
        }
        rs.close();
}
}
//89
public class func{
	public void testCachingResultsCheckResult(PreparedStatement ps,int expected,String value){
        ps.setString(1, value);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            counter++;
            String result = rs.getString(1);
            assertEquals(result, value);
        }
        assertEquals(expected, counter);
}
}
//90
public class func{
	public void verifyPatchTableNotLocked(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + database, "sa", "");
        PreparedStatement stmt = conn.prepareStatement("SELECT patch_in_progress FROM patches WHERE system_name = ? AND ( patch_in_progress <> 'F' OR patch_level in ( SELECT MAX(patch_level) FROM patches WHERE system_name = ? ))");
        stmt.setString(2, database);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        assertEquals("F", rs.getString("patch_in_progress"));
        SqlUtil.close(conn, stmt, rs);
}
}
//91
public class func{
	public void getUnionNames(String sqlStr,Connection nuodbConnection,PreparedStatement stmt2){
            stmt2 = nuodbConnection.prepareStatement(sqlStr);
            rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                list.add(rs2.getString(1));
            }
            Assert.assertNotNull(rs2);
            closeAll(rs2, stmt2);
}
}
//92
public class func{
	public void fire(Connection conn,ResultSet oldTemplate,ResultSet newTemplate){
        smt.setString(1, newTemplate.getString("template_id"));
        ResultSet rs=smt.executeQuery();
        boolean found=rs.next();
        rs.close(); smt.close();
}
}
//93
public class func{
	public void testMultibatchSelectPrepared(){
    s.setFetchSize(100);
    s.setString(1, "0");
    ResultSet rs = s.executeQuery();
    while (rs.next()) {
      i++;
      rs.getString(1);
    }
}
}
//94
public class func{
	public void getIdentitySequenceName(Connection conn,String tableName){
        ps.setString( 1, tableName.toUpperCase() );
        ResultSet   rs = ps.executeQuery();
        rs.next();
        String  uuidString = rs.getString( 1 );
        rs.close();
}
}
//95
public class func{
	public void run(Connection conn,int keyname,String fields[],Map<Integer,String> results){
        PreparedStatement stmt = this.getPreparedStatement(conn, selectStmt);
        stmt.setInt(1, keyname);          
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
          for (int i = 1; i < 11; i++)
              results.put(i, r.getString(i));
        }
        r.close();
}
}
//96
public class func{
	public void prepare(DataSource dataSource){
    final Connection connection = dataSource.getConnection();
    PreparedStatement preparedStatement = connection
        .prepareStatement("SELECT * FROM user_tables WHERE table_name = 'JTA_TEST'");
    final ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
      connection.prepareStatement("DROP TABLE jta_test").execute();
    }
    connection.prepareStatement(
        "CREATE TABLE jta_test (some_string VARCHAR2(10))").execute();
}
}
//97
public class func{
	public void getSubSpaces(Connection con,int spaceId){
      stmt = con.prepareStatement(querySortedSubSpaces);
      stmt.setInt(1, spaceId);
      rs = stmt.executeQuery();
      while (rs.next()) {
        spaces.add(fetchSpace(rs));
      }
      DBUtil.close(rs, stmt);
}
}
//98
public class func{
	public void findLookupId(Connection connection){
        PreparedStatement statement = connection.prepareStatement("select LOOKUP_ID "
                + "from financial_action where fin_action_id = ?");
        statement.setInt(1, action);
        ResultSet results = statement.executeQuery();
        if (results.next()) {
            short lookupId = results.getShort("lookup_id");
            statement.close();
            return lookupId;
        } else {
            statement.close();
            throw new RuntimeException("unable to downgrade: no activity with id " + action);
        }
}
}
//99
public class func{
	public void closestZoom(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT zoom_level FROM %s ORDER BY abs(zoom_level - ?)", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                zoom = rs.getLong(1);
            }
            rs.close();
}
}
//100
public class func{
	public void determineTimeDifference(Connection connection){
        PreparedStatement statement = connection.prepareStatement(getStatements().getCurrentDateTime());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Timestamp timestamp = resultSet.getTimestamp(1);
            long diff = System.currentTimeMillis() - timestamp.getTime();
            if (Math.abs(diff) > maxAllowableDiffFromDBTime) {
                // off by more than maxAllowableDiffFromDBTime so lets adjust
                result = (-diff);
            }
            LOG.info(getLeaseHolderId() + " diff adjust from db: " + result + ", db time: " + timestamp);
        }
}
}
//101
public class func{
	public void varchar10(){
        PreparedStatement ps = getOrPrepareStatement(
                "SELECT VC10 FROM T --DERBY-PROPERTIES index=T_VC10");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertNotNull(rs.getString(1));
        }
        rs.close();
}
}
//102
public class func{
	public void MapleFamily(int cid){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT familyid FROM family_character WHERE cid = ?");
      ps.setInt(1, cid);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        MapleFamily.id = rs.getInt("familyid");
      }
      ps.close();
}
}
//103
public class func{
	public void countDimension(PrintStream ps,Dim dim){
        stmt.setInt(1, dim.getId());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("dimension " + dim + ": " + set.getInt(1)); //$NON-NLS-1$ //$NON-NLS-2$
}
}
//104
public class func{
	public void getResourceMeta(PreparedStatement statement){
    ResultSet results = statement.executeQuery();
      if (results.next()) {
        return metaFromResult(results);
      }
      results.close();
}
}
//105
public class func{
	public void getCurrentScn(Connection connection){
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
    resultSet.next();
    long result = resultSet.getLong(1);
    resultSet.close();
}
}
//106
public class func{
	public void testModifySmallBlobs(){
        PreparedStatement ps = prepareStatement(
                "select dBlob, length from smallBlobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Blob Blob = rs.getBlob(1);
            int length = rs.getInt(2);
            Blob.setBytes(length, "X".getBytes("US-ASCII"));
            byte[] content = Blob.getBytes(1, 100);
        }
        rs.close();
}
}
//107
public class func{
	public void minColumn(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT MIN(tile_column) FROM %s WHERE zoom_level=?", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                size = rs.getLong(1);
            }
            rs.close();
}
}
//108
public class func{
	public void append(PreparedStatement pstmt,StringBuilder newFields,@Nullable String projectKey){
    if (projectKey != null) {
      pstmt.setString(1, projectKey);
      ResultSet rs = null;
      try {
        rs = pstmt.executeQuery();
        if (rs.next()) {
          String projectUuid = DatabaseUtils.getString(rs, "uuid");
          if (projectUuid != null) {
            newFields.append("projectUuids=").append(projectUuid);
          }
        }
      } finally {
        DbUtils.closeQuietly(rs);
      }
    }
}
}
//109
public class func{
	public void loadFromDb(DB db){
    PreparedStatement ps = db.getConnection().prepareStatement("SELECT * FROM page");
    ResultSet res = ps.executeQuery();
    while(res.next()) {
      pageMap.forcePut(res.getString("page_title"), res.getInt("page_id"));
    }
}
}
//110
public class func{
	public void getConcept(int i){
      PreparedStatement srcConceptPs = db.getConnection().prepareStatement("SELECT concept_id FROM concept_mapping WHERE page_id = ?");
      srcConceptPs.setInt(1, i);
      ResultSet res = srcConceptPs.executeQuery();
      if (res.next()) {
        return res.getInt("concept_id");
      }
}
}
//111
public class func{
	public void getMostRecentEvent(Connection conn){
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
}
}
//112
public class func{
	public void run(Connection conn){
        PreparedStatement stmt = this.getPreparedStatement(conn, minStmt);
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          minId = r.getInt(1);
        }
        r.close();
}
}
//113
public class func{
	public void testDecimalRounding(int id,String input,String output){
        String stringdata = String.format("My Nuncle Vanya says: case %d: (%s -> %s)",
                                          id, input, output);
        ps.setBigDecimal(1, new BigDecimal(input));
        ps.setString(2, stringdata);
        ps.executeUpdate();
        ps = conn.prepareStatement("select ID from T_DECIMAL where value = ?;");
        ps.setString(1, stringdata);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            BigDecimal value = rs.getBigDecimal(1);
            assertEquals(new BigDecimal(output), value);
        }
}
}
//114
public class func{
	public void testFetchSmallClobsInaccurateLength(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from smallClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int unusedLength = rs.getInt(2);
            String content = clob.getSubString(1, 100);
        }
        rs.close();
}
}
//115
public class func{
	public void getLatestModificationDate(Connection conn){
            st = conn.prepareStatement("SELECT MAX(mDate) FROM doFields ");
            ResultSet results = st.executeQuery();
            if (results.next()) {
                return results.getLong(1);
            } else {
                return 0L;
            }
}
}
//116
public class func{
	public void isExpired(String cacheEntryName){
      PreparedStatement stmt = conn
          .prepareStatement("SELECT expiration_date FROM " + TABLE_NAME + " WHERE key = ?;");
      stmt.setString(1, cacheEntryName);
      ResultSet result = stmt.executeQuery();
      if (result.next()) {
        Timestamp timestamp = result.getTimestamp("expiration_date");
        long expirationDate = timestamp.getTime();
        stmt.close();
        return expirationDate < System.currentTimeMillis();
      }
}
}
//117
public class func{
	public void checkInstanceGroupVmMap(Connection conn,long groupId,long vmId){
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM  instance_group_vm_map WHERE group_id = ? and instance_id = ?");
        pstmt.setLong(2, vmId);
        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) {
            return false;
        } else {
            return true;
        }
}
}
//118
public class func{
	public void varcharAll(){
        PreparedStatement ps = getOrPrepareStatement(
          "SELECT VC10,VC100,VC1000 FROM T --DERBY-PROPERTIES index=T_VC_ALL");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            for (int col = 1; col <= 3; col++) {
                assertNotNull(rs.getString(col));
            }
        }
        rs.close();
}
}
//119
public class func{
	public void testFetchSmallBlobs(){
        PreparedStatement ps = prepareStatement(
                "select dBlob, length from smallBlobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Blob Blob = rs.getBlob(1);
            int blobLength = rs.getInt(2);
            byte[] content = Blob.getBytes(1, blobLength);
        }
        rs.close();
}
}
//120
public class func{
	public void testModifySmallClobs(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from smallClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int length = rs.getInt(2);
            clob.setString(length, "X");
            String content = clob.getSubString(1, 100);
        }
        rs.close();
}
}
//121
public class func{
	public void isPublicIPAllocated(long ip,long vlanDbId,PreparedStatement stmt){
          stmt.clearParameters();
          stmt.setLong(2, vlanDbId);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
                return (rs.getString("allocated") != null);
            } else {
                return false;
            }
}
}
//122
public class func{
	public void loadFromDb(DB db){
    PreparedStatement ps = db.getConnection().prepareStatement("SELECT * FROM concept_mapping");
    ResultSet res = ps.executeQuery();
    while (res.next()) {
      long conceptId = res.getLong("concept_id");
      long pageId = res.getLong("page_id");
      if (!conceptMap.containsKey(conceptId)) {
        conceptMap.forcePut(conceptId, pageId);
      }
      conceptMapX.put(conceptId, pageId);
    }
}
}
//123
public class func{
	public void showData(PreparedStatement psS,int id,byte[] original,String expectedValue){
    psS.setInt(2, id + 10);
    ResultSet rs = psS.executeQuery();
    while (rs.next()) {
      String actualValue = "ORG " + showData(original) + "";
      actualValue += "CHR " + showData(rs.getBytes(1)) + "";
      actualValue += "VAR " + showData(rs.getBytes(2)) + "";
      actualValue += "LVC " + showData(rs.getBytes(3)) + "";
      actualValue += "BLOB " + showData(rs.getBytes(4));
      assertEquals(expectedValue, actualValue);
    }
    rs.close();
}
}
//124
public class func{
	public void findColumn(PreparedStatement query,String label){
        ResultSet rs = query.executeQuery();
        if (rs.next())
        {
            try 
            {
                returnValue = rs.findColumn(label);
            }
            catch (SQLException sqle)
            {} //consume exception to allow  cleanup of resource.
        }
        rs.close();
}
}
//125
public class func{
	public void getMaxId(DBConfiguration conf,Connection conn,String tableName,String col){
                conn.prepareStatement("SELECT MAX(" + col + ") FROM " + tableName);
            ResultSet rs = s.executeQuery();
            rs.next();
            long ret = rs.getLong(1);
            rs.close();
}
}
//126
public class func{
	public void getBucketByKey(Object key){
            ps.setString(1, String.valueOf(keyHash));
                rs = ps.executeQuery();
                if (rs.next()) {
                    result = rs.getObject(dataColumnName);
                }
                factory.releaseConnection(connection);
}
}
//127
public class func{
	public void addMissingOvsAccount(Connection conn){
            PreparedStatement pstmt = conn.prepareStatement("SELECT * from ovs_tunnel_account");
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                s_logger.debug("Adding missing ovs tunnel account");
                pstmt =
                    conn.prepareStatement("INSERT INTO `cloud`.`ovs_tunnel_account` (`from`, `to`, `account`, `key`, `port_name`, `state`) VALUES (0, 0, 0, 0, 'lock', 'SUCCESS')");
                pstmt.executeUpdate();
            }
}
}
//128
public class func{
	public void doSelect(PreparedStatement stmt,String key){
        stmt.setString(1, key);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return getVersionedList(rs);
        } else {
            return new ArrayList<Versioned<byte[]>>(0);
        }
}
}
//129
public class func{
	public void getOfferingCount(){
          statement = conn.prepareStatement ( "SELECT count(*) FROM offering_bundle" );
            ResultSet rs = statement.executeQuery();
          if (rs.next()) result = rs.getInt(1);
            statement.close();  
}
}
//130
public class func{
	public void testFloatMAX_VALUE(Connection conn){
        PreparedStatement ps = conn.prepareStatement("select * from jira1136");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertEquals(3.4028235E38, rs.getFloat(1), .00001);

        }
}
}
//131
public class func{
	public void getQuoteForUpdate(Connection conn,String symbol){
        PreparedStatement stmt = getStatement(conn, getQuoteForUpdateSQL);
        stmt.setString(1, symbol); // symbol
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getQuote -- failure no result.next()");

        else
            quoteData = getQuoteDataFromResultSet(rs);
        stmt.close();
}
}
//132
public class func{
	public void getQuoteData(Connection conn,String symbol){
        PreparedStatement stmt = getStatement(conn, getQuoteSQL);
        stmt.setString(1, symbol);
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getQuoteData -- could not find quote for symbol=" + symbol);
        else
            quoteData = getQuoteDataFromResultSet(rs);
        stmt.close();
}
}
//133
public class func{
	public void getQuote(Connection conn,String symbol){
        PreparedStatement stmt = getStatement(conn, getQuoteSQL);
        stmt.setString(1, symbol); // symbol
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getQuote -- failure no result.next() for symbol: " + symbol);

        else
            quoteData = getQuoteDataFromResultSet(rs);
        stmt.close();
}
}
//134
public class func{
	public void is_duplicate_update(Receipt inReceipt){
      stmt.setString(1, new String(inReceipt.getSHA1()));
      ResultSet rs = stmt.executeQuery();
      if( rs.next() )
        return true;
}
}
//135
public class func{
	public void getNewestRequestID(int client_id,int domain_id){
      PreparedStatement prep = dbInstance.prepareStatement("select id from requests where client_id = ? and domain_id = ? order by id desc limit 1;");
      prep.setInt(2, domain_id);
      ResultSet rs = prep.executeQuery();
      rs.next();
      int value = rs.getInt("id");
      rs.close();
}
}
//136
public class func{
	public void run(Connection conn,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getReviewUser);
        stmt.setLong(1, uid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
//137
public class func{
	public void testCastOperatorInSelect(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 2)); // Execute at timestamp 2
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(BigDecimal.valueOf(2.5), rs.getBigDecimal(1));
}
}
//138
public class func{
	public void selectAuthorViaOutParams(int id,String[] username,String[] password,String[] email,String[] bio){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("select * from author where id = ?");
    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();
    rs.next();
    bio[0] = rs.getString("bio");
}
}
//139
public class func{
	public void readBytesJDBC(String key){
    Connection conn = getConnection();
    PreparedStatement ps = conn
        .prepareStatement("select value from hs4jtest where id = ?");
      ps.setString(1, key);
      ResultSet rs = ps.executeQuery();
      assertTrue(rs.next());
      byte[] bytes = rs.getBytes(1);
}
}
//140
public class func{
	public void findLookupId(Connection connection,short activityId){
        PreparedStatement statement = connection.prepareStatement("select activity_name_lookup_id "
                + "from activity where activity_id = ?");
        statement.setShort(1, activityId);
        ResultSet results = statement.executeQuery();
        if (results.next()) {
            short lookupId = results.getShort("activity_name_lookup_id");
            statement.close();
            return lookupId;
        }
        statement.close();
}
}
//141
public class func{
	public void run(PreparedStatement stm){
            stm.setString(1, token);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return toIntermediateReps(rs);
            }
}
}
//142
public class func{
	public void getBufferedImage(int level,Connection con){
        PreparedStatement ps = con.prepareStatement(stmt);
        ResultSet rs = ps.executeQuery();
        rs.next();
        byte[] bytes = rs.getBytes(1);
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
        rs.close();
}
}
//143
public class func{
	public void run(Connection conn,int start,int count,List<Map<Integer,String>> results){
        PreparedStatement stmt = this.getPreparedStatement(conn, scanStmt);
        stmt.setInt(2, start+count); 
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          HashMap<Integer,String> m=new HashMap<Integer,String>();
          for(int i=1;i<11;i++)
            m.put(i, r.getString(i));
          results.add(m);
        }
        r.close();
}
}
//144
public class func{
	public void exec(){
        stmt.setLong(1, new Random().nextInt(1000 * 100)
}
}
//145
public class func{
	public void firstInt(PreparedStatement stmt){
    ResultSet rs = stmt.executeQuery();
    int i = rs.next() ? rs.getInt(1) : Integer.MIN_VALUE;
}
}
//146
public class func{
	public void isTriggerGroupPaused(Connection conn,String groupName){
            ps = conn.prepareStatement(rtp(SELECT_PAUSED_TRIGGER_GROUP.toLowerCase()));
            ps.setString(1, groupName);
            rs = ps.executeQuery();
            return rs.next();
            closeResultSet(rs);
            closeStatement(ps);
}
}
//147
public class func{
	public void testReceiveBinary(){
        for (int i = 0; i < 10; i++)
        {
            ps.setInt(1, 42 + i);
            ResultSet rs = ps.executeQuery();
            assertEquals("One row should be returned", true, rs.next());
            assertEquals(42 + i, rs.getInt(1));
            rs.close();
        }
}
}
//148
public class func{
	public void testSearchStringEscape(){
    PreparedStatement pstmt = con.prepareStatement("SELECT 'a' LIKE ?, '_' LIKE ?");
    pstmt.setString(2, pattern);
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    assertTrue(!rs.getBoolean(1));
    assertTrue(rs.getBoolean(2));
    rs.close();
}
}
//149
public class func{
	public void exists2(Connection con,String columnName1,String columnValue1,String columnName2,String columnValue2){
            ps = con.prepareStatement("SELECT 1 FROM " + indexTableName + " WHERE " + columnName1 + " = ? AND " + columnName2 + " = ?");
            ps.setString(2, columnValue2);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
//150
public class func{
	public void exists(Connection con,String columnName,String columnValue){
            ps = con.prepareStatement("SELECT 1 FROM " + indexTableName + " WHERE " + columnName + " = ?");
            ps.setString(1, columnValue);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
//151
public class func{
	public void existsTable(Connection con,String tableName){
            ps = con.prepareStatement("SELECT table_name FROM information_schema.tables " +
                    "WHERE table_schema = 'public' " +
                    "AND lower(table_name) = lower(?)");
            ps.setString(1, tableName);
            rs = ps.executeQuery();
            return rs.next();
            close(ps);
}
}
//152
public class func{
	public void run(Connection conn,long iid,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getAverageRating);
        stmt.setLong(2, uid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
//153
public class func{
	public void runCompareTables(Connection connection,String table1,String table2){
    stmt = connection.prepareStatement(
        "select count(*) from (select * from (select * from "
                + table1
                + " minus select * from "
                + table2
                + ") union all select * from (select * from "
                + table2
                + " minus select * from " + table1 + "))");
    ResultSet results = stmt.executeQuery();
    results.next();
    int numDifferences = results.getInt(1);
}
}
//154
public class func{
	public void doWork(){
        ps.setInt(1, r.nextInt(tableSize));
        ResultSet rs = ps.executeQuery();
        rs.next();
        rs.getInt(1);
        fetchTextColumn(rs, 2);
        rs.close();
}
}
//155
public class func{
	public void getNumberOfRegistrations(){
      con = DbConnectionManager.getConnection();
      pstmt = con.prepareStatement(GET_SESSION_COUNT);
      ResultSet rs = pstmt.executeQuery();
      rs.next();
      result = rs.getInt(1);
}
}
//156
public class func{
	public void run(Connection conn,long iid,long uid){
        PreparedStatement stmt = this.getPreparedStatement(conn, getReview);
        stmt.setLong(1, iid);
        ResultSet r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
//157
public class func{
	public void run(Connection conn,long iid,long uid){
        stmt = this.getPreparedStatement(conn, getTrust);
        stmt.setLong(1, uid);
        r= stmt.executeQuery();
        while (r.next()) {
            continue;
        }
        r.close();
}
}
//158
public class func{
	public void getInt(Connection connection,String queryString,String[] args){
  for( int i = 0; i < args.length; ++i )
    {
    pStatement.setString( i + 1, args[ i ] );
    }
ResultSet resultSet = pStatement.executeQuery();
resultSet.next();
return resultSet.getInt( 1 );
}
}
//159
public class func{
	public void test_getNCharacterStream_1(){
        Connection conn = dataSource.getConnection();
        PreparedStatement stmt = conn.prepareStatement("select ?");
        stmt.setNull(1, Types.VARCHAR);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        Assert.assertNull(rs.getNCharacterStream("1"));
        rs.close();
}
}
//160
public class func{
	public void getProxyLoadMatrix(){
        Transaction txn = Transaction.currentTxn();;
            pstmt = txn.prepareAutoCloseStatement(PROXY_ASSIGNMENT_MATRIX);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
              l.add(new Pair<Long, Integer>(rs.getLong(1), rs.getInt(2)));
            }
}
}
//161
public class func{
	public void getMode(){
            PreparedStatement prep = conn.prepareStatement(
                    "SELECT VALUE FROM INFORMATION_SCHEMA.SETTINGS WHERE NAME=?");
            prep.setString(1, "MODE");
            ResultSet rs = prep.executeQuery();
            rs.next();
            mode = rs.getString(1);
}
}
//162
public class func{
	public void run(PreparedStatement stm){
                        stm.setInt(1, bag.getSavedBagId());
                        ResultSet rs = stm.executeQuery();
                        while (rs.next()) {
                            usersWithAccess.add(rs.getString(1));
                        }
}
}
//163
public class func{
	public void testQueryCacheTimestamp(){
        deleteDb("optimizations");
        Connection conn = getConnection("optimizations");
        PreparedStatement prep = conn.prepareStatement(
                "SELECT CURRENT_TIMESTAMP()");
        ResultSet rs = prep.executeQuery();
        rs.next();
        String a = rs.getString(1);
}
}
//164
public class func{
	public void getDatabaseProperty(Connection conn,String key){
        PreparedStatement   ps = chattyPrepare( conn, "values( syscs_util.syscs_get_database_property( '" + key + "' ) )" );
        ResultSet   rs = ps.executeQuery();
            rs.next();
            return rs.getString( 1 );
            rs.close();
}
}
//165
public class func{
	public void fire(Connection conn,ResultSet oldSt,ResultSet newSt){
            smt.setString(1, newSt.getString("folder"));
            ResultSet rs=smt.executeQuery();
            boolean found=rs.next();
}
}
//166
public class func{
	public void testInstrFilter(Connection conn,String queryToExecute,String expected){
        PreparedStatement stmt = conn.prepareStatement(queryToExecute);
        rs = stmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
}
}
//167
public class func{
	public void countAll(){
    PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) FROM " + TABLE_NAME);
    ResultSet rs = stmt.executeQuery();
    rs.next();
    int number = rs.getInt(1);
    rs.close();
}
}
//168
public class func{
	public void testFetchLargeClobs(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from largeClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            Reader content = clob.getCharacterStream();
            long remaining = rs.getInt(2);
            while (remaining > 0) {
                remaining -= content.read(charBuf);
            }
            content.close();
        }
        rs.close();
}
}
//169
public class func{
	public void find(PreparedStatement stmt){
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
      result.add(buildHeaderFromResultSet(rs));
    }
    rs.close();
}
}
//170
public class func{
	public void getTotalUsersCommon(PreparedStatement p){
    ResultSet rs = p.executeQuery();
    rs.next();
    int total = rs.getInt(1);
    rs.close();
}
}
//171
public class func{
	public void getSecHostId(long volumeId){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            pstmt.setLong(1, volumeId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
}
}
//172
public class func{
	public void decimal10columns(){
        PreparedStatement ps = getOrPrepareStatement(
                "SELECT DEC1,DEC2,DEC3,DEC4,DEC5,DEC6,DEC7,DEC8,DEC9,DEC10 " +
                "FROM T --DERBY-PROPERTIES index=T_DEC_ALL");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            for (int col = 1; col <= 10; col++) {
                assertNotNull(rs.getBigDecimal(col));
            }
        }
        rs.close();
}
}
//173
public class func{
	public void getOrderData(Connection conn,int orderID){
        PreparedStatement stmt = getStatement(conn, getOrderSQL);
        stmt.setInt(1, orderID);
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getOrderData -- no results for orderID:" + orderID);
        else
            orderData = getOrderDataFromResultSet(rs);
        stmt.close();
}
}
//174
public class func{
	public void getPages(){
      PreparedStatement psPages = evalDb.getConnection().prepareStatement("SELECT t.page_id FROM "
        + truthTableName + " t GROUP BY page_id");
      ResultSet res = psPages.executeQuery();
      while (res.next()) {
        pages.add(res.getInt("page_id"));
      }
}
}
//175
public class func{
	public void retrieve_long(long inID,String inField){
      PreparedStatement stmt = mDB.prepareStatement("SELECT " + inField + " FROM state WHERE remote_id = ?");
      stmt.setLong(1, inID);
      ResultSet rs = stmt.executeQuery();
      if( rs.next() == false )
        return -1;
      return rs.getLong(1);
}
}
//176
public class func{
	public void getHoldingData(Connection conn,int holdingID){
        PreparedStatement stmt = getStatement(conn, getHoldingSQL);
        stmt.setInt(1, holdingID);
        ResultSet rs = stmt.executeQuery();
        if (!rs.next())
            Log.error("TradeJdbc:getHoldingData -- no results -- holdingID=" + holdingID);
        else
            holdingData = getHoldingDataFromResultSet(rs);
        stmt.close();
}
}
//177
public class func{
	public void testLargeClobTruncateLengthMinusOne(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from largeClobs where id = 8");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int length = rs.getInt(2);
            clob.truncate(length -1);
        }
}
}
//178
public class func{
	public void testBooleanIntegerBind(){
        pstmt.setObject(1, new Boolean(true), java.sql.Types.INTEGER);
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(1, rs.getInt(1));
        rs.close();
}
}
//179
public class func{
	public void numberOfTiles(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT COUNT(*) FROM %s WHERE zoom_level=?", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            rs.next();
            size = rs.getInt(1);
            rs.close();
}
}
//180
public class func{
	public void testStatementDescribe(){
      ResultSet rs = pstmt.executeQuery();
      assertTrue(rs.next());
      assertEquals(2, rs.getInt(1));
      rs.close();
}
}
//181
public class func{
	public void testPreparedSetSchemaFunctionLarge(){
        PreparedStatement ps = prepareStatement("SELECT X, " +
                "APP.GET_SCHEMA_TRANSITION(SCHEMANAME), " +
                "Y FROM APP.LARGE");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertTrue(rs.getString(2).length() > 2);
            verifyCachedSchema(getConnection());
        }
}
}
//182
public class func{
	public void readMinusCounter(Connection conn){
        PreparedStatement   ps = chattyPrepare( conn, "values ( f_readMinusCounter() )" );
        ResultSet                   rs = ps.executeQuery();
        rs.next();
        int     result = rs.getInt( 1 );
        rs.close();
}
}
//183
public class func{
	public void assertScalarResult(String queryText,int expectedValue){
        PreparedStatement ps = chattyPrepare( queryText );
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals( expectedValue, rs.getInt( 1 ) );
        rs.close();
}
}
//184
public class func{
	public void testPreparedSetSchemaFunction(){
        PreparedStatement ps = prepareStatement("SELECT " +
                "APP.GET_SCHEMA_TRANSITION(SCHEMANAME) FROM SYS.SYSSCHEMAS");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertTrue(rs.getString(1).length() > 2);
            verifyCachedSchema(getConnection());
        }
}
}
//185
public class func{
	public void testBooleanBind(){
        assertTrue(((PGStatement)pstmt).isUseServerPrepare());
        pstmt.setBoolean(1, false);
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(9, rs.getInt(1));
        rs.close();
}
}
//186
public class func{
	public void getLastAccountId(){
        Transaction txn = Transaction.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return Long.valueOf(rs.getLong(1));
            }
}
}
//187
public class func{
	public void executeScalar(PreparedStatement ps,Long defaultValue){
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
            closeQuietly(rs);
}
}
//188
public class func{
	public void testDateFuncWithParam(){
        if (!TestUtil.haveMinimumServerVersion(con, "8.0"))
            return;
        PreparedStatement ps = con.prepareStatement("SELECT {fn timestampadd(SQL_TSI_QUARTER, ? ,{fn now()})}, {fn timestampadd(SQL_TSI_MONTH, ?, {fn now()})} ");
        ps.setInt(2, 12);
        ResultSet rs = ps.executeQuery();
        assertTrue(rs.next());
        assertEquals(rs.getTimestamp(1), rs.getTimestamp(2));
}
}
//189
public class func{
	public void getLastVmDiskStatsId(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return Long.valueOf(rs.getLong(1));
            }
}
}
//190
public class func{
	public void testEmptyResults(){
            pstmt.setInt(1, -1);
            ResultSet rs = pstmt.executeQuery();
            assertFalse(rs.next());
            rs.close();
}
}
//191
public class func{
	public void selectData(Connection connection,long fileSourceId){
    PreparedStatement pstmt = connection.prepareStatement("select binary_data from file_sources where id=?");
      pstmt.setLong(1, fileSourceId);
      rs = pstmt.executeQuery();
      rs.next();
      InputStream data = rs.getBinaryStream(1);
      return FileSourceDto.decodeSourceData(data);
      DbUtils.closeQuietly(pstmt);
}
}
//192
public class func{
	public void existRaterRating(Connection con,RaterRatingPK pk){
    prepStmt.setString(1, pk.getInstanceId());
    prepStmt.setString(2, pk.getContributionId());
    prepStmt.setString(3, pk.getContributionType());
    prepStmt.setString(4, pk.getRater().getId());
      rs = prepStmt.executeQuery();
      return (rs.next());
      DBUtil.close(rs, prepStmt);
}
}
//193
public class func{
	public void _assertResourceBlockReferenceCount(long resourceBlockId,long expectedCountValue){
    Connection connection = DataAccess.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(
      "SELECT referenceCount FROM ResourceBlock WHERE " +
        "resourceBlockId = " + resourceBlockId);
    ResultSet resultSet = preparedStatement.executeQuery();
    Assert.assertTrue(resultSet.next());
    Assert.assertEquals(expectedCountValue, resultSet.getLong(1));
    DataAccess.cleanUp(connection, preparedStatement, resultSet);
}
}
//194
public class func{
	public void _assertNoSuchResourceBlock(long resourceBlockId){
    Connection connection = DataAccess.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(
      "SELECT * FROM ResourceBlock WHERE resourceBlockId = ?");
    preparedStatement.setLong(1, resourceBlockId);
    ResultSet resultSet = preparedStatement.executeQuery();
    Assert.assertFalse(resultSet.next());
    DataAccess.cleanUp(connection, preparedStatement, resultSet);
}
}
//195
public class func{
	public void tableExists(ResourceContext<PostgresDatabaseComponent> context){
            statement.setString(1, getSchemaNameFromContext(context));
            statement.setString(2, getTableNameFromContext(context)); // Do not use quoted name here
            resultSet = statement.executeQuery();
            return resultSet.next();
            safeClose(connection, statement, resultSet);
}
}
//196
public class func{
	public void runOneRowQueryTest(String oneRowQuery,Integer pkValue,String projectedValue){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL);
            PreparedStatement statement = conn.prepareStatement(oneRowQuery);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
}
}
//197
public class func{
	public void checkPasswordSecure(String pwd){
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setString(1, pwd);
        ResultSet rs = prep.executeQuery();
        return rs.next();
}
}
//198
public class func{
	public void contains(String cacheEntryName){
      PreparedStatement stmt = conn.prepareStatement("SELECT key FROM " + TABLE_NAME + " WHERE key = ?;");
      stmt.setString(1, cacheEntryName);
      ResultSet result = stmt.executeQuery();
      boolean b = result.next();
}
}
//199
public class func{
	public void testNegativeAgainstUnsignedNone(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertFalse(rs.next());
            conn.close();
}
}
//200
public class func{
	public void isAuthAvailable(String user){
            pst = con.prepareStatement("SELECT * FROM " + tableName + " WHERE LOWER(" + columnName + ")=LOWER(?);");
            pst.setString(1, user);
            rs = pst.executeQuery();
            return rs.next();
}
}
//201
public class func{
	public void runOneRowQueryTest(String oneRowQuery,boolean isIntegerColumn,Integer expectedIntValue,BigDecimal expectedDecimalValue){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL);
            PreparedStatement statement = conn.prepareStatement(oneRowQuery);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
}
}
//202
public class func{
	public void testPreparedFunction(){
    PreparedStatement pstmt = con.prepareStatement("SELECT {fn concat('a', ?)}");
    pstmt.setInt(1, 5);
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    assertEquals("a5", rs.getString(1));
}
}
//203
public class func{
	public void prepareAndExecuteQuery(Connection conn,String sql){
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    rs.next();
}
}
//204
public class func{
	public void exists(Postgres9Connection pcon,String id){
        Connection con = pcon.getConnection();
            ps = con.prepareStatement("SELECT 1 FROM " + tableName + " WHERE id = ?");
            ps.setObject(1, id, Types.OTHER);
            rs = ps.executeQuery();
            return rs.next();
}
}
//205
public class func{
	public void vetBytes_5679(Connection conn,byte[][] expected){
        PreparedStatement   ps = conn.prepareStatement( "select * from t_5679_2" );
        ResultSet   rs = ps.executeQuery();
        rs.next();
}
}
//206
public class func{
	public void reserveSlotsInBulkUsingBindsAndAssertValue(int expectedValue,long numSlotToAllocate){
        PreparedStatement ps = conn.prepareStatement("SELECT NEXT ? VALUES FOR bulkalloc.alpha FROM SYSTEM.\"SEQUENCE\"");
        ps.setLong(1, numSlotToAllocate);
        ResultSet rs = ps.executeQuery();
        assertTrue(rs.next());
        int retValue = rs.getInt(1);
        assertEquals(expectedValue, retValue);
}
}
//207
public class func{
	public void bindExecute(HrPreparedStatement state){
      st.setInt(1, state.id);
      rs = st.executeQuery();
      rs.next();
      ename = rs.getString(1);
      close(rs, null); // Statement is not closed
}
}
//208
public class func{
	public void getScalarLong(PreparedStatement ps){
        ResultSet rs = ps.executeQuery();
        rs.next();
        long retval = rs.getLong( 1 );
        rs.close();
}
}
//209
public class func{
	public void testBinaryFetch(){
        PreparedStatement stmt = con.prepareStatement("declare test_cursor binary cursor for select * from test_fetch");
        stmt.execute();
        stmt = con.prepareStatement("fetch forward from test_cursor");
        ResultSet rs = stmt.executeQuery();
        while (rs.next())
        {
            //there should only be one row returned
            byte[] dataBytes = rs.getBytes(2);
            assertEquals("binary data got munged", DATA_STRING, new String(dataBytes, "UTF8"));
        }
}
}
//210
public class func{
	public void testPrepareSetDate(){
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setDate(1, dtValue);
      ResultSet res = ps.executeQuery();
      assertTrue(res.next());
      assertEquals("2013-01-01", res.getString(20));
      ps.close();
}
}
//211
public class func{
	public void assertCharacterPadding(PreparedStatement statement,String rowKey,String testString){
        ResultSet rs = statement.executeQuery();
        assertTrue(rs.next());
        assertEquals(rowKey, rs.getString(1));
        assertEquals(testString, rs.getString(2));
}
}
//212
public class func{
	public void testPreparedStatementFetch(){
        PreparedStatement statement = connection.prepareStatement(FETCH_QUERY);
        statement.setQueryTimeout(1);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
            }
}
}
//213
public class func{
	public void listUpdatedStats(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(UPDATED_VM_NETWORK_STATS_SEARCH);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                vmDiskStats.add(toEntityBean(rs, false));
            }
}
}
//214
public class func{
	public void listUpdatedStats(){
        TransactionLegacy txn = TransactionLegacy.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(UPDATED_STATS_SEARCH);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                userStats.add(toEntityBean(rs, false));
            }
}
}
//215
public class func{
	public void getTentativeJournalHeadersForUser(Connection con,String userId){
      prepStmt = getTentativePreparedStatement(con, userId);
      rs = prepStmt.executeQuery();
      while (rs.next()) {
        JournalHeader journal = getJournalHeaderFromResultSet(rs);
        list.add(journal);
      }
      DBUtil.close(rs, prepStmt);
}
}
//216
public class func{
	public void getHighestCurrKey(String table,String keyName){
            stmt = conn.prepareStatement("SELECT MAX(" + keyName + 
                ") FROM " + table);
            rs = stmt.executeQuery();
            rs.next();
            return rs.getInt(1);  
            DBUtil.closeJDBCObjects(ctx, null, stmt, rs);
}
}
//217
public class func{
	public void testRemotePrepareExecute(){
        remoteConnection.prepareStatement("select * from \"hr\".\"emps\"");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      ++count;
    }
}
}
//218
public class func{
	public void hasResults(PreparedStatement statement){
    ResultSet rs = statement.executeQuery();
      return rs.next();
      rs.close();
}
}
//219
public class func{
	public void getValue(PreparedStatement ps,double value){
        ps.setDouble(1, value);
        ResultSet rs = ps.executeQuery();
        rs.next(); // we know a single value will be returned.
        double rValue = rs.getDouble(1);
        rs.close();
}
}
//220
public class func{
	public void displayMultipleRangeQueryTime(Connection con,long now){
    ResultSet rs = ps.executeQuery();
    while (rs.next())
      count++;
}
}
//221
public class func{
	public void count(final String sql){
        LOG.debug("SQL: " + sql);
            statement = connection.prepareStatement(sql);
            final ResultSet result = statement.executeQuery();
            result.next();
            final int count = result.getInt(1);
}
}
//222
public class func{
	public void testQueryCacheTimestamp(){
        rs = prep.executeQuery();
        rs.next();
        String b = rs.getString(1);
        assertFalse(a.equals(b));
        conn.close();
}
}
//223
public class func{
	public void testCachingResultsCheckResult(PreparedStatement ps,int expected){
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals(expected, rs.getInt(1));
}
}
//224
public class func{
	public void getAndCreatePartition(final String tableName,final Date time,final Connection conn){
            ps.setTimestamp(2, new Timestamp(time.getTime()));
            final ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString(1);
}
}
//225
public class func{
	public void testDateFuncWithParam(){
    PreparedStatement ps = con.prepareStatement("SELECT {fn timestampadd(SQL_TSI_QUARTER, ? ,{fn now()})}, {fn timestampadd(SQL_TSI_MONTH, ?, {fn now()})} ");
    ps.setInt(2, 12);
    ResultSet rs = ps.executeQuery();
    assertTrue(rs.next());
    assertEquals(rs.getTimestamp(1), rs.getTimestamp(2));
}
}
//226
public class func{
	public void isUserManager(Connection con,String userId){
      prepStmt.setInt(1, Integer.parseInt(userId));
      rs = prepStmt.executeQuery();
      return (rs.next());
      DBUtil.close(rs, prepStmt);
}
}
//227
public class func{
	public void testExecutePreparedStatement(){
        final PreparedStatement ps = conn.prepareStatement("start n=node({1}) return ID(n) as id");
        ps.setLong(1,0L);
        final ResultSet rs = ps.executeQuery();
        assertTrue(rs.next());
        assertEquals(0, ((Number)rs.getObject("id")).intValue());
}
}
//228
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT nid FROM %s WHERE alias = ?", MAPPINGS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, node)));
                ps.setString(1, node);
                ResultSet rs = open(ps.executeQuery());
                return rs.next() ? rs.getString(1) : null;
}
}
//229
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT val FROM %s WHERE nid = ? AND key = ?", PROPS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, node, key)));
                ps.setString(2, key);
                ResultSet rs = open(ps.executeQuery());
                if (rs.next()) {
                    return rs.getString(1);
                } else {
                    return null;
                }
}
}
//230
public class func{
	public void queryLong(){
        final PreparedStatement preparedStatement = conn.prepareStatement("SELECT count(*) FROM DomainEventEntry e");
        final ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getLong(1);
}
}
//231
public class func{
	public void doRun(Connection cx){
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, s, k)));
                ps.setString(2, k);
                ResultSet rs = open(ps.executeQuery());
                return rs.next() ? rs.getString(1) : null;
}
}
//232
public class func{
	public void getNextLobId(){
        reuse(sql, prep);
        prep = prepare(sql);
        rs = prep.executeQuery();
        rs.next();
        x = Math.max(x, rs.getLong(1) + 1);
        reuse(sql, prep);
}
}
//233
public class func{
	public void getNextLobId(){
        PreparedStatement prep = prepare(sql);
        ResultSet rs = prep.executeQuery();
        rs.next();
        long x = rs.getLong(1) + 1;
}
}
//234
public class func{
	public void testCreateEmptyArrayOfIntViaAlias(){
    PreparedStatement pstmt = conn.prepareStatement("SELECT ?::int[]");
    pstmt.setArray(1, conn.createArrayOf("integer", in));
    ResultSet rs = pstmt.executeQuery();
    assertTrue(rs.next());
    Array arr = rs.getArray(1);
    Integer[] out = (Integer[]) arr.getArray();
}
}
//235
public class func{
	public void testDate(Connection conn){
        Timestamp ts = Timestamp.valueOf("2001-02-03 04:05:06");
        prep.setObject(1, new java.util.Date(ts.getTime()));
        ResultSet rs = prep.executeQuery();
        rs.next();
        Timestamp ts2 = rs.getTimestamp(1);
        assertEquals(ts.toString(), ts2.toString());
}
}
//236
public class func{
	public void testSimpleArgumentSelect(){
        PGobject pgo = new PGobject();
        pgo.setType("simplecompositetest");
        pgo.setValue("(1,2.2,)");
        pstmt.setObject(1, pgo);
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo2 = (PGobject)rs.getObject(1);
        assertEquals(pgo, pgo2);
}
}
//237
public class func{
	public void testPreparedStatementMissingParameter(){
        final PreparedStatement ps = conn.prepareStatement("start n=node({1}) return ID(n) as id");
        final ResultSet rs = ps.executeQuery();
        rs.next();
}
}
//238
public class func{
	public void testComplexSelect(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT '(\"{1,2}\",{},\"(1,2.2,)\")'::\"Composites\".\"ComplexCompositeTest\"");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo = (PGobject)rs.getObject(1);
        assertEquals("\"Composites\".\"ComplexCompositeTest\"", pgo.getType());
        assertEquals("(\"{1,2}\",{},\"(1,2.2,)\")", pgo.getValue());
}
}
//239
public class func{
	public void testCreateEmptyArrayOfIntViaAlias(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT ?::int[]");
        pstmt.setArray(1, _conn.createArrayOf("integer", in));
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        Array arr = rs.getArray(1);
        Integer out[] = (Integer [])arr.getArray();
}
}
//240
public class func{
	public void testSimpleSelect(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT '(1,2.2,)'::simplecompositetest");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        PGobject pgo = (PGobject)rs.getObject(1);
        assertEquals("simplecompositetest", pgo.getType());
        assertEquals("(1,2.2,)", pgo.getValue());
}
}
//241
public class func{
	public void testPreparedByte(){
        pstmt.setObject(2, new Byte((byte)2));
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        assertEquals((byte)1, rs.getByte(1));
}
}
//242
public class func{
	public void expectException(PreparedStatement ps,Object obj1,Object obj2,String expectedSQLState,String label){
      ps.setObject(2, obj2);
      rs = ps.executeQuery();
      rs.next();
}
}
//243
public class func{
	public void testNullArrayElement(){
        PreparedStatement pstmt = _conn.prepareStatement("SELECT array[NULL, NULL]::compositetabletest[]");
        ResultSet rs = pstmt.executeQuery();
        assertTrue(rs.next());
        Array arr = rs.getArray(1);
        assertEquals("compositetabletest", arr.getBaseTypeName());
        Object[] items = (Object[])arr.getArray();
}
}
//244
public class func{
	public void hasTentativeJournalsForUser(Connection con,String userId){
      prepStmt = getTentativePreparedStatement(con, userId);
      rs = prepStmt.executeQuery();
      return rs.next();
      DBUtil.close(rs, prepStmt);
}
}
//245
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT object FROM %s WHERE id = ?", OBJECTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, id)));
                ps.setString(1, id);
                ResultSet rs = open(ps.executeQuery());
                if (!rs.next()) {
                    return null;
                }
                byte[] bytes = rs.getBytes(1);
                return new ByteArrayInputStream(bytes);
}
}
//246
public class func{
	public void doRun(Connection cx){
                String sql = format("SELECT count(*) FROM %s WHERE id = ?", OBJECTS);
                PreparedStatement ps = open(cx.prepareStatement(log(sql, LOG, id)));
                ps.setString(1, id);
                ResultSet rs = open(ps.executeQuery());
                rs.next();
                return rs.getInt(1) > 0;
}
}
//247
public class func{
	public void selectBlob(Connection con,int key){
    PreparedStatement stmt = con.prepareStatement("SELECT value,key FROM blobtest where key = ?");
    stmt.setInt(1, key);
    ResultSet rs = stmt.executeQuery();
    assertTrue ("Executed", rs != null);
    rs.next();
    System.err.println ("blob record \"" + rs.getBlob(1).toString() + "\" key " + rs.getString(2) );
    assertTrue (" Only one record ", rs.isLast());
    Blob b = rs.getBlob(1);
}
}
//248
public class func{
	public void testIsClosed(){
            Connection conn = newConnection();
            assertNotNull(conn);
            assertTrue(!conn.isClosed());
            PreparedStatement stmt = conn.prepareStatement("select * from dual");
            assertNotNull(stmt);
            ResultSet rset = stmt.executeQuery();
            assertNotNull(rset);
            assertTrue(rset.next());
            rset.close();
}
}
//249
public class func{
	public void testSimple(){
        Connection conn = pcds.getPooledConnection().getConnection();
        assertNotNull(conn);
        PreparedStatement stmt = conn.prepareStatement("select * from dual");
        assertNotNull(stmt);
        ResultSet rset = stmt.executeQuery();
        assertNotNull(rset);
        assertTrue(rset.next());
        rset.close();
}
}
//250
public class func{
	public void executeStmt(PreparedStatement stmt){
            ResultSet rs = stmt.executeQuery();
            d.watch(rs);
            while (rs.next()) {
                m_rowProcessor.processRow(rs);
                m_count++;
            }
}
}
//251
public class func{
	public void getProxyActiveLoad(long proxyVmId){
        Transaction txn = Transaction.currentTxn();
            pstmt = txn.prepareAutoCloseStatement(GET_PROXY_ACTIVE_LOAD);
            pstmt.setLong(1, proxyVmId);
            ResultSet rs = pstmt.executeQuery();
            if(rs != null && rs.first()) {
                return rs.getInt(1);
            }
}
}
