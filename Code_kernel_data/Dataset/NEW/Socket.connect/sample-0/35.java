//35
public class func{
public void main(String[] args){
        socket.connect(new InetSocketAddress(host, port), 3000);
        datainputstream = new DataInputStream(socket.getInputStream());
        dataoutputstream = new DataOutputStream(socket.getOutputStream());
        dataoutputstream.write(254);
}
}
