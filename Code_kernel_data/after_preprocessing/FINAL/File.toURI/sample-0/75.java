public class func{
public void toAbsolutePath(final String path){
            final URL url = new File(path).toURI().toURL();
            return toFilePath(url);
            throw new RuntimeException("Failed to resolve relative path for: " + path, e);
}
}
