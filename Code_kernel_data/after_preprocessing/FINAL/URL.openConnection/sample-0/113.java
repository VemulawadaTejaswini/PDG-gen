public class func{
public void sendMessageByHttp(int port,String topic,int partition,byte[] data){
        URL url = new URL(String.format("http://127.0.0.1:%s/",port));
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("partition",""+partition);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.getOutputStream().write(data);
        conn.getOutputStream().flush();
        conn.getOutputStream().close();
}
}
