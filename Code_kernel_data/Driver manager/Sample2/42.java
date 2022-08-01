//41
public class func{
	public void testRoundingUpTime(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(t, 'day', 1), ROUND(t, 'hour', 1), ROUND(t, 'minute', 1), ROUND(t, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
