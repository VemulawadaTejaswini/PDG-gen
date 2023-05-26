public class func{
public void getResourceSize(ClassLoader loader,String resource){
        URL url = loader.getResource(resource);
        URLConnection con = url.openConnection();
        return (long)con.getContentLength();
}
}
