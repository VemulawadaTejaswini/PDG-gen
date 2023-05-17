//20
public class func{
public void get(String uri){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("GET");
        int status = uc.getResponseCode();
        String mediaType = uc.getContentType();
        InputStream in = uc.getInputStream();
}
}
