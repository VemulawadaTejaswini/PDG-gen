//46
public class func{
public void testArrayUpsertFloatWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t4 ( k VARCHAR PRIMARY KEY, a FLOAT[])");
}
}
