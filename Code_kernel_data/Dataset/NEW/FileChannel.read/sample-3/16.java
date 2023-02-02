//16
public class func{
public void readFileChannelFully(FileChannel fileChannel,byte buf[],int off,int len,long offset,boolean throwOnEof){
    ByteBuffer byteBuffer = ByteBuffer.wrap(buf, off, len);
    while (toRead > 0) {
      int ret = fileChannel.read(byteBuffer, offset);
      if (ret < 0) {
        if (throwOnEof) {
          throw new IOException( "Premeture EOF from inputStream");
        } else {
          return dataRead;
        }
      }
      toRead -= ret;
      offset += ret;
      dataRead += ret;
    }
}
}
