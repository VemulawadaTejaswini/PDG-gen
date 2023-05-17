public class func{
public void getHttpDocument(String url){
    URL u = new URL(url);
    URLConnection conn = u.openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
    return (getDocumentBuilder()).parse(conn.getInputStream(),url);
}
}
