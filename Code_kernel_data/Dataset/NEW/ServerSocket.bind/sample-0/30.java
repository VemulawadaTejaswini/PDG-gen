//30
public class func{
public void AEProxyImpl(int _port,long _connect_timeout,long _read_timeout,AEProxyHandler _proxy_handler){
      ss.bind(  new InetSocketAddress( InetAddress.getByName("127.0.0.1"), port), 128 );
      if ( port == 0 ){
        
        port  = ss.getLocalPort();
      }
        new AEThread("AEProxy:connect.loop")
        {
          public void
          runSupport()
          {
            selectLoop( connect_selector );
          }
        };
      connect_thread.setDaemon( true );
      connect_thread.start();
}
}
