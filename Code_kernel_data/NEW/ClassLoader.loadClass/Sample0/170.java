//169
public class func{
	public void initializeNMS(ClassLoader loader,String nmsPackage){
            READ_LIMITER_CLASS = loader.loadClass(nmsPackage + ".NBTReadLimiter");
}
}
