public class func{
public void testArrayToStringFunctionInWhere6(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY_TO_STRING(ARRAY[1,2,3], varchar1) = '1, 2, 3'");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
