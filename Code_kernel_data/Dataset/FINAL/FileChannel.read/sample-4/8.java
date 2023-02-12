public class func{
public void testBasicCreationAndOps(){
        readBuffer.flip();
        assertEquals( 2, readBuffer.getInt() );
        assertEquals( 3, readBuffer.getInt() );
        assertEquals( 4, readBuffer.getInt() );
        assertEquals( 5, readBuffer.getInt() );
        readBuffer.flip();
        assertEquals( readBuffer.capacity(), channel.read( readBuffer ) );
        assertEquals( readBuffer.capacity(), channel.position() );
}
}
