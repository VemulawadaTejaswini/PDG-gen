//7
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE TEMP TABLE uuidtest(id uuid)");
        stmt.close();
}
}
