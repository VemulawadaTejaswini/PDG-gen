//16
public class func{
public void copy(TreeLogger logger,URL in,File out){
      URLConnection conn = in.openConnection();
      if (conn.getLastModified() > out.lastModified()) {
        copy(logger, in.openStream(), out);
        return true;
      } else {
        return false;
      }
      logger.log(TreeLogger.ERROR, "Unable to open '" + in.toExternalForm()
          + "'", e);
}
}
