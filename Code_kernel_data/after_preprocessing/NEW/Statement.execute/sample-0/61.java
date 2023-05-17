//61
public class func{
public void tearDown(){
        _conn.setSchema(null);
        Statement stmt = _conn.createStatement();
        stmt.execute("DROP SCHEMA \"UpperCase\" CASCADE");
}
}
