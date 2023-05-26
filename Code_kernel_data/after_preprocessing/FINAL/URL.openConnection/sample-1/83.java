public class func{
public void run(){
        URL url = new URL(urlstring);
        URLConnection urlConnection = url.openConnection();
        urlConnection.setConnectTimeout(1000);
        loadPrefsFromStream(urlConnection.getInputStream());
}
}
