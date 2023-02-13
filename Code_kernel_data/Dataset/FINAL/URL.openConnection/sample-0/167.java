public class func{
public void doPost(String request){
    URL url = new URL("http:
    HttpURLConnection connect = (HttpURLConnection) url.openConnection();
    connect.setRequestMethod("POST");
    connect.setDoOutput(true);
    OutputStream os = connect.getOutputStream();
}
}
