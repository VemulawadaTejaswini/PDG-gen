public class func{
public void test_size(){
            ByteBuffer buf = ByteBuffer.allocate(8);
            assertEquals(8, specialFile.read(buf));
            ByteBuffer[] bufs = { ByteBuffer.allocate(8) };
            assertEquals(8, specialFile.read(bufs, 0, 1));
            specialFile.close();
}
}
