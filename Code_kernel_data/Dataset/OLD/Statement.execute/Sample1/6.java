//5
public class func{
	public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("INSERT INTO xmltest VALUES (2, '" + _xmlFragment + "')");
        stmt.close();
}
}
