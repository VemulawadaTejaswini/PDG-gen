//35
public class func{
	public void initialize(){
        if (shapefile == null) {
            throw new IllegalStateException("shapefile path is not set");
        }
        ShapefileDataStore store = new ShapefileDataStore(new File(shapefile).toURI().toURL());
        String name = store.getTypeNames()[0];
        FeatureSource source = store.getFeatureSource(name);
        collection = source.getFeatures();
}
}
