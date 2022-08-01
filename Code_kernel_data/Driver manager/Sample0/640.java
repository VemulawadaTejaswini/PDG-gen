//639
public class func{
	public void connect(String userName,String password,String fullurl,DriverType driver){
  Connection conn = DriverManager.getConnection(fullurl, userName,
      password);
}
}
