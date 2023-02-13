public class func{
public void main(String[] args){
        URL url = new URL("file:
        URLConnection urlc = url.openConnection();
        urlc.connect();
        String type = urlc.getContentType();
        if (! "text/plain".equalsIgnoreCase(type))
            throw new RuntimeException("getContentType() returned the wrong type");
}
}
