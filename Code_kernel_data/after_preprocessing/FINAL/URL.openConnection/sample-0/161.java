public class func{
public void execute(String method,String urlS,String body){
        URL url = new URL(urlS);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
}
}
