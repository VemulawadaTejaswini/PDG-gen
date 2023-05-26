//14
public class func{
public void testToCharOnDate(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(DateUtil.DEFAULT_DATE_FORMATTER.format(D1), rs.getString(2));
}
}
