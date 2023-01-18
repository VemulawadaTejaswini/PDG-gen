//31
public class func{
	public void testRoundingUpDecimal(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(dec), ROUND(dec, 1), ROUND(dec, 2), ROUND(dec, 3) FROM t1");
        assertTrue(rs.next());
}
}
