//105
public class func{
	public void shouldCreateConnectionWithDriverManagerAfterRegisteringDriver(){
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(validUrl, validProperties);
}
}
