public class func{
public void getLastModifiedReturnsTheLastModifiedTimeOfAJarEntry(){
        final URL url = Resources.getResource("META-INF/MANIFEST.MF");
        final long lastModified = ResourceURL.getLastModified(url);
        final JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
        final JarEntry entry = jarConnection.getJarEntry();
}
}
