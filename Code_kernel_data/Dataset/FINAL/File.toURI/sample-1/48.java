public class func{
public void testFeatureStoreHints(){
        File shpFile = copyShapefiles(STATE_POP);
        URL url = shpFile.toURI().toURL();
        ShapefileDataStore ds = new ShapefileDataStore(url);
        ShapefileFeatureStore store = (ShapefileFeatureStore) ds.getFeatureSource("statepop");
}
}
