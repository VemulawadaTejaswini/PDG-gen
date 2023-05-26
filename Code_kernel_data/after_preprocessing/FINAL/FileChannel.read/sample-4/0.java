public class func{
public void testThroughLogBuffer(){
        dup.read( readInMe );
        readInMe.flip();
        assertEquals( 2, readInMe.getInt() );
        readInMe.flip();
}
}
