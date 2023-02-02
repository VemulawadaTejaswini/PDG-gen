//1
public class func{
public void testTableWithInvalidBucketNumber(){
        Properties props = PropertiesUtil.deepCopy(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.execute();
}
}
