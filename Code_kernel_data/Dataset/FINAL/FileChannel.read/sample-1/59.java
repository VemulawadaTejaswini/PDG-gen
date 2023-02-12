public class func{
public void transferBlockingToFile1(){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer, "test");
}
}
