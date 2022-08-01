//56
public class func{
	public void testClearSyntaxException(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
            stat.execute("select t.x, t.x t.y from dual t");
}
}
