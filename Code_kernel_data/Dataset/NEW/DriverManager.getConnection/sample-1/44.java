//44
public class func{
public void testArrayUpsertDateWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t9 ( k VARCHAR PRIMARY KEY, a DATE[])");
}
}
