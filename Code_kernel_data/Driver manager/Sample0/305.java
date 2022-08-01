//304
public class func{
	public void doshutdown(){
      conn = DriverManager.getConnection(dbURL +
        ";shutdown=true");
}
}
