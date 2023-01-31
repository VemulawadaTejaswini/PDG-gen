//9
public class func{
	public void testEmptyStatements(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute(" ;");
}
}
