public class func{
public void decrementLogFormat(File file){
        ByteBuffer buffer = ByteBuffer.wrap( new byte[8] );
        channel.read( buffer );
        buffer.flip();
        long version = buffer.getLong();
}
}
