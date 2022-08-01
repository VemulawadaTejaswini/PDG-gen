//25
public class func{
	public void copy(File file,File backup){
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while( in.read(buffer) != -1 ) {
            buffer.flip(); // Prepare for writing
            out.write(buffer);
            buffer.clear(); // Prepare for reading
        }
}
}
