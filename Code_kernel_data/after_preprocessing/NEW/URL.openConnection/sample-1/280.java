//280
public class func{
public void resolveStreamFromUrl(){
        String u = endpoint.getUrl();
        ObjectHelper.notEmpty(u, "url");
        LOG.debug("About to write to url: {}", u);
        URL url = new URL(u);
        URLConnection c = url.openConnection();
        return c.getOutputStream();
}
}
