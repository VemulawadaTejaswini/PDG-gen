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
