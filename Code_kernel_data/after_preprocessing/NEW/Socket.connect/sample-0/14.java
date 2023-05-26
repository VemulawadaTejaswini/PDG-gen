//14
public class func{
public void downloadSocket(String[] prop_names,String[] prop_values,int length,ExternalSeedHTTPDownloaderListener listener,boolean con_fail_is_perm_fail){
        socket.connect( new InetSocketAddress( url.getHost(), url.getPort()==-1?url.getDefaultPort():url.getPort()), time_remaining );
      time_remaining  = listener.getPermittedTime();
      if ( time_remaining < 0 ){
          
        throw( new IOException( "Timeout during connect" ));
        
      }else if ( time_remaining > 0 ){
        
        socket.setSoTimeout( time_remaining );
      }
      OutputStream  os = socket.getOutputStream();
}
}
