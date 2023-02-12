public class func{
public void exists(String URLName){
                    (HttpURLConnection) new URL(URLName).openConnection();
            con.setRequestMethod("HEAD");
            con.setConnectTimeout(10000);
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
