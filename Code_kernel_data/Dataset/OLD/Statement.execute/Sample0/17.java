//16
public class func{
	public void testLobStreaming(){
    assertTrue(s.execute("select xmlelement(name \"root\") from tables"));
    s.getResultSet().next();
    assertEquals("<root></root>", s.getResultSet().getString(1));
}
}
