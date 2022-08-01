//7
public class func{
	public void testChannelFollowsHandle(){
    assertEquals(4, ch.read(buf));
    buf.flip();
    assertEquals(4, ch.read(buf));
    buf.flip();
    assertEquals(4, ch.read(buf));
    assertEquals("ytes", new String(buf.array()));
    buf.flip();
}
}
