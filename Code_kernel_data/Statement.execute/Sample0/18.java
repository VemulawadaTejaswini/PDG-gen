//17
public class func{
	public void testLobStreaming1(){
    assertTrue(s.execute("select cast('' as clob) from tables"));
    s.getResultSet().next();
    assertEquals("", s.getResultSet().getString(1));
}
}
