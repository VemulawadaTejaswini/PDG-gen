//591
public class func{
	public void stop(BundleContext context){
      DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
