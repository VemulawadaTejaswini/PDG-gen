public class func{
public void main(String[] args){
        ExecutorService s =  Executors.newCachedThreadPool();
        server.setExecutor (s);
        server.start ();
        URL url = new URL ("http:
                "/Foo/bar/test.html");
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
        int r = urlc.getResponseCode();
}
}
