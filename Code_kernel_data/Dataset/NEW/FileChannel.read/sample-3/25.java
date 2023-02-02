//25
public class func{
public void readFrom(File file,ByteBuffer buffer){
            while (needed>0 && buffer.hasRemaining())
                needed=needed-channel.read(buffer);
}
}
