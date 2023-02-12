public class func{
public void testLoad(){
                ImportControlLoader.load(new File(
                        "src/test/resources/com/puppycrawl/tools/checkstyle/imports/import-control_complete.xml").toURI());
        assertNotNull(root);
}
}
