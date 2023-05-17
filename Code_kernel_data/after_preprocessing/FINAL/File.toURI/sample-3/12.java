public class func{
public void testReadOutside(){
        ShapefileDataStore ds = (ShapefileDataStore) createDataStore(fac, f.toURI().toURL(), true);
        Query q = new Query(ds.getTypeNames()[0]);
}
}
