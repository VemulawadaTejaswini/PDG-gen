//68
public class func{
	public void main(String[] args){
        while ((localPort = Redirect.listenPort) == -1) {
            Thread.sleep(1000);
        }
        URL url = new URL(page);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.connect();
        if (conn.getResponseCode() != 302) {
            throw new RuntimeException("Test failed. Should get RespCode: 302. Got:"+conn.getResponseCode());
        }
}
}
