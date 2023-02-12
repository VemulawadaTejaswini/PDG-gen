public class func{
public void lastModified(URL url){
        if (url != null) {
            URLConnection connection = url.openConnection();
            if (connection instanceof JarURLConnection) {
                JarEntry entry = ((JarURLConnection)connection).getJarEntry();
                if (entry != null)
                    lastModified = entry.getTime();
            }
            if (lastModified == -1L)
                lastModified = connection.getLastModified();
        }
        return (lastModified == 0L ? -1L : lastModified);
}
}
