//107
public class func{
	public void setUp(){
        connection = DriverManager.getConnection(url, "sa", "");
        statement = connection.createStatement();
}
}
