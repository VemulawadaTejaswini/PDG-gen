//195
public class func{
	public void DB(String connURL,Properties connProperties){
        _conn = DriverManager.getConnection(connURL, connProperties);
        _driverName = DriverManager.getDriver(connURL).getClass().getName();
}
}
