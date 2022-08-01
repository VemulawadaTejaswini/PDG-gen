//29
public class func{
	public void getResponseCode(String theme){
            URL url = new URL(String.format("%s/VAADIN/themes/%s/favicon.ico",
                    getBaseURL(), theme));
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getResponseCode();
}
}
