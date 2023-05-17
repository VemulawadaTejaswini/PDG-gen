public class func{
public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("INSERT INTO hold VALUES (2)");
        stmt.close();
}
}
