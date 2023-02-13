public class func{
public void isExiste(String logoUrl){
      URL u = new URL(logoUrl);
      HttpURLConnection huc = (HttpURLConnection) u.openConnection();
      huc.setRequestMethod("GET");
      huc.connect();
      code = huc.getResponseCode();
}
}
