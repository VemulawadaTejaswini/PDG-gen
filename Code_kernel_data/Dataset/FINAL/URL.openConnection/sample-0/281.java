public class func{
public void makeConnection(String resource){
    HttpURLConnection conn = (HttpURLConnection)(new URL(resource).openConnection());
        conn.setDoOutput(true);
}
}
