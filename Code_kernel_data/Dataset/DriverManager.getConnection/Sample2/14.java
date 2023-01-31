//13
public class func{
	public void testNullReverse(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", s);
        rs = conn.createStatement().executeQuery("SELECT reverse(kv) FROM REVERSE_TEST");
        assertTrue(rs.next());
        assertNull(rs.getString(1));
        assertFalse(rs.next());
}
}
