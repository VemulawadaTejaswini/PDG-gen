//179
public class func{
public void getCurrentCIDR(){
      URL url = new URL("http://checkip.amazonaws.com/");
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      return Strings2.toStringAndClose(connection.getInputStream()).trim() + "/32";
}
}
