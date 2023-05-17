//2
public class func{
public void testReverse(Connection conn,String s){
        rs = conn.createStatement().executeQuery("SELECT reverse(pk) FROM REVERSE_TEST");
        assertTrue(rs.next());
        assertEquals(reverse, rs.getString(1));
        assertFalse(rs.next());
        PreparedStatement stmt = conn.prepareStatement("SELECT pk FROM REVERSE_TEST WHERE pk=reverse(?)");
        stmt.setString(1, reverse);
        rs = stmt.executeQuery();
        assertTrue(rs.next());
        assertEquals(s, rs.getString(1));
        assertFalse(rs.next());
}
}
