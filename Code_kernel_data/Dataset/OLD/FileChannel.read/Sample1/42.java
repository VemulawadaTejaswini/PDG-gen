//41
public class func{
	public void testReadAtBoundaries(){
        ByteBuffer readBuffer = ByteBuffer.allocate( 12 );
        assertEquals( readBuffer.capacity(), channel.read( readBuffer ) );
        assertEquals( 24, channel.position() );
}
}
