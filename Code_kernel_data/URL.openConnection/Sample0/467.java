//466
public class func{
	public void createConnection(String uri){
    if ( null == proxy )     {
      return (HttpURLConnection) url.openConnection();
    } else {
      return (HttpURLConnection) url.openConnection( proxy );
    }
}
}
