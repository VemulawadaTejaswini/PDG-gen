//5
public class func{
	public void main(String[] args){
      ByteBuffer buf = ByteBuffer.allocate(48);
      while (fc.read(buf) != -1) {
        buf.flip();
        while (buf.hasRemaining())
          System.out.print((char) buf.get());
        buf.clear();
      }
    finally { fc.close(); }
}
}
