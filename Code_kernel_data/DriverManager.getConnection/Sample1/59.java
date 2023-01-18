//58
public class func{
	public void testArrayUpsertDateWithNulls2(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t10 ( k VARCHAR PRIMARY KEY, a DATE[])");
}
}
