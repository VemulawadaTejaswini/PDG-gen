public class func{
public void getWebContent(URL url){
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setInstanceFollowRedirects(true) ;
    BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8")) ;
}
}
