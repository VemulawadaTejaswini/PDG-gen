//21
public class func{
	public void testSplit_InFilter(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT ID FROM SPLIT_TEST WHERE (REGEXP_SPLIT(VAL, ','))[1] = 'ONE'");
        assertTrue(rs.next());
        assertEquals(1, rs.getInt(1));
        assertFalse(rs.next());
}
}
