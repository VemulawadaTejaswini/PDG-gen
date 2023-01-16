//449
public class func{
	public void tearDownCluster(){
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
