//6
public class func{
public void getStream(String request){
    Socket s = socketPool.poll();
    if (s == null || s.isClosed() || s.isOutputShutdown() || s.isInputShutdown())
    {
      s = new Socket();
      s.connect( address );
    }
    DataOutputStream o = new DataOutputStream( s.getOutputStream() );
    o.writeInt( path.length );
    o.write( path );
    o.flush();
}
}
