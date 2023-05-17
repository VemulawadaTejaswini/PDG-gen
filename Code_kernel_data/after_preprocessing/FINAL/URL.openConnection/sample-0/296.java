public class func{
public void HttpRequest(final CharSequence url,final String method){
      connection = (HttpURLConnection) new URL(url.toString())
          .openConnection();
      connection.setRequestMethod(method);
}
}
