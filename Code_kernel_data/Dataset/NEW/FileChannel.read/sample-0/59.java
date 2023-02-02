//59
public class func{
public void transferFrom(final FileChannel src,final long position,final long count){
                final Pooled<ByteBuffer> pooled = exchange.getConnection().getBufferPool().allocate();
                ByteBuffer buffer = pooled.getResource();
                    int res = src.read(buffer);
                    if (res <= 0) {
                        return res;
                    }
                    buffer.flip();
                    return write(buffer);
                    pooled.free();
}
}
