public class func{
public void getJSONObject(URL jsonURL){
    URLConnection conn = jsonURL.openConnection();
    BufferedReader reader = new BufferedReader(new InputStreamReader(
            conn.getInputStream()));
}
}
