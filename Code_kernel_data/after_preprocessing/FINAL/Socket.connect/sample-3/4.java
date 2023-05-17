public class func{
public void run(){
          outputSocket.connect(new InetSocketAddress(httpsProxyServer.getLocalAddress(), httpsProxyServer.getLocalPort()));
          outputSocket.connect(new InetSocketAddress(httpProxyServer.getLocalAddress(), httpProxyServer.getLocalPort()));
        final InputStream outputSocketInputStream = outputSocket.getInputStream();
        final OutputStream outputSocketOutputStream = outputSocket.getOutputStream();
        outputSocketOutputStream.write(byteArray1);
              while((byteArray1Length = inputSocketInputStream.read(byteArray1)) != -1)
              {
                outputSocketOutputStream.write(byteArray1, 0, byteArray1Length);
              }
}
}
