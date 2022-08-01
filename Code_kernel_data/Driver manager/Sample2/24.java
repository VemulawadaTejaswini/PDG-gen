//23
public class func{
	public void testArrayToStringFunctionInWhere3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE '1.1,2.2,3.3' = ARRAY_TO_STRING(ARRAY[1.1, 2.2, 3.3], ',')");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
