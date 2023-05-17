//24
public class func{
public void testNoKVColumn(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
        conn.setAutoCommit(true);
        PreparedStatement stmt = conn.prepareStatement(
                "upsert into BTABLE VALUES (?, ?, ?, ?, ?)");
        stmt.setString(3, "x");
        stmt.setInt(4, 1);
        stmt.setString(5, "ab");
        stmt.execute();
}
}
