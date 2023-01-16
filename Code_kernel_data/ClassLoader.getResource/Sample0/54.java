//53
public class func{
	public void getResource(ClassLoader loader,String name){
    if (loader == null) {
        return ClassLoader.getSystemResource(name);
    } else {
        return loader.getResource(name);
    }
}
}
