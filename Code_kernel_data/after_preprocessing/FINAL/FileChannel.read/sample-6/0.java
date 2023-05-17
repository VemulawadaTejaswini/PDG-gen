public class func{
public void read(FileChannel fc,SymbolTable symbols){
        final ByteBuffer buffer = ByteBuffer.allocate((int) fc.size());
        fc.read(buffer);
        buffer.flip();
        root.read(buffer, symbols);
}
}
