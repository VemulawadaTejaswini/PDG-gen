//202
public class func{
	public void createConnection(String catalog){
        String url = format("jdbc:presto://%s/%s", server.getAddress(), catalog);
        return DriverManager.getConnection(url, "test", null);
}
}
