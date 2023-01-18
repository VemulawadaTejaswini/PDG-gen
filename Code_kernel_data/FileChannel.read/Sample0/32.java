//31
public class func{
	public void read(FileChannel ch,ByteBuffer[] bb,final long start_position){
      while (buf.hasRemaining()) {

        int read = ch.read(buf, position);
        if (read >= 0) {
          position += read;

          if (read == 0) {
            Thread.yield();
          }
        } else {
          return 0;
        }
      }
}
}
