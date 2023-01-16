//487
public class func{
	public void run(){
      Connection connection = DriverManager.getConnection(url, user, password);
        availableConnections.add(new ConnectionData(connection));
}
}
