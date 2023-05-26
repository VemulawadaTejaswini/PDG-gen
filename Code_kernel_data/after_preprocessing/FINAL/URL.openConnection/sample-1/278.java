public class func{
public void getContentLength(String fileUrl){
    URL url = new URL(fileUrl);
    URLConnection connection = url.openConnection();
    return connection.getContentLength();
}
}
