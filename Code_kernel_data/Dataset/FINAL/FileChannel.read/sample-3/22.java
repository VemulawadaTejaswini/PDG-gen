public class func{
public void build(final FileChannel original){
        while ( in.read(( ByteBuffer) buffer.rewind()) > 0) {
          total += compressor.write(( ByteBuffer) buffer.flip());
          buffer.compact();
        }
        total += header.skip( compressor, total);
}
}
