//12
public class func{
	public void testCeilDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT CEIL(dt, 'day', 1), CEIL(dt, 'hour', 1), CEIL(dt, 'minute', 1), CEIL(dt, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
