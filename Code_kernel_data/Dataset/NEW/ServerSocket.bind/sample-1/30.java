//30
public class func{
public void run(){
            server = new ServerSocket();
            server.bind(socketAddress);
            log.info("Sling Control Server started on " + socketAddress.toString());
            log.error("Failed to start Sling Control Server", ioe);
}
}
