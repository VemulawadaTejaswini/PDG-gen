public class func{
public void transferFirstChannelDataAndPushedMessageToFileChannel1(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(10);
            assertEquals(8, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "xnio-api");
}
}
