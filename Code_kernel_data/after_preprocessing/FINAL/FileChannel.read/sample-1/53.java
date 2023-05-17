public class func{
public void transferPushedMessageToFileChannel(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(6);
            assertEquals(6, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "pushed");
}
}
