//322
public class func{
	public void writeBlocksUntilTimeout7(){
        final T blockingChannel = createBlockingWritableByteChannel(channelMock, 0, TimeUnit.MILLISECONDS);
        final Write writeRunnable = new Write(blockingChannel, "wait nothing");
        final Thread writeThread = new Thread(writeRunnable);
        writeThread.start();
}
}
