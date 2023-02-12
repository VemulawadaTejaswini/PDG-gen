public class func{
public void toUrl(final ClassLoader classLoader,final String path){
        final URL resource = classLoader.getResource(path);
        if (resource == null) {
            throw new IllegalArgumentException("Failed to find resource " + path);
        }
}
}
