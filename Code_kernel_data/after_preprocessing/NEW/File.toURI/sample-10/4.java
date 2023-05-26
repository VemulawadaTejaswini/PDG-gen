//4
public class func{
public void testGetFileAsURL(){
        final File file = new File("/dummy/hugo/daten").getAbsoluteFile();
        final URL fileURL = FileUtils.getFileAsUrl(file);
        assertEquals(file.toURL(), fileURL);
        assertEquals(file.toURI().toURL(), fileURL);
}
}
