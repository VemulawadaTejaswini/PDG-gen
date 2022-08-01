//32
public class func{
	public void resource(final String name){
        final ClassLoader classLoader = getClass().getClassLoader();
        final URL resource = classLoader.getResource(name);
        if (resource == null) {
            throw new IllegalArgumentException("Can't locate resource " + name + " on " + classLoader);
        }
}
}
