//35
public class func{
public void testFloorDate(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(dt, 'day', 1), FLOOR(dt, 'hour', 1), FLOOR(dt, 'minute', 1), FLOOR(dt, 'second', 1) FROM t1");
        assertTrue(rs.next());
}
}
