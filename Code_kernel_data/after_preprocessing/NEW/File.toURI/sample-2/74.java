//74
public class func{
public void getFeatureCollection(File file){
            featureCollection = FeatureUtils.getFeatureSource(file.toURI().toURL()).getFeatures();
}
}
