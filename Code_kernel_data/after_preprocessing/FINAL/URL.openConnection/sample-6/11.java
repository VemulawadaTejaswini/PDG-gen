public class func{
public void getProperties(URL configURL){
      URLConnection conn = configURL.openConnection();
      InputStream in = conn.getInputStream();
      String jsonString = IOUtils.toString(in, "UTF-8");
      JSONObject json = new JSONObject(jsonString);
      return getProperties(json);
}
}
