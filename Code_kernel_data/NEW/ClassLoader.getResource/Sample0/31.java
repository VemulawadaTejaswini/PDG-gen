//30
public class func{
	public void getResource(String name){
        final ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        if (tccl != null) {
            return tccl.getResource(name);
        } else {
            return getClass().getResource(name);
        }
}
}
