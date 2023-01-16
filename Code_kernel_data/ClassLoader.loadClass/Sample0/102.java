//101
public class func{
	public void HessianServer(final ClassLoader classLoader){
            serializerFactoryClass = classLoader.loadClass("com.caucho.hessian.io.SerializerFactory");
            serializerFactory = serializerFactoryClass.getConstructor(ClassLoader.class).newInstance(loader);
}
}
