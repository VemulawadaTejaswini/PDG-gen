//9
public class func{
public void initTableValues(long ts){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        PreparedStatement stmt = conn.prepareStatement(
            "upsert into " +
            "KEYONLY VALUES (?, ?)");
        stmt.setInt(2, 2);
        stmt.execute();
        stmt.setInt(2, 4);
        stmt.execute();
}
}
