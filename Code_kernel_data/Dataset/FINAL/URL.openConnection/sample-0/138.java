public class func{
public void cacheTile(String aURL){
            URL url = new URL(aURL);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();
            int status = uc.getResponseCode();
            if (status == 200) {
                int contentLength = uc.getContentLength();
                if (contentLength == -1) {
                }
            } else if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Problem caching '{}' tile (status: {})", aURL, status);
            }
}
}
