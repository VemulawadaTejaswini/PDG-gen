//619
public class func{
	public void internalGetConnection(String userName,String password){
        return DriverManager.getConnection(this.url, userName, password);
}
}
