//15
public class func{
public void testToCharWithFormatOnDate(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(dateFormatter.format(D1), rs.getString(2));
}
}
