public class func{
public void slurpURL(URL u){
    URLConnection uc = u.openConnection();
    InputStream is = uc.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
}
}
