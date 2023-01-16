//58
public class func{
	public void performCoreAction(String action,String coreName,String moreParams){
        URL coreActionURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) coreActionURL.openConnection();
        conn.connect();
        int response = conn.getResponseCode();
        conn.disconnect();
        if (response != 200) {
            throw new RuntimeException("Core " + action + ": expected status 200 but got: " + response + ": "
                    + conn.getResponseMessage());
        }
}
}
