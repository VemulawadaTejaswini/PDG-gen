//0
public class func{
public void readBufferFully(FileChannel fc,ByteBuffer buf,int startPos){
        while (buf.hasRemaining()) {
            int read = fc.read(buf, pos);
            if (read == -1) {
                throw new EOFException();
            }
            pos += read;
        }
        buf.flip();
}
}
