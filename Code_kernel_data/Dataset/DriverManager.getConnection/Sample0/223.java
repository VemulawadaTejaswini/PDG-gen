//222
public class func{
	public void getConnection(String connectionUrl,String username,String passwd){
        String url = connectionUrl.substring(connectionUrl.indexOf("//") + 2);
        connectionUrl = "jdbc:sqlite:" + url.substring(0, url.length() - 2);
        return DriverManager.getConnection(connectionUrl, username, passwd);
}
}
