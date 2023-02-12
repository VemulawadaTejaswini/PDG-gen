public class func{
public void testCountIsNull(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertEquals(6, rs.getLong(1));
            assertFalse(rs.next());
            conn.close();
}
}
