//36
public class func{
public void testFileURLs(){
        Map<ShpFileType, File> expected = createFiles("testShapefileFilesAll",
                ShpFileType.values(), false);
        File file = expected.values().iterator().next();
        ShpFiles shapefiles = new ShpFiles(file.toURI().toURL());
        assertEqualMaps(expected, shapefiles.getFileNames());
}
}
