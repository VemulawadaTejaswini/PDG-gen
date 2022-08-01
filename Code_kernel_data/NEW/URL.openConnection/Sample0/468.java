//467
public class func{
	public void createConnection(URL url){
      Proxy proxy = getProxy();
      if (proxy != null)
            return (HttpURLConnection) url.openConnection(proxy);
        else
          return (HttpURLConnection) url.openConnection();
}
}
