//42
public class func{
public void openStreamFromURL(String path){
        ClassLoader cl = PropertiesUtil.class.getClassLoader();
        URL url = cl.getResource(path);
        if (url != null) {
             try{
                 InputStream stream = url.openStream();
                 return stream;
            } catch (IOException ioex) {
                return null;
            }
        }
}
}
