//57
public class func{
	public void testArrayUpsertTimeWithNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t11 ( k VARCHAR PRIMARY KEY, a TIME[])");
}
}
