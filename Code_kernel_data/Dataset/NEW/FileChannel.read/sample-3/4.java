//4
public class func{
public void readHgtFile(String file){
    CheckParameterUtil.ensureParameterNotNull(file);
      fc = new FileInputStream(file).getChannel();
      ByteBuffer bb = ByteBuffer.allocateDirect((int) fc.size());
      while (bb.remaining() > 0) fc.read(bb);
      bb.flip();
      sb = bb.order(ByteOrder.BIG_ENDIAN).asShortBuffer();
}
}
