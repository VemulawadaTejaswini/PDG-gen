//672
public class func{
	public void getConnection(){
                String pass = cfg.get ("jdbc.password");
                return DriverManager.getConnection(url,user,pass);
}
}
