//18
public class func{
public void testOr(){
        Connection conn5 = DriverManager.getConnection(getUrl(), props);
        PreparedStatement statement = conn5.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        assertTrue(rs.next());
        assertEquals(1, rs.getInt(1));
        assertTrue(rs.next());
        assertEquals(3, rs.getInt(1));
        assertFalse(rs.next());
        conn5.close();
}
}
