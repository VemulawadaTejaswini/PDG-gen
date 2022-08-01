//44
public class func{
	public void transferFirstChannelDataToFileChannel(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(30);
            assertEquals(20, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "data", "from", "first", "channel");
}
}
