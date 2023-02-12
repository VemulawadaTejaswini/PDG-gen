public class func{
public void getStatus(String address){
      socket.connect(new InetSocketAddress(host, port), 3000);
      dis = new DataInputStream(socket.getInputStream());
      dos = new DataOutputStream(socket.getOutputStream());
      dos.write(1);
}
}
