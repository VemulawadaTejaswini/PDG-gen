//12
public class func{
	public void getResource(String name){
        ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        return tccl.getResource(name);
}
}
