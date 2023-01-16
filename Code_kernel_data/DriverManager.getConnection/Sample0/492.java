//491
public class func{
	public void finalize(){
                DriverManager.getConnection("jdbc:derby:;shutdown=true").close();
}
}
