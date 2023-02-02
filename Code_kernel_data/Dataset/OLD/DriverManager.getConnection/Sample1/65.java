//64
public class func{
	public void doBeforeTestSetup(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
}
}
