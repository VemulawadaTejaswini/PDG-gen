//17
public class func{
public void getByteArrayFromFile(File file){
      FileChannel fc = new FileInputStream(file).getChannel();
      while( (numRead = fc.read( inBuf )) >= 0 ) {
        inBuf.flip();
        outBuf.write( inBuf.array() );
        inBuf.clear();
      }
}
}
