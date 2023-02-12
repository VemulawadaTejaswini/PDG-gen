public class func{
public void connectToHost(String host,int port,int timeout){
      if ( timeout < 0 ) {
        socket.connect( is );
      } else {
        socket.connect( is, timeout );
      }
}
}
