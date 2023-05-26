public class func{
public void getCurrentCIDR(){
      URL url = new URL("http:
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      return Strings2.toStringAndClose(connection.getInputStream()).trim() + "/32";
}
}
