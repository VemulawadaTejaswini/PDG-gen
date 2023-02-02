//39
public class func{
public void httpGet(String url){
      URL confirmationEndpoint = new URL(url);
      URLConnection conn = confirmationEndpoint.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
          response += inputLine;
        }
        logger.info(response);
        in.close();
}
}
