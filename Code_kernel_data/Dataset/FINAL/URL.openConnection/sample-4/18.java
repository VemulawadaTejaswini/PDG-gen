public class func{
public void readFileInformation(URL url){
            urlConnection = url.openConnection();
            if (url.getProtocol().startsWith("http")) {
                ((HttpURLConnection)urlConnection).setRequestMethod("HEAD");
            }
}
}
