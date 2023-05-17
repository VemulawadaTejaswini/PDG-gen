public class func{
public void transfer(FileChannel source,WritableByteChannel destination,long position,long length){
      _transferByteBuffer.limit((int)length);
      source.read(_transferByteBuffer, position);
      _transferByteBuffer.flip();
      destination.write(_transferByteBuffer);
}
}
