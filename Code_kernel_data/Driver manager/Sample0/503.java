//502
public class func{
	public void connect(){
        return DriverManager.getConnection("jdbc:derby:scan;create=true");
}
}
