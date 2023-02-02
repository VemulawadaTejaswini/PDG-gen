//29
public class func{
public void connect(URL url){
  if(!url.getProtocol().equals("https"))
      throw(new MalformedURLException("Can only be used to connect to HTTPS servers"));
  HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
}
}
