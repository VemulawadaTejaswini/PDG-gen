//12
public class func{
public void sendFile(String filename,SocketChannel sock){
        ByteBuffer sendBuf = ByteBuffer.allocateDirect(fileSendingChunk);
        while (source.read(sendBuf) > 0) {
            sendBuf.flip();
            if (log.isDebugEnabled()) {
                log.debug("Sending " + sendBuf);
            }
            sock.write(sendBuf);
            sendBuf.rewind();
        }
        source.close();
}
}
