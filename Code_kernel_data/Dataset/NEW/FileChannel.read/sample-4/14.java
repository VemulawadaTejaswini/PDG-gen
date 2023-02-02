//14
public class func{
public void testRead(){
    buf.flip();
    assertEquals(10, channel.read(buf, 5));
    assertEquals(30, channel.position());
}
}
