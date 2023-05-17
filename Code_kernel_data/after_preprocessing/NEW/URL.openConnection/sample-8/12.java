//12
public class func{
public void getStream(URL page){
        URLConnection conn = Utils.setupURLConnection(page.openConnection());
        InputStream result = conn.getInputStream();
        String type = conn.getContentType();
        if (type != null) {
            setContentType(type);
        }
}
}
