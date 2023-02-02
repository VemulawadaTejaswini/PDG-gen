//2
public class func{
public void testLobStreaming(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select xmlelement(name \"root\") from tables"));
    s.getResultSet().next();
    assertEquals("<root></root>", s.getResultSet().getString(1));
    toggleInline(false);
}
}
