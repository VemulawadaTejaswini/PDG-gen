public class func{
public void initTableValues(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        PreparedStatement stmt = conn.prepareStatement(
                "upsert into " + TABLE_NAME + " VALUES (?, ?)");
}
}
