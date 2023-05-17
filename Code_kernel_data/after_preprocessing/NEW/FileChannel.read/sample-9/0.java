//0
public class func{
public void read(byte[] data,int doff,int length,long offset){
        int read = channel.read(ByteBuffer.wrap(data, doff, length));
}
}
