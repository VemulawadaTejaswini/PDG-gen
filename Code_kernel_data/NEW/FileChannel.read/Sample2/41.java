//40
public class func{
	public void ScrollingBuffer(FileChannel channel,ByteOrder order,boolean useMemoryMapping){
                this.buffer = NIOUtilities.allocate(8 * 1024);
                this.buffer.order(order);
                channel.read(buffer);
                buffer.flip();
}
}
