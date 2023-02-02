//24
public class func{
public void query(String json){
    String urlStr = URL + "?query=" + URLEncoder.encode(json, "UTF-8");
    URL url = new URL(urlStr);
    URLConnection con = url.openConnection();
    con.connect();
    InputStream in = con.getInputStream();
    JSON results = JSON.parse(new InputStreamReader(in));
    in.close();
}
}
