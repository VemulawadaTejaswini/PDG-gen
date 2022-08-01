//54
public class func{
	public void checkBytes(FileChannel fc,int off,int len,byte[] bytes){
        fc.position(off);
        if (fc.read(bb) != len)
            throw new IOException("Incomplete read");
        bb.flip();
}
}
