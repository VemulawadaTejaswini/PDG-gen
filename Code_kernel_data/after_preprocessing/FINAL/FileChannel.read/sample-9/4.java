public class func{
public void testRandomAccess(String fsBase,int seed){
        assertEquals(-1, f.read(ByteBuffer.wrap(new byte[1])));
        f.force(true);
}
}
