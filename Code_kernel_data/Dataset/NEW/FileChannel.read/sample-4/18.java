//18
public class func{
public void read(){
      final ByteBuffer header = ByteBuffer.allocateDirect(8);
      fileChannel.read(header);
      header.flip();
}
}
