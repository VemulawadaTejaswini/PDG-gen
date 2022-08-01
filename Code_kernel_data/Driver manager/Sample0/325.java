//324
public class func{
	public void connect(String jdbcUrl,String usr,String psw){
        return DriverManager.getConnection(jdbcUrl, usr, psw);
}
}
