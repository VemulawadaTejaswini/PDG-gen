//47
public class func{
	public void createConnection(URL url){
        URLConnection con = url.openConnection();
        con.setRequestProperty("User-Agent", USER_AGENT);
}
}
