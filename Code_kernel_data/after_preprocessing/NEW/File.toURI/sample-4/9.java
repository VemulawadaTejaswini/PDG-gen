//9
public class func{
public void addFolder(File folder){
        if (folder.isDirectory()) {
            try {
                super.addURL(folder.toURI().toURL());
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        }
}
}
