public class func{
public void testDistinctLimitScan(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(rs.getString(1), A_VALUE);
            assertFalse(rs.next());
            conn.close();
}
}
