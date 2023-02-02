//29
public class func{
public void testCastOperatorInWhere(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, tenantId);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(5, rs.getInt(1));
            assertFalse(rs.next());
            conn.close();
}
}
