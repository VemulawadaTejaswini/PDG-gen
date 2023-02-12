public class func{
public void exists(){
            HttpURLConnection con = (HttpURLConnection) new URL(path).openConnection();
            con.setRequestMethod("HEAD");
            int responseCode = con.getResponseCode();
}
}
