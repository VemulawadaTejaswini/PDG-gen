//336
public class func{
	public void getConnection(String url){
    ConnectionInfo info = new ConnectionInfo(url);
    return DriverManager.getConnection(info.getUri(), info.getProperties());
}
}
