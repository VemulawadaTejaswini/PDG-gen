public class func{
public void queryBing(String query){
        String urlString = "http://dev.virtualearth.net/REST/v1/Locations?query=" + URLEncoder.encode(query, "utf-8") + "&output=json&key=" + URLEncoder.encode(key, "utf-8");
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        String responseText = IOUtils.toString(connection.getInputStream(), "UTF-8");
        JSONObject responseJson = new JSONObject(responseText);
        return toLumifyGeocodeJson(responseJson);
}
}
