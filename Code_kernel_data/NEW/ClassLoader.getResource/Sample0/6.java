//5
public class func{
	public void getResource(String name){
        for (ClassLoader parent : parents) {
            URL resource = parent.getResource(name);
            if (resource != null) {
                return resource;
            }
        }
}
}
