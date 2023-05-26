public class func{
public void testArrayUpsertTimeStampWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t13 ( k VARCHAR PRIMARY KEY, a TIMESTAMP[])");
}
}
