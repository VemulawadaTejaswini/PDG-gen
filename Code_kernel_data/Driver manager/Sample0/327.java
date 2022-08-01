//326
public class func{
	public void tearDown(){
            DriverManager.getConnection("jdbc:derby:target/testdb;shutdown=true");
}
}
