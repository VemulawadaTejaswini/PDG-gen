//94
public class func{
public void put(String uri,String mediaType,InputStream in){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("PUT");
        uc.setRequestProperty("Content-Type", mediaType);        
        uc.setDoOutput(true);
        OutputStream out = uc.getOutputStream();
}
}
