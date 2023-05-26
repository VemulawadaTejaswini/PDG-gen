public class func{
public void main(String args[]){
                line=in.readLine();
                if(line.startsWith("quit") || line.startsWith("exit"))
                    System.exit(0);
                buf=line.getBytes();
                packet=new DatagramPacket(buf, buf.length, mcast_addr, port);
                send(packet, sockets);
}
}
