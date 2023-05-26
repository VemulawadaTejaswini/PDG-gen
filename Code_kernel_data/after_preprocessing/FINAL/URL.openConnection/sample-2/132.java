public class func{
public void testLoadResource(){
        final VFSClassLoader loader = createClassLoader();
        final URL resource = loader.getResource("read-tests/file1.txt");
        assertNotNull(resource);
        final URLConnection urlCon = resource.openConnection();
        assertSameURLContent(FILE1_CONTENT, urlCon);
}
}
