public class func{
public void getTrashFileSystem(Configuration conf){
    conf = new Configuration(conf);
    InetSocketAddress serviceAddress = NameNode.getDNProtocolAddress(conf);
    if (serviceAddress != null) {
      URI defaultUri = FileSystem.getDefaultUri(conf);
      URI serviceUri = null;
      try {
        serviceUri = new URI(defaultUri.getScheme(), defaultUri.getUserInfo(),
            serviceAddress.getAddress().getHostAddress(), serviceAddress.getPort(),
            defaultUri.getPath(), defaultUri.getQuery(),
            defaultUri.getFragment());
      } catch (URISyntaxException uex) {
        throw new IOException("Failed to initialize a uri for trash FS");
      }
      Path trashFsPath = new Path(serviceUri.toString());
      return trashFsPath.getFileSystem(conf);
    } else {
      return FileSystem.get(conf);
    }
}
}
