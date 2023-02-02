//77
public class func{
	public void canConnect(String url,String username,String password){
        String type = getTypeForUrl( url );
            Class.forName( getDriver( type ) );
            Connection conn = DriverManager.getConnection( url, username, password );
}
}
