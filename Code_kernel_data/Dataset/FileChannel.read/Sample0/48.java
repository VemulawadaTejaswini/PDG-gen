//47
public class func{
	public void testCreateIdGenerator(){
            assertEquals( (byte) 0, buffer.get() );
            assertEquals( 0l, buffer.getLong() );
            buffer.flip();
            int readCount = fileChannel.read( buffer );
            if ( readCount != -1 && readCount != 0 )
            {
                fail( "Id generator header not ok read 9 + " + readCount
                    + " bytes from file" );
            }
            fileChannel.close();
}
}
