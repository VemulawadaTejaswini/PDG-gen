//49
public class func{
public void openConnection(final URL url){
    if (proxy != null) {
      connection = url.openConnection(proxy);
    } else {
      connection = url.openConnection();
    }
}
}
