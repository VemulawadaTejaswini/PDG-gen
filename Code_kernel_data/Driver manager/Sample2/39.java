//38
public class func{
	public void testFloorTimestamp(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(ts, 'day'), FLOOR(ts, 'hour', 1), FLOOR(ts, 'minute', 1), FLOOR(ts, 'second', 1), FLOOR(ts, 'millisecond', 1) FROM ROUND_DATE_TIME_TS_DECIMAL");
        assertTrue(rs.next());
}
}
