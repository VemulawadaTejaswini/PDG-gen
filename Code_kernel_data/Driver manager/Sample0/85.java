//84
public class func{
	public void startConnection(){
            String url = getUrl();
                DriverManager.setLoginTimeout(getTimeout());
                con = DriverManager.getConnection(url , user, passwd);
                log(Level.ERROR, e, "Sql error for %s: %s" , url, e);
}
}
