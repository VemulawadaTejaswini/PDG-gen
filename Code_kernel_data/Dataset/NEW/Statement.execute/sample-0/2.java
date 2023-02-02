//2
public class func{
public void testSetEmptyLiteral(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET min_client_messages TO ''"));
    assertTrue(s.execute("SHOW min_client_messages"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    assertEquals("", rs.getString(1));
}
}
