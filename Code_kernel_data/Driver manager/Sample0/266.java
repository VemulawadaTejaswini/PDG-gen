//265
public class func{
	public void getConnection(String connStr,String user,String pass){
                return new ConnectionProxy(new StateFactory(), DriverManager.getConnection(connStr));
}
}
