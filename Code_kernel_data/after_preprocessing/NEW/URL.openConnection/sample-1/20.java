//20
public class func{
public void dereference(String uri,String contentType){
        if(uri!=null){
            final URL url = new URL(uri);
            final URLConnection con = url.openConnection();
            con.addRequestProperty("Accept", contentType);
            return con.getInputStream();
        } else {
            return null;
        }
}
}
