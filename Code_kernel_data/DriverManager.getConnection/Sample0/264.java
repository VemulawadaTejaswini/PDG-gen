//263
public class func{
	public void createConnection(){
    return DriverManager.getConnection(getDSN(), getUserName(), getPassword());
}
}
