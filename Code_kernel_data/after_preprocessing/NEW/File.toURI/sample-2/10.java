//10
public class func{
public void getURL(String filename){
    File file = new File( filename );
    if ( file.exists() ) {
      url = file.toURI().toURL();
    } else {
      ClassLoader classLoader = getClass().getClassLoader();
      url = classLoader.getResource( filename );
    }
}
}
