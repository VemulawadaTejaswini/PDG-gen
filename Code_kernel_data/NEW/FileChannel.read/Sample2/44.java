//43
public class func{
	public void testConcurrentReadWrite(){
        countRead = channelRead.read(bufferRead);
        assertEquals("Expected full read", 26, countRead);
}
}
