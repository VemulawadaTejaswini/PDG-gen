//338
public class func{
	public void getJdbcConnection(String url,Properties props){
        return DriverManager.getConnection(url, props);
}
}
