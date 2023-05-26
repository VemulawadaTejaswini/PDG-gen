//22
public class func{
public void test_readv(){
        ByteBuffer[] buffers = new ByteBuffer[] { ByteBuffer.allocateDirect(4), ByteBuffer.allocate(4) };
        assertEquals(8, fc.read(buffers));
        fc.close();
}
}
