public class func{
public void open(final URL url){
        if(null==url) {
            return null;
        }
            final URLConnection c = url.openConnection();
            c.connect();
}
}
