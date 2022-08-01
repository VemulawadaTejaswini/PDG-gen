//176
public class func{
	public void tearDownDatabase(String url){
        Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
}
}
