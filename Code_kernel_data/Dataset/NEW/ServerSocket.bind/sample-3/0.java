//0
public class func{
public void getSecureResources(Configuration conf){
        ServerSocketChannel.open().socket() : new ServerSocket();
    ss.bind(streamingAddr, 0);
    if (ss.getLocalPort() != streamingAddr.getPort()) {
      throw new RuntimeException(
          "Unable to bind on specified streaming port in secure "
              + "context. Needed " + streamingAddr.getPort() + ", got "
              + ss.getLocalPort());
    }
    if (!SecurityUtil.isPrivilegedPort(ss.getLocalPort()) && isSecure) {
      throw new RuntimeException(
        "Cannot start secure datanode with unprivileged RPC ports");
    }
}
}
