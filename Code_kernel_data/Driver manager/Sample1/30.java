//29
public class func{
	public void testSystemTableHasDoubleForExponentialNumber(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
