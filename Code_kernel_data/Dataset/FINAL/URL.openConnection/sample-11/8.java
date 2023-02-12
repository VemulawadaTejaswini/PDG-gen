public class func{
public void slurpURL(URL u){
    URLConnection uc = u.openConnection();
    String encoding = getUrlEncoding(uc);
    InputStream is = uc.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is, encoding));
}
}
