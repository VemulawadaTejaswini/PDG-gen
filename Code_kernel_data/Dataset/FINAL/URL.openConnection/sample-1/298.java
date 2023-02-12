public class func{
public void download(String url){
      URL u = new URL(url);
      u.openConnection();
      InputStream istream = u.openStream();
}
}
