//1
public class func{
public void testGetSplitsWithSkipScanFilter(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        PhoenixConnection pconn = conn.unwrap(PhoenixConnection.class);
}
}
