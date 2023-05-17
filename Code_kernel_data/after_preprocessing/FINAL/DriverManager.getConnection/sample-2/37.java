public class func{
public void testRoundFloat(){
    Connection conn = DriverManager.getConnection(getUrl());
    ResultSet rs = conn.createStatement().executeQuery("SELECT ROUND(fl), ROUND(fl, 1), ROUND(fl, 2), ROUND(fl, 3) FROM t1");
    assertTrue(rs.next());
    assertEquals(0, Floats.compare(1, rs.getFloat(1)));
    assertEquals(0, Floats.compare(1.3f, rs.getFloat(2)));
    assertEquals(0, Floats.compare(1.26f, rs.getFloat(3)));
    assertEquals(0, Floats.compare(1.264f, rs.getFloat(4)));
}
}
