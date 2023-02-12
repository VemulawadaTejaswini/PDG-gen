public class func{
public void testArrayFillFunctionInWhere3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY['2345', '2345', '2345', '2345']=ARRAY_FILL('2345', 4)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
