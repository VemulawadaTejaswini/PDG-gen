public class func{
public void testInvalidArrayInQuery(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a INTEGER[10], B INTEGER[10])");
            conn.createStatement().execute("SELECT * FROM t ORDER BY a");
}
}
