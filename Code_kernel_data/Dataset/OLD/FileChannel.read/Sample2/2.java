//1
public class func{
	public void testReadsInWriteOnlyMode(){
    FileChannel channel = channel(regularFile(0), WRITE);
      channel.read(buffer("111"));
      channel.read(buffer("111"), 10);
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")});
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")}, 0, 2);
      channel.transferTo(0, 10, new ByteBufferChannel(buffer("111")));
      channel.lock(0, 10, true);
}
}
