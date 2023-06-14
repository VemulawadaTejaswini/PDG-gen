public class func{
public void havingEmptyQueryString(){
        final URL url = new URL("http://localhost:" + port() + "/?");
        final HttpURLConnection c = (HttpURLConnection) url.openConnection();
}
}
