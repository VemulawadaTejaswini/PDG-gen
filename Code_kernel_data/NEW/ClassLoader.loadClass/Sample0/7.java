//6
public class func{
	public void setUp(){
        ClassLoader loader = new ClassLoaderBuilder().withPrivateCopy(prefix).build();
        bStringClass = loader.loadClass(prefix + "$BString");
}
}
