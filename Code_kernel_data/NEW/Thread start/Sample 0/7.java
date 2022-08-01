//6
public class func{
	public void readBlockingToEmptyBuffer(){
        connectedChannelMock.setReadData("can't read this");
        ReadBlocking readRunnable = new ReadBlocking(connectedChannelMock, Buffers.EMPTY_BYTE_BUFFER);
        Thread readThread = new Thread(readRunnable);
        readThread.start();
        readThread.join();
        assertFalse(readThread.isAlive());
        assertEquals(0, readRunnable.getReadResult());
}
}
