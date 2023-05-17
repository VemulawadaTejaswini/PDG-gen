//39
public class func{
public void testFloorDoubleInWhere(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM t1 WHERE FLOOR(doub, 2) = 1.26");
    assertTrue(rs.next());
}
}
