//101
public class func{
	public void createDatabase(File dbHome,String user,String password){
    DriverManager.registerDriver(new Driver());
    DriverManager.getConnection(url).close();
}
}
