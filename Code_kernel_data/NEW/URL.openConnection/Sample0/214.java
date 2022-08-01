//213
public class func{
	public void checkLatestVersion(){
            URL url = new URL(VERSION_URL + REALM_VERSION);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            result = rd.readLine();
            rd.close();
}
}
