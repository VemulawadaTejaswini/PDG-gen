//3
public class func{
public void isFolder(URL url){
    String protocol = url.getProtocol();
    if ("file".equals(protocol)) {
      File f = new File(url.getPath());
      isFolder = f.isDirectory();
    } else if ("jar".equals(protocol)) {
      JarURLConnection conn = (JarURLConnection) url.openConnection();
      isFolder = conn.getJarEntry().isDirectory();
    } else {
      throw new IllegalArgumentException(url + " is not a File.");
    }
}
}
