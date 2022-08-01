//36
public class func{
	public void readFromPath(final String path,final String clientId,final String requestMethod){
      final URL url = url(fullPath);
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod(requestMethod);
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      while ((bytesRead = reader.read(chars)) != -1) {
        builder.append(chars, 0, bytesRead);
      }
      if (reader != null) {
        reader.close();
      }
      if (connection != null) {
        connection.disconnect();
      }
}
}
