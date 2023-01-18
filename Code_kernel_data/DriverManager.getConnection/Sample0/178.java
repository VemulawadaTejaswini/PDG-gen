//177
public class func{
	public void getConnection(){
            String passwd = (String) p.get("password");
            return DriverManager.getConnection(url, user, passwd);
}
}
