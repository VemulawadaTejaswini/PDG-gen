//286
public class func{
	public void HttpResponse(HttpBase http,URL url,CrawlDatum datum){
      socket.setSoTimeout(http.getTimeout());
      String sockHost = http.useProxy() ? http.getProxyHost() : host;
      int sockPort = http.useProxy() ? http.getProxyPort() : port;
      InetSocketAddress sockAddr= new InetSocketAddress(sockHost, sockPort);
      socket.connect(sockAddr, http.getTimeout());
      this.conf = http.getConf();
}
}
