//0
public class func{
public void connect(String hostname,int port,String password,SocketFactory socketFactory){
        if (this.bindLocalAddr != null) {
            //socket.setReuseAddress(true);
            socket.bind(this.bindLocalAddr); 
        }
        socket.connect(ircServer);
}
}
