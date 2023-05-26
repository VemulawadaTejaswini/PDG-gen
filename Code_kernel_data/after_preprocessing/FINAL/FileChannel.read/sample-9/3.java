public class func{
public void testSimple(final String fsBase){
        assertEquals(-1, channel.read(ByteBuffer.wrap(buffer, 0, 1)));
        assertEquals("test", FileUtils.getName(path));
        can = FilePath.get(fsBase).toRealPath().toString();
}
}
