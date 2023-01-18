//46
public class func{
	public void testArrayFillFunctionInteger(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(integer,4) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("INTEGER", objects);
}
}
