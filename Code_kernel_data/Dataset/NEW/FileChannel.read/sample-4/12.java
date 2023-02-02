//12
public class func{
public void testRead(){
    buf.flip();
    assertEquals(10, channel.read(new ByteBuffer[] {buf, buf2}));
    assertEquals(20, channel.position());
}
}
