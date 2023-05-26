//2
public class func{
public void main(String[] args){
      File f = new File(args[0]);
      FileInputStream inStream = new FileInputStream(f);
      FileChannel fc = inStream.getChannel();
      ByteBuffer frame = ByteBuffer.allocate((int)fc.size());
      fc.read(frame);
      frame.flip();
      dec.decodeFrame(frame);
}
}
