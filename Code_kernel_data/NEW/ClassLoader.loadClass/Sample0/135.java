//134
public class func{
	public void type(final ClassLoader loader,final Injection next){
            return loader.loadClass(next.getClassname()).getDeclaredField(next.getName()).getGenericType();
}
}
