public class func{
public void getInputStream(){
        URL url = new URL("http:
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request.getInputStream();
}
}
