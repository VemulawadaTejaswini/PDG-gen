//38
public class func{
	public void test_read$LByteBuffer_mock(){
        FileChannel mockChannel = new MockFileChannel();
        mockChannel.read(buffers);
        assertTrue(((MockFileChannel)mockChannel).isReadCalled);
}
}
