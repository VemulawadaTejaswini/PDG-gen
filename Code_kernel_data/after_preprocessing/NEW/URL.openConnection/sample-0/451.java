//451
public class func{
public void getUrl(HttpRequest request){
        URL url = request.getUrl();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        copyHeadersExceptEncoding(request, conn);
        return ioUtils.toString(conn.getInputStream());
}
}
