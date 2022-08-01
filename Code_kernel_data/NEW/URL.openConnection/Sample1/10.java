//9
public class func{
	public void checkWmsGetMapUrl(String urlString){
            URL url = new URL(urlString);
            URLConnection myURLConnection = url.openConnection();
            myURLConnection.connect();
            logger.debug("#################RESPONSE : {}\n\n",
                    IOUtils.toString(myURLConnection.getInputStream()));
            String contentType = myURLConnection.getContentType();
            logger.info("#####################CONTENT_TYPE : {}\n", contentType);
            if (!contentType.contains("xml")) {
                return true;
            }
}
}
