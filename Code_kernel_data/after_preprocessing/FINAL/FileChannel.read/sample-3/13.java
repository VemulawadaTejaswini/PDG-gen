public class func{
public void read(FileChannel channel,long position,ByteBuffer byteBuffer){
        while (!endOfChannel && byteBuffer.hasRemaining())
            endOfChannel = (channel.read(byteBuffer) == -1);
        byteBuffer.flip();
}
}
