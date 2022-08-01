//6
public class func{
	public void testIdentityIndexUsage(){
        Connection conn = getConnection("optimizations");
        Statement stat = conn.createStatement();
        stat.execute("insert into test values()");
        ResultSet rs = stat.executeQuery("explain select * from test where a = 1");
        rs.next();
        assertContains(rs.getString(1), "PRIMARY_KEY");
        stat.execute("drop table test");
}
}
