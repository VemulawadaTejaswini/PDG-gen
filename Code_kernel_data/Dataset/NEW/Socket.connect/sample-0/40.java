//40
public class func{
public void transactRtspMessage(RtspMessage m){
      s.connect(new InetSocketAddress(context.serverAddress, PORT), RTSP_TIMEOUT);
      RtspStream rtspStream = new RtspStream(s.getInputStream(), s.getOutputStream());
        rtspStream.write(m);
        return (RtspResponse) rtspStream.read();
}
}
