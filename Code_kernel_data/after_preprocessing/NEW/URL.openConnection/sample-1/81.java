//81
public class func{
public void isOffline(){
        URL url = new URL("http://schemas.opengis.net");
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(2000);
            conn.getInputStream().read();
}
}
