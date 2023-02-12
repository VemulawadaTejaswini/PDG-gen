public class func{
public void testCeilDouble(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT CEIL(doub), CEIL(doub, 1), CEIL(doub, 2), CEIL(doub, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Doubles.compare(2, rs.getDouble(1)));
    assertEquals(0, Doubles.compare(1.3, rs.getDouble(2)));
    assertEquals(0, Doubles.compare(1.27, rs.getDouble(3)));
    assertEquals(0, Doubles.compare(1.264, rs.getDouble(4)));
}
}
