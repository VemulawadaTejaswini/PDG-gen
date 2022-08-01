//53
public class func{
	public void readFully(final FileChannel src,final ByteBuffer dst,final long position){
        while(dst.remaining() > 0) {
            if(-1 == src.read(dst, position + dst.position())) {
                throw new EOFException();
            }
        }
}
}
