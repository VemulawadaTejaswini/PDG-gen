//2
public class func{
	public void testViewAddsPKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
