//6
public class func{
public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE TEMP TABLE genkeys(a serial, b text, c int)");
        stmt.close();
}
}
