public class func{
public void test(){
    H5File file=HDF5Reader.readHDF5File(new File("./src/test/resources/H5DatasetCreate.h5").toURI().toURL(),-1l);
    Assert.notNull(file);
}
}
