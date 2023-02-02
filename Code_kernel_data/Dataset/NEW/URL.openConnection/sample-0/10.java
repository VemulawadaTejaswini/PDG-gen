//10
public class func{
public void get(String url,Type type){
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    if (con.getResponseCode() == 200) {
      Reader reader = new InputStreamReader(con.getInputStream(), "UTF-8");
      return GSON.fromJson(reader, type);
    }
}
}
