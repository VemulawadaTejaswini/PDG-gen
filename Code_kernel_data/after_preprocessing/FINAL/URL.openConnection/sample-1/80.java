public class func{
public void getUrlContent(String urlAddress){
      URL url = new URL(urlAddress);
      URLConnection connection = url.openConnection();
      connection.setUseCaches(false);
      inStream = connection.getInputStream();
      InputStreamReader inStreamReader = new InputStreamReader(inStream);
      BufferedReader buffer = new BufferedReader(inStreamReader);            
}
}
