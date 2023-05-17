//13
public class func{
public void testRead(){
    buf.flip();
    assertEquals(-1, channel.read(buf));
    assertEquals(30, channel.position());
}
}
