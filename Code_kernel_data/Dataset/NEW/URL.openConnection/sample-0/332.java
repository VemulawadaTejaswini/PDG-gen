//332
public class func{
public void test(){
        URL url = new URL("http://www.naver.com");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.getHeaderFields();
}
}
