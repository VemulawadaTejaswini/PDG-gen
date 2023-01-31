//5
public class func{
	public void testArrayAppendFunctionInWhere4(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY[23.45,4634.5,2.3234,123.4]=ARRAY_APPEND(ARRAY[23.45,4634.5,2.3234],123.4)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
