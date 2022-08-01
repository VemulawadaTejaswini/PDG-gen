//37
public class func{
	public void getStringFromFile(File file){
        ByteBuffer  bytebuffer = ByteBuffer.allocate((int)file.length());
        int n=channel.read(bytebuffer);
        bytebuffer.position(0);
        CharBuffer charbuffer = UTF8.decode(bytebuffer);
}
}
