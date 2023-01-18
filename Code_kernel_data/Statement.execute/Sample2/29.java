//28
public class func{
	public void testKeyAsColumnInMySQLMode(){
        Connection c = getConnection("compatibility;MODE=MYSQL");
        Statement stat = c.createStatement();
        stat.execute("drop table test");
}
}
