//231
public class func{
	public void getConnection(){
            connection = DriverManager.getConnection(url);
            connection.setReadOnly(true);
}
}
