public class func{
public void visitJar(URL url){
    if (_logger.isLoggable(Level.FINE)) {
      _logger.log(Level.FINE, "Scanning JAR-File: " + url);
    }
    JarURLConnection conn = (JarURLConnection) url.openConnection();
    _visitJar(conn.getJarFile());
}
}
