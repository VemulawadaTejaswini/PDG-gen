//8
public class func{
	public void testReadNegative(){
    FileChannel channel = channel(regularFile(0), READ, WRITE);
      channel.read(buffer("111"), -1);
    ByteBuffer[] bufs = {buffer("111"), buffer("111")};
      channel.read(bufs, -1, 10);
      channel.read(bufs, 0, -1);
}
}
