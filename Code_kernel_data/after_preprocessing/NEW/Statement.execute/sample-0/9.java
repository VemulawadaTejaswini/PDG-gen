//9
public class func{
public void testNoExec(){
    Statement s = conn.createStatement();
    s.execute("set noexec on");
    ResultSet rs = s.executeQuery("select * from all_tables");
    assertFalse(rs.next());
    s.execute("SET NOEXEC off");
    rs = s.executeQuery("select * from all_tables");
    assertTrue(rs.next());
}
}
