//6
public class func{
public void getLastModified(String src){
      final URL url = getExtendletContext().getResource(src);
      if (url != null) {
        final long v = url.openConnection().getLastModified();
        return v != -1 ? v: 0; //not to reload (5.0.6 for better performance)
      }
}
}
