//18
public class func{
	public void testFloorDateInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE FLOOR(dt, 'hour') = to_date('2012-01-01 14:00:00')");
        assertTrue(rs.next());
}
}
