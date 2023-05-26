//53
public class func{
public void createDestination(String destination){
      Socket sock = new Socket();
      sock.connect(addr);
      TTransport transport = new TSocket(sock);
      TProtocol prot = new TBinaryProtocol(transport);
      return new Client(prot);
}
}
