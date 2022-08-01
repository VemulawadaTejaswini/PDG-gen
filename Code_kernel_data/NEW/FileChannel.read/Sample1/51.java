//50
public class func{
	public void checkReadOnlyFileChannel(FileChannel fileChannel){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer);
}
}
