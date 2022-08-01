//70
public class func{
	public void read(){
      ByteBuffer buffer = ByteBuffer.allocateDirect((int) cacheFile.length());
      buffer.order(ByteOrder.BIG_ENDIAN);
      int j = channel.read(buffer);
      if (j != buffer.capacity())
        throw new IOException("Could not read index in one go, only "+j+" out of "+buffer.capacity()+" read");
      buffer.flip();
      header = new Header(buffer);
}
}
