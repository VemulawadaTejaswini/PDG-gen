//3
public class func{
public void uri(final String uri){
        if (!uri.startsWith("file") && !uri.startsWith("jar") && !uri.isEmpty()) {
            final File f = new File(uri);
            if (f.exists()) {
                return f.toURI();
            }
        }
        return URI.create(uri.replace(" ", "%20").replace("#", "%23"));
}
}
