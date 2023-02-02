//147
public class func{
	public void testLocal(){
    File file = new File("output/rafsink/test1.bin");
    URI uri = file.toURI();
    URIDataFileSink sink = new URIDataFileSink(uri, "test1.bin", file);
    doTest(sink, false);
    URIDataFileSource src = new URIDataFileSource(uri);
    assertTrue("data", Arrays.equals(m_data, src.getFileBytes()));
}
}
