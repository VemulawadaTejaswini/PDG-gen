//7
public class func{
public void testCoerceTinyIntToSmallInt(){
        Properties props = new Properties(TEST_PROPERTIES);
        Connection conn = DriverManager.getConnection(url, props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue(rs.next());
            assertEquals(ROW9, rs.getString(1));
            assertFalse(rs.next());
            conn.close();
}
}
