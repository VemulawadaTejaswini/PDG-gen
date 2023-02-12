public class func{
public void testRoundingUpDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE ROUND(dt, 'day') = to_date('2012-01-02 00:00:00')");
        assertTrue(rs.next());
}
}
