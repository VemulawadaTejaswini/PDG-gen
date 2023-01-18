//745
public class func{
	public void connectToRemoteRepository(){
        Connection connection = DriverManager.getConnection(getRepositoryUrl(), driverProperties);
        assertNotNull(connection);
}
}
