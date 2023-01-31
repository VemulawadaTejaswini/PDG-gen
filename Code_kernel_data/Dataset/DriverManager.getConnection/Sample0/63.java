//62
public class func{
	public void openConnection(){
    Class.forName(SystemGlobals.getValue(ConfigKeys.DATABASE_DRIVER));
    return DriverManager.getConnection(SystemGlobals.getValue(ConfigKeys.DATABASE_JFORUM_URL));
}
}
