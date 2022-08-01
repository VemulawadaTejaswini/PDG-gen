//4
public class func{
	public void before(){
    conn = TestUtil.openDB();
    Statement stmt = conn.createStatement();
    stmt.execute("CREATE TABLE truncatetest(id uuid)");
    stmt.close();
}
}
