public class func{
public void main(String[] args){
        URL u = new URL("file:"+System.getProperty("test.src", ".")+
                        "/GetContentLength.java");
        URLConnection urlc = u.openConnection();
        urlc.connect();
        len = urlc.getContentLength();
        if (len<0)
            throw new RuntimeException("GetContentLength returned invalid length.");
}
}
