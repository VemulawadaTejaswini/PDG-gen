//259
public class func{
	public void openDB(Properties props){
        return DriverManager.getConnection(getURL(), props);
}
}
