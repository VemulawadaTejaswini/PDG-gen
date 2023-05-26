public class func{
public void initTableValues(String tenantId,byte[][] splits,long ts){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            assertNoRows(conn);
            initTableValues(conn, tenantId);
            conn.commit();
            conn.close();
}
}
