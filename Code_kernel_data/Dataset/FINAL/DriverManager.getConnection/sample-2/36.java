public class func{
public void testFloorDouble(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT FLOOR(doub), FLOOR(doub, 1), FLOOR(doub, 2), FLOOR(doub, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Doubles.compare(1, rs.getDouble(1)));
    assertEquals(0, Doubles.compare(1.2, rs.getDouble(2)));
    assertEquals(0, Doubles.compare(1.26, rs.getDouble(3)));
    assertEquals(0, Doubles.compare(1.264, rs.getDouble(4)));
}
}
