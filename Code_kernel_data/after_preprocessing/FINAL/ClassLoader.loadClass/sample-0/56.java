public class func{
public void setupBeforeClass(){
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    loader.setDefaultAssertionStatus(true);
    Class<?> c = loader
        .loadClass("org.apache.hadoop.hdfs.server.namenode.INodeHardLinkFile");
    Constructor<?> ctor = c.getDeclaredConstructor(INodeFile.class, Long.TYPE);
}
}
