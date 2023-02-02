//76
public class func{
	public void createPhoenixTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute(ddl);
}
}
