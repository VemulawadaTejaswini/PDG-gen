public class func{
public void TestClient(Socket sock,InetAddress addr,int port,int connTimeout){
                sock.connect(new InetSocketAddress(addr, port), connTimeout);
                if (sock instanceof SSLSocket)
                    ((SSLSocket)sock).startHandshake();
                out = sock.getOutputStream();
                in = sock.getInputStream();
}
}
