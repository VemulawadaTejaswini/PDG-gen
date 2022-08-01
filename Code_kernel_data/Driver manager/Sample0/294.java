//293
public class func{
	public void newConnection(){
      return DriverManager.getConnection("jdbc:derby:memory:derbyDB;territory=en_US");
}
}
