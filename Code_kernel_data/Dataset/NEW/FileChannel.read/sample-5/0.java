//0
public class func{
public void transferTo(FileChannel fc,long pos,long len){
        ByteBuffer buf = ByteBuffer.allocate(bufferSize);
        while((i = fc.read(buf, pos)) != -1) {
          if(i > 0) {
            ret += i;
            pos += i;
            buf.flip();
            write0(buf);
            buf = ByteBuffer.allocate(bufferSize);
          }
//          log.info("write file ret {} | len {}", ret, len);
          if(ret >= len)
            break;
        }
        fc.close();
}
}
