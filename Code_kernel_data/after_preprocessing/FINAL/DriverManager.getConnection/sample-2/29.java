public class func{
public void testRoundingUpDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(dt, 'day'), ROUND(dt, 'hour', 1), ROUND(dt, 'minute', 1), ROUND(dt, 'second', 1), ROUND(dt, 'millisecond', 1) FROM ROUND_DATE_TIME_TS_DECIMAL");
        assertTrue(rs.next());
}
}
