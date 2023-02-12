public class func{
public void getFileAsUrl(File outputFile){
      URI uri = outputFile.toURI();
      return uri.toURL();
}
}
