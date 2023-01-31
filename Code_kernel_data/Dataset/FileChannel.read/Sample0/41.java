//40
public class func{
	public void test2(){
        ByteBuffer bb = ByteBuffer.allocateDirect(10);
        fc.read(bb);
        bb.flip();
        if (bb.get() != 2)
            throw new RuntimeException("Write failure");
        if (bb.get() != 3)
            throw new RuntimeException("Write failure");
            bb.get();
}
}
