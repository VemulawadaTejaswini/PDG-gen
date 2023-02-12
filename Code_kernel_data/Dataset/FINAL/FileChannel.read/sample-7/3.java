public class func{
public void testRead10Frames(){
            for (int i = 0; i < 5; i++) {
                FileChannel channel = frameReadingChannel;
                ByteBuffer bb = ByteBuffer.allocate(bs.get(i).dataLen);
                frameReadingChannel.position(bs.get(i).dataOffset);
                frameReadingChannel.read(bb);
                ByteBuffer[] frames = bs.get(i).getFrames(bb);
                
                Assert.assertNotNull(frames);
                Assert.assertEquals(1, frames.length);
                Assert.assertArrayEquals(rawFrames[i], MKVMuxerTest.bufferToArray(frames[0]));
            }
}
}
