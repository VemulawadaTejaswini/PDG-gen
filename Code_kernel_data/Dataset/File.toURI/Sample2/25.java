//24
public class func{
	public void testURLStringConstructor(){
        Map<ShpFileType, File> expected = createFiles(
                "testURLStringConstructor", ShpFileType.values(), false);
        File file = expected.values().iterator().next();
        ShpFiles shapefiles = new ShpFiles(file.toURI().toURL()
                .toExternalForm());
        assertEqualMaps(expected, shapefiles.getFileNames());
}
}
