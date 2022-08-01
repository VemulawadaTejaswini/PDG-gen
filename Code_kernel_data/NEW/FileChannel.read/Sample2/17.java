//16
public class func{
	public void load(ByteBasedSortedMap m,File f){
      ByteBuffer buf0 = ByteBuffer.allocate(hdr);
      while (buf0.hasRemaining())
        fc.read(buf0);
      buf0.flip();
      m.currentSize = buf0.getInt();
      m.lastModified = buf0.getLong();
      ByteBuffer bytesB = ByteBuffer.allocate(m.bytesUsed);
      while (fc.read(bufs) > 0);
      keyoffsetB.flip();
      IntBuffer iB = keyoffsetB.asIntBuffer();
      iB.get(m.keyOffsetsArray);
}
}
