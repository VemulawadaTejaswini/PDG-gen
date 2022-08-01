//26
public class func{
	public void readJson(String url){
    URLConnection conn = new URL(url).openConnection();
    conn.setConnectTimeout(5000);
    conn.setReadTimeout(8000);
    conn.addRequestProperty("User-Agent", "Updater (by filoghost)");
    conn.setDoOutput(true);
    return JSONValue.parse(new BufferedReader(new InputStreamReader(conn.getInputStream())));
}
}
