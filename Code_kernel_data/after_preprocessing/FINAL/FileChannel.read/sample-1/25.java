public class func{
public void copy(File file,File backup){
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while( in.read(buffer) != -1 ) {
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
}
}
