//250
public class func{
	public void testGetConnection(){
    DriverManager.getConnection("jdbc:taju://" + tajoMasterAddress.getHostName() + ":" + tajoMasterAddress.getPort()
      + "/default");
}
}
