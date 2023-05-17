public class func{
public void read(@Nonnull final FileChannel src,@Nonnull final ByteBuffer dst,@Nonnegative final long position){
        while(dst.remaining() > 0) {
            int n = src.read(dst, offset);
            if(n == -1) {
                break;
            }
            offset += n;
            count += n;
        }
}
}
