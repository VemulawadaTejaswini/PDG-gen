//68
public class func{
	public void testEmptyColumn(){
        deleteDb("view");
        Connection conn = getConnection("view");
        Statement stat = conn.createStatement();
        stat.execute("select * from test_view where a between 1 and 2 and b = 2");
}
}
