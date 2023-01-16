//43
public class func{
	public void testArrayFillFunctionTimestamp(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(timestamp,3) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
}
}
