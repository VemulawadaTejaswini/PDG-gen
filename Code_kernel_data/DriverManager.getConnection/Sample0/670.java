//669
public class func{
	public void shutdown(){
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
