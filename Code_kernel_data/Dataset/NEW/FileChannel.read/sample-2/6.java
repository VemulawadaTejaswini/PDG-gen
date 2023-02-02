//6
public class func{
public void testPositionedReadWrite(String fsBase){
            assertEquals((byte) i, buff.get());
        buff = ByteBuffer.allocate(0);
        assertTrue(fc.read(buff, 8000) <= 0);
        assertEquals(0, fc.position());
        assertTrue(fc.read(buff, 4000) <= 0);
        assertEquals(0, fc.position());
        assertTrue(fc.read(buff, 2000) <= 0);
        assertEquals(0, fc.position());
}
}
