//88
public class func{
public void forwardLocalPortTo(int localPort,String targetHost,int targetPort){
    ss.bind(new InetSocketAddress(params.getLocalHost(), params
        .getLocalPort()));
          ssh.newLocalPortForwarder(params, ss).listen();
}
}
