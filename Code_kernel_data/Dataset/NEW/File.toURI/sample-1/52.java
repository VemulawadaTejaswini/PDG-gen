//52
public class func{
public void testAttributesWriting(){
        SimpleFeatureCollection features = createFeatureCollection();
        File tmpFile = getTempFile();
        tmpFile.createNewFile();
        ShapefileDataStore s = new ShapefileDataStore(tmpFile.toURI().toURL());
        writeFeatures(s, features);
        s.dispose();
}
}
