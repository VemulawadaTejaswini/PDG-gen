//414
public class func{
	public void POST(Object json,URL url){
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setDoOutput(true);
    connection.setInstanceFollowRedirects(false);
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/json");
    OutputStream output = connection.getOutputStream();
    m_jsonMapper.writeValue(output, json);
}
}
