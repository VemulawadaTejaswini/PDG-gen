//131
public class func{
	public void testExtraElementInConfig(){
                ImportControlLoader.load(new File(
                        "src/test/resources/com/puppycrawl/tools/checkstyle/imports/import-control_WithNewElement.xml").toURI());
        assertNotNull(root);
}
}
