public class func{
public void HarPathHelper(HiveConf hconf,URI archive,URI originalBase){
      String parentHost = archive.getHost();
      if (parentHost == null) {
        harHost = archive.getScheme() + "-localhost";
      } else {
        harHost = archive.getScheme() + "-" + parentHost;
      }
      String path = addSlash(archive.getPath());
      if(!path.endsWith(".har/")) {
        throw new HiveException("HAR archive path must end with .har");
      }
        base = new URI("har", archive.getUserInfo(), harHost, archive.getPort(),
              path, archive.getQuery(), archive.getFragment());
}
}
