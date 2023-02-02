//28
public class func{
	public void testArrayToStringFunctionWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY['a', NULL, 'b'], ', ','*') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
