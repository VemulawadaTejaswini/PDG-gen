public class func{
public void CheckUrl(String urlvalue){
      URL url = new URL(urlvalue);
      HttpURLConnection urlConnection = (HttpURLConnection) url
          .openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(
          urlConnection.getInputStream()));
      inputLine = in.readLine().toString();
}
}
