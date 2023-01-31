//395
public class func{
	public void getConnection(String url,String user,String pass){
        getLog().debug("[getConnection] url='" + url + "' user='" + user + "' pass='******'");
        return DriverManager.getConnection(url, user, pass);
}
}
