public class func{
public void getURI(String path){
    if (path == null) {
      return null;
    }
      URI uri = new URI(path);
      if (uri.getScheme() == null) {
        uri = new File(path).toURI();
      }
}
}
