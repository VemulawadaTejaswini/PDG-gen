//10
public class func{
public void testSumFloat(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            assertTrue (rs.next());
            assertTrue(Floats.compare(rs.getFloat(1), 0.15f)==0);
            assertFalse(rs.next());
            conn.close();
}
}
