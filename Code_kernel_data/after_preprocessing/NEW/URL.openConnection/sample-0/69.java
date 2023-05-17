//69
public class func{
public void getUrl(String path,BBuffer out){
        URL url = new URL(path);
            (HttpURLConnection) url.openConnection();
        connection.setReadTimeout(10000);
        connection.connect();
        int rc = connection.getResponseCode();
        InputStream is = connection.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        while((rd = bis.read(buf)) > 0) {
            out.append(buf, 0, rd);
        }
}
}
