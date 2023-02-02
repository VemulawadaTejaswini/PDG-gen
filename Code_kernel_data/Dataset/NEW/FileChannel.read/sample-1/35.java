//35
public class func{
public void testRandomAccessRead(){
        ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
        int count = fileChannel.read(buffer);
        assertEquals("Incorrect number of bytes read", bytes.length, count);
        buffer.rewind();
        buffer.get(bytes);
        String checkContent = new String(bytes);
        assertEquals("Content read failure", content, checkContent);
}
}
