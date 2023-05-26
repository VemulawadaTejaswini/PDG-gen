public class func{
public void httpGet(String api){
               url = new URL(api);
               conn = (HttpURLConnection) url.openConnection();
               conn.setRequestMethod("GET");
               rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
               while ((line = rd.readLine()) != null) {
                  result += line;
               }
               rd.close();
}
}
