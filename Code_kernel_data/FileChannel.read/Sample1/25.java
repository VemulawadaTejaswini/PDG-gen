//24
public class func{
	public void setVersion(String storeDir,long version){
            ByteBuffer buffer = ByteBuffer.allocate( 8 );
            channel.read( buffer );
            buffer.flip();
            long previous = buffer.getLong();
}
}
