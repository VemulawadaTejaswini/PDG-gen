public class func{
public void testArrayUpsertIntWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t1 ( k VARCHAR PRIMARY KEY, a INTEGER[])");
}
}
