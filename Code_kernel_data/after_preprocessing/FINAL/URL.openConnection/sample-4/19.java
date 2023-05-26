public class func{
public void getModified(URL url){
            URLConnection conn = url.openConnection();
            long lastMod = conn.getLastModified();
            if (lastMod != 0) {
                logger.log(Level.INFO, "Found getLastModified of {0}", lastMod);
                return lastMod;
            } else {
                logger.log(Level.INFO, "Returning hash code of content", lastMod);
                String content = getContent(conn);
                return content.hashCode();
            }
            logger.log(Level.INFO, "Loading welcome page modified date from web failed", ex);
}
}
