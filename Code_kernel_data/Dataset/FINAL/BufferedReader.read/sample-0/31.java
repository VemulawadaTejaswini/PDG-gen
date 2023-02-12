public class func{
public void readAndClose(final HttpURLConnection connection){
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
