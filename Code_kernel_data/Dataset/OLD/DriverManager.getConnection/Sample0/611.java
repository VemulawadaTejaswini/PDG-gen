//610
public class func{
	public void createConnection(){
      conn = DriverManager.getConnection("jdbc:derby:memory:chapter02DB;create=true", "APP", "APP");
}
}
