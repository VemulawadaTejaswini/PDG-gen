//337
public class func{
	public void createConnectionWithUserPassword(){
        return DriverManager.getConnection(
            getURL(), USER, PASSWORD);
}
}
