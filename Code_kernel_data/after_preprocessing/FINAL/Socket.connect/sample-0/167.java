public class func{
public void connect(){
                connection.connect(new InetSocketAddress("localhost", servicePort), 1000);
                logger.debug("Connected to native server on port " + servicePort);
}
}
