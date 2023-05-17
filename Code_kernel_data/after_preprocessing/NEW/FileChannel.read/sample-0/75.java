//75
public class func{
public void testRead_ReadableByteChannel(){
        final FileInputStream fileInputStream = new FileInputStream(m_testFile);
        final FileChannel input = fileInputStream.getChannel();
            assertEquals(FILE_SIZE, IOUtils.read(input, buffer));
            assertEquals(0, IOUtils.read(input, buffer));
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            buffer.clear();
                IOUtils.readFully(input, buffer);
}
}
