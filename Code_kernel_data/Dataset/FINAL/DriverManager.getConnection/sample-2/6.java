public class func{
public void testArrayPrependFunctionInWhere5(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT region_name FROM regions WHERE ARRAY['foo','2345','46345','23234']=ARRAY_PREPEND('foo',varchars)");
        assertTrue(rs.next());
        assertEquals("SF Bay Area", rs.getString(1));
        assertFalse(rs.next());
}
}
