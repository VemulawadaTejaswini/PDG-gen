//38
public class func{
public void speedTestNIO(int bufferSize,boolean direct){
        if (buf.remaining() < 4) {
          buf.compact();
          fs.read(buf);
          buf.flip();
        }
        if (buf.getInt() != valsLeft) {
          throw new IOException();
        }
}
}
