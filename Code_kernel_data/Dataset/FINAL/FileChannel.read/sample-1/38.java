public class func{
public void initialWritePosition(){
        ByteBuffer buf = ByteBuffer.allocate( AllocatedHeapMemory.LONG_SIZE );
        channel.read( buf );
        buf.rewind();
        long result = buf.getLong();
}
}
