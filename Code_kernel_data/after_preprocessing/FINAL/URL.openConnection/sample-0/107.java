public class func{
public void httpGet(String urlString){
        url = new URL(urlString);
        conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((line = br.readLine()) != null) {
          doc += line;
        }
        br.close();
}
}
