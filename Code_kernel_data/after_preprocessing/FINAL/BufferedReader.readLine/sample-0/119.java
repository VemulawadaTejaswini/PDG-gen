public class func{
public void getExternalIP(){
            URL url = new URL("http:
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            return in.readLine();
}
}
