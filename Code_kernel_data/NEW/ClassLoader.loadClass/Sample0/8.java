//7
public class func{
	public void setUp(){
        ClassLoader cl = new ClassLoaderBuilder()
                .withPrivateCopy(prefix + "$Loadable")
                .without(prefix + "$Unloadable")
                .build();
        loadableClass = cl.loadClass(prefix + "$Loadable");
}
}
