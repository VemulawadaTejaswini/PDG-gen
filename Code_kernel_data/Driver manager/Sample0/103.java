//102
public class func{
	public void should_start_and_stop(){
      DriverManager.registerDriver(new Driver());
      DriverManager.getConnection(driverUrl).close();
}
}
