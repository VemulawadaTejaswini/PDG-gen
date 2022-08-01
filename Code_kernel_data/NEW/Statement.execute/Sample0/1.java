//0
public class func{
	public void testPayload(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET PAYLOAD x y"));
    assertTrue(s.execute("SELECT commandpayload('x')"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String str = rs.getString(1);
    assertEquals("y", str);
}
}
