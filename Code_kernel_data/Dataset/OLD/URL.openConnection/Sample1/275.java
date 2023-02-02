//274
public class func{
	public void search(String query){
        String urlEncodedQuery = URLEncoder.encode(query, "UTF-8");
        URL url = new URL(FLIGHT_AWARE_JSON_URL + "?howMany=100&query=" + urlEncodedQuery);
        URLConnection uc = url.openConnection();
}
}
