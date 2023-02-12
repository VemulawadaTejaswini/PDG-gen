public class func{
public void testRoundingUpDecimalInWhere(){
        Connection conn = DriverManager.getConnection(getUrl());
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE ROUND(dec, 2) = 1.26");
        assertTrue(rs.next());
}
}
