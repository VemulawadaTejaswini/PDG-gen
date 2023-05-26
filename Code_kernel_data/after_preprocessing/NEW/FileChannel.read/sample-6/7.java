//7
public class func{
public void testThroughLogBuffer(){
        ByteBuffer readInMe = ByteBuffer.allocate( 4 ); // One integers
        dup.read( readInMe );
        readInMe.flip();
        assertEquals( 1, readInMe.getInt() );
        readInMe.flip();
}
}
