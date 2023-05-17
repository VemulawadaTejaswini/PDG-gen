public class func{
public void openUrl(String urlSpec){
        URL url = new URL(urlSpec);
        URLConnection urlConnection = url.openConnection();
        return new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
}
}
