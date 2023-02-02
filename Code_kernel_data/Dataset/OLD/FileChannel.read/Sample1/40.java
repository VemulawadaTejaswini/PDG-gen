//39
public class func{
	public void testPositionedReadWrite(String fsBase){
        buff = ByteBuffer.allocate(4000);
        assertEquals(4000, fc.read(buff, 96));
        assertEquals(0, fc.position());
}
}
