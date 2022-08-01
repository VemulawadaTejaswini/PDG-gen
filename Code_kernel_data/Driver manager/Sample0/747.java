//746
public class func{
	public void shouldNotConnectWithInvalidRepositoryName(){
        DriverManager.getConnection(getContextPathUrl() + "/dummy", driverProperties);
}
}
