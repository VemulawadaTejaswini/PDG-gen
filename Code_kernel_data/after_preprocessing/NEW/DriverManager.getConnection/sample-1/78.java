//78
public class func{
public void testArrayUpsertTimeStampWithNulls2(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t14 ( k VARCHAR PRIMARY KEY, a TIMESTAMP[])");
}
}
