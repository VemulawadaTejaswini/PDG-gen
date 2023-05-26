public class func{
public void makeObject(){
       socket.setSoTimeout(this.getThriftProxy().getThriftTimeoutMillis());
       socket.connect(new InetSocketAddress(this.getThriftProxy().getThriftServer(),  this.getThriftProxy().getThriftPort()));
       LOGGER.info("Creating a new socket for server : {} at port : {}", this.getThriftProxy().getThriftServer(), this.getThriftProxy().getThriftPort());
}
}
