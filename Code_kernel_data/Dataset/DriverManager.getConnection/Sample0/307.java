//306
public class func{
	public void tearDown(){
                DriverManager.getConnection( "jdbc:derby:sessions;shutdown=true" );
}
}
