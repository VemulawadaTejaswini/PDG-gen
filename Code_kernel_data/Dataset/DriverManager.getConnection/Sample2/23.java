//22
public class func{
	public void testArrayToStringFunctionInWhere5(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE 'a, bbbb, c, ddd, e' = ARRAY_TO_STRING(ARRAY['a', 'bbbb', 'c' , 'ddd', 'e'], ', ')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
