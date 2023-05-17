//98
public class func{
public void writeBufferArrayBlocksUntilTimeout7(){
        final T blockingChannel = createBlockingWritableByteChannel(channelMock, 11000000, TimeUnit.NANOSECONDS);
        final WriteBufferArray writeRunnable = new WriteBufferArray(blockingChannel, "wait almost"," nothing");
        final Thread writeThread = new Thread(writeRunnable);
        writeThread.start();
}
}
