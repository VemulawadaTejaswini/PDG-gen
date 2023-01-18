//72
public class func{
	public void openConnect(String url,String user,String pass){
    DriverManager.setLoginTimeout(timeout);
    conn = DriverManager.getConnection(url, user, pass);
    LOG.debug(" get Connection ok: " + url);
}
}
