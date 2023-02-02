//11
public class func{
public void getURL(String name){
            File file = getFile(name);
            if (file.exists()) {
                return file.toURI().toURL();
            }
            log.error("Failed to transform file to URL: " + name, e);
}
}
