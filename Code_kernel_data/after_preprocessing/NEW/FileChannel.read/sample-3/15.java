//15
public class func{
public void readFileChannelFully(FileChannel fileChannel,byte buf[],int off,int len){
    ByteBuffer byteBuffer = ByteBuffer.wrap(buf, off, len);
    while (toRead > 0) {
      int ret = fileChannel.read(byteBuffer);
      if (ret < 0) {
        throw new IOException("Premature EOF from inputStream");
      }
      toRead -= ret;
      off += ret;
    }
}
}
