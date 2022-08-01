//14
public class func{
	public void testArrayToStringFunctionInWhere2(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE 'a,b,c' = ARRAY_TO_STRING(ARRAY['a', 'b', 'c'], ',')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
