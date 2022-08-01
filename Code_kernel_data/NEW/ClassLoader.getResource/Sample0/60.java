//59
public class func{
	public void getResource(String name){
            final ClassLoader parent = getParent();
            if (parent != null) {
                url = parent.getResource(name);
            }
}
}
