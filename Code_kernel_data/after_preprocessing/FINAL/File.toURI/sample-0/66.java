public class func{
public void testXmlReader(){
        File file = new File("src/test/resources/reader/sample.xml");
        final URL testdata  = file.toURI().toURL();
        reader.parse(testdata, creator);
        assertEquals("Did not create expected number of nodes", 1, creator.size());
}
}
