//29
public class func{
public void decode(File f){
            ByteBuffer buf = ByteBuffer.allocate(4096);
            channel.read(buf);
            buf.flip();
}
}
