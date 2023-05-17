public class func{
public void testGetAllContentFromURL(){
        final File file = File.createTempFile("test", "test");
        IOUtil.writeContentToFile("theContent\nVeryGreatContent", file);
        assertArrayEquals("theContent\nVeryGreatContent".getBytes(), IOUtil.getAllContentFrom(file.toURI().toURL()));
}
}
