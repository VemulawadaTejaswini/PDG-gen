//279
public class func{
public void getFileSize(String location){
        URLConnection connection = new URL(location).openConnection();
        return Common.readableSize(connection.getContentLength());
}
}
