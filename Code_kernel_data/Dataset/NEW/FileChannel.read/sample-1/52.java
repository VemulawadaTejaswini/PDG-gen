//52
public class func{
public void testFISFollowsFD(){
    ByteBuffer bb = ByteBuffer.allocate(1 * 1024 * 1024); // read a meg
    int read = fc.read(bb);
    assertEquals(-1, read); // reached EOF
}
}
