//33
public class func{
	public void openConnection(URL u){
                URL resource = Tools.getResource(u.getPath().substring(1, u.getPath().length()));
                if (resource != null) {
                  URLConnection conn = resource.openConnection();
                  WebServiceTools.setURLConnectionDefaults(conn);
                  return conn;
                }
}
}
