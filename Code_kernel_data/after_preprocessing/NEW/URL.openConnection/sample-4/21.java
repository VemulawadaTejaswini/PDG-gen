//21
public class func{
public void main(String[] args){
        File tmp = File.createTempFile("bug4975103", null);
        tmp.deleteOnExit();
        URL url = tmp.toURL();
        URLConnection conn = url.openConnection();
        conn.connect();
        String s1 = conn.getContentType();
        String s2 = conn.getHeaderField("content-type");
        if (!s1.equals(s2))
            throw new RuntimeException("getContentType() differs from getHeaderField(\"content-type\")");
}
}
