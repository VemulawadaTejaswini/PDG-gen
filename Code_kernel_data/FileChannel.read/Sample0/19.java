//18
public class func{
	public void findHighIdBackwards(){
        for ( long i = highId; i > 0; i-- )
        {
            fileChannel.position( i * recordSize );
            if ( fileChannel.read( byteBuffer ) > 0 )
            {
                byteBuffer.flip();
                byte inUse = byteBuffer.get();
                byteBuffer.clear();
                if ( inUse != 0 )
                {
                    return i;
                }
            }
        }
}
}
