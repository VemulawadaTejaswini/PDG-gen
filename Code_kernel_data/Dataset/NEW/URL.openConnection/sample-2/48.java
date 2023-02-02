//48
public class func{
public void deploy(URL resource,boolean xhrCompatible){
    String fileName = ResourceGeneratorUtil.baseName(resource);
    byte[] bytes = Util.readURLAsBytes(resource);
      return deploy(fileName, resource.openConnection().getContentType(),
          bytes, xhrCompatible);
      getLogger().log(TreeLogger.ERROR,
          "Unable to determine mime type of resource", e);
}
}
