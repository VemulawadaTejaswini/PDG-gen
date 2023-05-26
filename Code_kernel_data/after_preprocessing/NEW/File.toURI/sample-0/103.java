//103
public class func{
public void filePathAsURL(String path){
    URI uri = new File(path).toURI();
      return uri.toURL();
}
}
