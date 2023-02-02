//2
public class func{
public void preadHeader(FileChannel fc){
    final byte arr[] = new byte[getHeaderSize()];
    ByteBuffer buf = ByteBuffer.wrap(arr);
    while (buf.hasRemaining()) {
      if (fc.read(buf, 0) <= 0) {
        throw new EOFException("unexpected EOF while reading " +
            "metadata file header");
      }
    }
}
}
