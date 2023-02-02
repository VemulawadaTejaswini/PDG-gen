//86
public class func{
public void safelyOpenConnection(URL url){
      conn = url.openConnection();
      Log.w(TAG, "Bad URI? " + url);
}
}
