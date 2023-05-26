public class func{
public void queryBing(String query){
        String urlString = "http:
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        String responseText = IOUtils.toString(connection.getInputStream(), "UTF-8");
        JSONObject responseJson = new JSONObject(responseText);
        return toLumifyGeocodeJson(responseJson);
}
}
