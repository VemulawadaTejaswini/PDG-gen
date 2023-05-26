public class func{
public void getRemoteFileSize(final URL downloadUrl){
        final URLConnection urlConn = downloadUrl.openConnection();
        final HttpURLConnection httpConn = (HttpURLConnection)urlConn;
        httpConn.setRequestMethod("HEAD");
        if (httpConn.getResponseCode() == 200) {
            return urlConn.getContentLengthLong();
        } else {
            throw new IOException("Url not reachable : " + downloadUrl.toString());
        }
}
}
