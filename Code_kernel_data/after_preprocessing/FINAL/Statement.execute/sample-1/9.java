public class func{
public void setUp(){
        _conn = TestUtil.openDB();
        Statement stmt = _conn.createStatement();
        stmt.execute("CREATE OR REPLACE FUNCTION return_bool(boolean) RETURNS boolean AS 'BEGIN RETURN $1; END;' LANGUAGE plpgsql");
        stmt.close();
}
}
