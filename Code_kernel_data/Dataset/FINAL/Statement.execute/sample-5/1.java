public class func{
public void testLobStreaming1(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select cast('' as clob) from tables"));
    s.getResultSet().next();
    assertEquals("", s.getResultSet().getString(1));
    toggleInline(false);
}
}
