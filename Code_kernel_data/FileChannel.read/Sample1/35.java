//34
public class func{
	public void readInt(FileChannel data,int off){
    ByteBuffer b = ByteBuffer.allocate(4);
    int read = data.read(b, off);
    if (read != 4) throw new IOException(read + " bytes instead of 4");
    return b.getInt(0);
}
}
