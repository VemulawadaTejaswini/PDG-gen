public class func{
public void testArrayUpsertDoubleWithNulls(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t8 ( k VARCHAR PRIMARY KEY, a DOUBLE[])");
}
}
