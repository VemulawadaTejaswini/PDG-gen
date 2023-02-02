//87
public class func{
	public void start(){
        DriverManager.setLoginTimeout(10);
        con = DriverManager.getConnection(url , user, passwd);
}
}
