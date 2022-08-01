//36
public class func{
	public void openConnection(URL u){
                URL resource = Tools.getResource("icons" + u.getPath());
                if (resource != null) {
                  URLConnection conn = resource.openConnection();
                  WebServiceTools.setURLConnectionDefaults(conn);
                  return conn;
                }
}
}
