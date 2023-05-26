public class func{
public void readAllFromChannel(FileChannel channel){
    channel.position(0);
    final ByteBuffer buffer = createBufferForChannel(channel);
    while(buffer.hasRemaining()) {
      if(channel.read(buffer) == -1) {
        logger.warning("Unexpected EOF reading from cache file");
        return EMPTY_BUFFER;
      }
    }
    buffer.rewind();
}
}
