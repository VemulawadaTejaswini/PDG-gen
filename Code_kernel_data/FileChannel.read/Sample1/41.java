//40
public class func{
	public void testBasicCreationAndOps(){
        ByteBuffer readBuffer = ByteBuffer.allocate( 16 );
        assertEquals( readBuffer.capacity(), channel.read( readBuffer, 4 ) );
        assertEquals( 0, channel.position() );
}
}
