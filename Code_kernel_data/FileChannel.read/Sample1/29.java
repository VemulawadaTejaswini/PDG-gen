//28
public class func{
	public void decodeSmallFile(FileChannel channel,final int isize,String encoding){
    ByteBuffer byteBuffer = ByteBuffer.allocate(isize);
    channel.read(byteBuffer);
    byteBuffer.flip();
}
}
