//7
public class func{
	public void testPrepareExecute(Connection conn){
        Statement stat = conn.createStatement();
        stat.execute("prepare test(int, int) as select ?1*?2");
        ResultSet rs = stat.executeQuery("execute test(3, 2)");
        rs.next();
        assertEquals(6, rs.getInt(1));
        stat.execute("deallocate test");
}
}
