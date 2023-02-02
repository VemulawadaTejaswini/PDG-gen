//96
public class func{
public void main(String[] args){
            server = new HttpServer (new SetChunkedStreamingMode(), 1, 10, 0);
            URL url = new URL ("http://127.0.0.1:"+server.getLocalPort()+"/");
            HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
            urlc.setChunkedStreamingMode (0);
            urlc.setRequestMethod("POST");
            urlc.setDoOutput(true);
            InputStream is = urlc.getInputStream();
}
}
