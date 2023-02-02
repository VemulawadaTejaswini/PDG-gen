//5
public class func{
public void toUrl(final File root){
        if (!root.isFile() && root.getPath().startsWith("jar:file:")) {
            try {
                return new URL(root.getPath());
            } catch (final MalformedURLException me) {
                // no-op keep previous behavior
            }
        }
        return root.toURI().toURL();
}
}
