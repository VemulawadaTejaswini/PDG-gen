public class func{
public void fillBuffer(FileChannel channel,ByteBuffer buf){
    int bytesRead = channel.read(buf);
    if (bytesRead < 0) {
      return bytesRead;
    }
    while (buf.remaining() > 0) {
      int n = channel.read(buf);
      if (n < 0) {
        return bytesRead;
      }
      bytesRead += n;
    }
}
}
