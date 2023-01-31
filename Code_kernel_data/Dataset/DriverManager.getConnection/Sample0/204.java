//203
public class func{
	public void createConnection(){
        String url = format("jdbc:presto://%s", server.getAddress());
        return DriverManager.getConnection(url, "test", null);
}
}
