public class func{
public void getJSONObject(URL jsonURL){
    URLConnection conn = jsonURL.openConnection();
    return JSON.parse(
            new BufferedReader(new InputStreamReader(
            conn.getInputStream())));
}
}
