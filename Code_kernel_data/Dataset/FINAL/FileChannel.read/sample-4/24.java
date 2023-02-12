public class func{
public void read(ByteBuffer buf){
      FileChannel readChannel = readChannelHolder.get();
        readChannel.read(buf);
        buf.flip();
}
}
