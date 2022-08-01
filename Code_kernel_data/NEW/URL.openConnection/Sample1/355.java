//354
public class func{
	public void checkMovieHash(String hash){
    if (token == null) {
      return "";
    }
    URL url = new URL(OPENSUBS_URL);
    LOGGER.debug("req " + req);
    return postPage(url.openConnection(), req);
}
}
