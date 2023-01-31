//597
public class func{
	public void tearDownJDBC(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
