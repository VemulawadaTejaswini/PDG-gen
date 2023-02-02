//2
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
