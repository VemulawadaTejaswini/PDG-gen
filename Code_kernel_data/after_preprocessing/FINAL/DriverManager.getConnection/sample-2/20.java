public class func{
public void testCeilDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM ROUND_DATE_TIME_TS_DECIMAL WHERE CEIL(dt, 'second') = to_date('2012-01-01 14:25:29')");
        assertTrue(rs.next());
}
}
