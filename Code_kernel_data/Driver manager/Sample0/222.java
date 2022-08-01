//221
public class func{
	public void getConnection(){
      return DriverManager.getConnection(SystemGlobals.getValue(ConfigKeys.DATABASE_CONNECTION_STRING));
}
}
