//126
public class func{
	public void processRunscript(String url,String user,String password,String fileName,String options){
            conn = DriverManager.getConnection(url, user, password);
            stat = conn.createStatement();
            stat.execute(sql);
            JdbcUtils.closeSilently(conn);
}
}
