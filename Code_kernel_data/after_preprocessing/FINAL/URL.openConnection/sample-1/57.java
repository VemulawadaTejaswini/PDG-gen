public class func{
public void getCountryFromGeoIP(){
    URL u = new URL("http:
    URLConnection uc = u.openConnection();
    uc.setReadTimeout(3000);
    in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
    return in.readLine();
}
}
