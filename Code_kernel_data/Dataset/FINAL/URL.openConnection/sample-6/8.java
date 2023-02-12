public class func{
public void fetchUrl(URL url){
    URLConnection cnx = url.openConnection();
    InputStream in = cnx.getInputStream();
    while ((len = in.read(buf)) >= 0)
      total += len;
}
}
