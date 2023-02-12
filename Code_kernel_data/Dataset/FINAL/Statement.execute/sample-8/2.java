public class func{
public void testClob(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select cast('abc' as clob)"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String clob = rs.getString(1);
    assertEquals("abc", clob);
}
}
