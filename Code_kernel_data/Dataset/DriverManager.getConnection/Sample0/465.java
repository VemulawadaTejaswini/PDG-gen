//464
public class func{
	public void getConnection(ConnectionInfo info){
        return DriverManager.getConnection(info.getUrl(), info.getParamsAsProperties());
}
}
