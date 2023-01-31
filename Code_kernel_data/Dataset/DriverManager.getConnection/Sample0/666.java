//665
public class func{
	public void openConnection(String driver,String url,String username,String password){
            attach(DriverManager.getConnection(url, username, password));
}
}
