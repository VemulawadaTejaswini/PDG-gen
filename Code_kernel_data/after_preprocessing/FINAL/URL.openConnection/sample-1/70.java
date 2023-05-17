public class func{
public void setupURI(String url){
        UURI uuri = UURIFactory.getInstance(url);
        CrawlURI curi = new CrawlURI(uuri, null, uuri, LinkContext.NAVLINK_MISC);
        URLConnection conn = new URL(url).openConnection();
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(30000);
        InputStream in = conn.getInputStream();
}
}
