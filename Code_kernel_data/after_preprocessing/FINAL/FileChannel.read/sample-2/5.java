public class func{
public void testPositionedReadWrite(String fsBase){
        buff = ByteBuffer.allocate(1);
        assertEquals(-1, fc.read(buff, 8000));
        assertEquals(1, fc.read(buff, 4000));
        buff.flip();
        assertEquals(1, fc.read(buff, 2000));
        fc.close();
}
}
