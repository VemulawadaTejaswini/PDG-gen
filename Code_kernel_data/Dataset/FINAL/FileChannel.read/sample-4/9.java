public class func{
public void testReadAtBoundaries(){
        readBuffer.flip();
        assertEquals( 4, readBuffer.getInt() );
        assertEquals( 5, readBuffer.getInt() );
        assertEquals( 6, readBuffer.getInt() );
        readBuffer.flip();
        assertEquals( -1, channel.read( readBuffer ) );
}
}
