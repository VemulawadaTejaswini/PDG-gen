//274
public class func{
public void loadDataFromNetwork(){
            final HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            return processStream(httpURLConnection.getContentLength(), httpURLConnection.getInputStream());
}
}
