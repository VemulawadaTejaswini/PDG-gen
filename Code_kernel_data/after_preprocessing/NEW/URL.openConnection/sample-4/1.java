//1
public class func{
public void getLastModified(){
    if (lastModified == null || !cache) {
      if (resource instanceof URL) {
        lastModified = ((URL) resource).openConnection()
            .getLastModified();
        logger.debug("getLastModified(), URL resource: " + lastModified
            + " - for resource: " + resource);
      } else {
        lastModified = ((File) resource).lastModified();
        logger.debug("getLastModified(), File resource: "
            + lastModified + " - for resource: " + resource);
      }
    }
    logger.debug("getLastModified(): " + lastModified);
}
}
