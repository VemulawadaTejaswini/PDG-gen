//15
public class func{
public void testArrayFillFunctionInWhere4(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY[23.45, 23.45, 23.45]=ARRAY_FILL(23.45, 3)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
