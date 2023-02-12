public class func{
public void main(String[] args){
        URL url = new URL(getSpec());
        URLConnection connection = url.openConnection();
        String contentType = connection.getContentType();
        if (!contentType.equals(JAR_MIME_TYPE)) {
            throw new RuntimeException("invalid MIME type for JAR archive");
        }
        url = new URL(url, "image.gif");
        connection = url.openConnection();
        contentType = connection.getContentType();
        if (!contentType.equals(GIF_MIME_TYPE)) {
            throw new RuntimeException("invalid MIME type for JAR entry");
        }
}
}
