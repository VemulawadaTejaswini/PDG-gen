//153
public class func{
public void getConnection(final String url,final String user,final String password){
            LOG.info("Connecting to " + url + " with no credentials");
            return DriverManager.getConnection(url);
}
}
