//75
public class func{
	public void testArrayUpsertCharWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t15 ( k VARCHAR PRIMARY KEY, a CHAR(15)[])");
}
}
