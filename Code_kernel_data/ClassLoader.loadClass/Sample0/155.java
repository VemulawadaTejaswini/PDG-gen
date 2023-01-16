//154
public class func{
	public void loadClass(String name){
        ClassLoader cls = new MyClassLoader();
        return cls.loadClass(name);
}
}
