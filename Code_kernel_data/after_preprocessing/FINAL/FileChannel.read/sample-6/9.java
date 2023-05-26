public class func{
public void readFileToBuffer(File file,boolean allocateDirect){
            ByteBuffer buffer = allocateDirect ? ByteBuffer.allocateDirect(size) : ByteBuffer.allocate(size);
            for (int count = 0; count >= 0 && buffer.hasRemaining(); )
            {
                count = fc.read(buffer);
            }
            buffer.flip();
}
}
