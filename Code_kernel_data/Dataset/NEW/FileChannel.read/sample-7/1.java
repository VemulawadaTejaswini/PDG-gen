//1
public class func{
public void testRead10Frames(){
            for (int i = 5; i < 10; i++) {
                ByteBuffer bb = ByteBuffer.allocate(bs.get(i-5).dataLen);
                frameReadingChannel.position(bs.get(i-5).dataOffset);
                frameReadingChannel.read(bb);
                ByteBuffer[] frames = bs.get(i - 5).getFrames(bb);
                Assert.assertNotNull(frames);
                Assert.assertEquals(1, frames.length);
                Assert.assertArrayEquals(rawFrames[i], MKVMuxerTest.bufferToArray(frames[0]));
            }
}
}
