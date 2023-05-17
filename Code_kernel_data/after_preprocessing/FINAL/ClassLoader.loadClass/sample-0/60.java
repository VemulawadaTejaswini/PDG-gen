public class func{
public void initBValFiltering(){
                final ClassLoader loader = ParentClassLoaderFinder.Helper.get();
                final Object filter = loader.loadClass("org.apache.openejb.bval.BValCdiFilter").newInstance();
}
}
