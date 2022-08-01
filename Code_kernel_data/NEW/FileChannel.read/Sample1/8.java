//7
public class func{
	public void call(){
        ByteBuffer bb = ByteBuffer.allocate(BUFSIZE);
        while (fc.read(bb) != -1) {
          bb.flip();
          outChannel.write(bb);
          bb.clear();
        }
        fc.close();
}
}
