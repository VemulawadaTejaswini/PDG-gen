//9
public class func{
public void toURL(File file){
        if (file.exists() && file.canRead()) {
            try {
                return file.toURI().toURL();
            }
            catch (MalformedURLException e) {
            }
        }
}
}
