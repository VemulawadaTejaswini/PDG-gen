//66
public class func{
public void readFileChannelFully(FileChannel fileChannel,ByteBuffer byteBuffer,int off,int len,boolean throwOnEof){
      int ret = fileChannel.read(byteBuffer);
      if ( ret < 0 ) {
        if (throwOnEof) {
          throw new IOException( "Premeture EOF from inputStream");
        } else {
          return dataRead;
        }
      }
}
}
