//8
public class func{
	public void testCacheHint(){
    Statement s = conn.createStatement();
    s.execute("set showplan on");
    ResultSet rs = s.executeQuery("/* cache */ select 1");
    assertTrue(rs.next());
    s.execute("set noexec on");
    rs = s.executeQuery("/* cache */ select 1");
    assertTrue(rs.next());
    rs = s.executeQuery("select 1");
    assertFalse(rs.next());
}
}
