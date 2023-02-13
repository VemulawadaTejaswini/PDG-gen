public class func{
public void testFISFollowsFD(){
    ByteBuffer bb = ByteBuffer.allocate(1 * 1024 * 1024);
    int read = fc.read(bb);
    assertEquals(-1, read);
}
}
