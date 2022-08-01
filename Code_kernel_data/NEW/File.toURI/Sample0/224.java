//223
public class func{
	public void fullConfig(){
        assertEquals(new File("/tmp/upload").toURI().toString(), upload.getRepository().toURI().toString());
        assertEquals("100", upload.getSizeMax().toString());
        assertEquals("200", upload.getFileSizeMax().toString());
        assertEquals("300", upload.getSizeThreshold().toString());
        assertEquals(true, upload.isKeepFormFieldInMemory());
        assertArrayEquals(new String[] { "filename", "fname" }, upload.getFileNameKey());
}
}
