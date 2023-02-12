public class func{
public void getHttpURLConnection(URL url){
      return (HttpURLConnection) (new URL(url.toString() + tokenString)).openConnection();
}
}
