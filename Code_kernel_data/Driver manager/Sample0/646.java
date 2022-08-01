//645
public class func{
	public void tearDown(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
