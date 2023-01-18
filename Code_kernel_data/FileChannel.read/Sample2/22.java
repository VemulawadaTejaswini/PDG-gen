//21
public class func{
	public void testReadFully_ReadableByteChannel(){
        final FileInputStream fileInputStream = new FileInputStream(m_testFile);
        final FileChannel input = fileInputStream.getChannel();
            IOUtils.readFully(input, buffer);
            assertEquals(FILE_SIZE, buffer.position());
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            IOUtils.readFully(input, buffer);
            assertEquals(FILE_SIZE, buffer.position());
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            IOUtils.readFully(input, buffer);
            buffer.clear();
                IOUtils.readFully(input, buffer);
}
}
