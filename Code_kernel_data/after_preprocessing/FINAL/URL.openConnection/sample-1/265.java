public class func{
public void loadURL(final String urlString){
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    node_ = getBuilder().parse((InputStream) conn.getContent());
}
}
