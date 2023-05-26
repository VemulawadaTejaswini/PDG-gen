public class func{
public void transferBlockingToFile2(){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer, "test", "1234");
}
}
