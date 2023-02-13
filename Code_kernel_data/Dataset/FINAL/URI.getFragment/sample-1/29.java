public class func{
public void getIFile(URL url,boolean bCreateIfNotExists){
    if (url.getProtocol().equals("file")) {
      try {
        URI uri = url.toURI();
        if (uri.getFragment() != null) {
          uri = new URI(uri.getScheme(), uri.getSchemeSpecificPart(), null);
        }
        return getIFile(new File(uri));
      }
      catch (URISyntaxException ex) {
        throw new RuntimeException(ex);
      }
      catch (IllegalArgumentException ex) {
        throw new IllegalArgumentException("Unable to parse URL " + url.toExternalForm(), ex);
      }
    } else if (url.getProtocol().equals("jar")) {
      String path = url.getPath();
      int idx = path.lastIndexOf('!');
      String filePath = path.substring(idx + 1);
      String jarPath = path.substring(0, idx);
      File jarFile;
      try {
        jarFile = getIFile(new URL(jarPath)).toJavaFile();
      }
      catch (MalformedURLException e) {
        throw new RuntimeException(e);
      }
      JarFileDirectoryImpl jarFileDirectory = new JarFileDirectoryImpl(jarFile);
      if( bCreateIfNotExists ) {
        return jarFileDirectory.getOrCreateFile( filePath );
      }
      return jarFileDirectory.file( filePath );
    } else {
      throw new RuntimeException("Unrecognized protocol: " + url.getProtocol());
    }
}
}
