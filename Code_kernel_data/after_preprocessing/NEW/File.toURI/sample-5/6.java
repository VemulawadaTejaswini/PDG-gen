//6
public class func{
public void getURI(String path){
    if (path == null) {
      return null;
    }
      URI uri = new URI(path);
      if (uri.getScheme() == null) {
        // if no file schema in path, we assume it's file on local fs.
        uri = new File(path).toURI();
      }
}
}
