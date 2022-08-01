//35
public class func{
	public void appendFile(FileChannel fc,String file,ByteBuffer bb){
      bb.rewind();
      int nr = fci.read(bb);
      bb.flip();
      if (nr > 0)
        fc.write(bb);
      if (nr < bb.capacity())
        break;
    fci.close();
}
}
