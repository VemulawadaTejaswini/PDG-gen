public class func{
public void getUrlForFile(File possibleFileInSrc){
        if (possibleFileInSrc.exists() && !possibleFileInSrc.isDirectory()) {
          try {
            return possibleFileInSrc.toURI().toURL();
          } catch(MalformedURLException malformedURLException) {
            logger.error("Error in dev mode while streaming files from src dir. ", malformedURLException);
          }
        }
}
}
