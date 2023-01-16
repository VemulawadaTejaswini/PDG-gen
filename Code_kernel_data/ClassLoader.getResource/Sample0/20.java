//19
public class func{
	public void findResource(String name){
        for (ClassLoader cl : loaders) {
            url = cl.getResource(name);
            if (url != null) {
                break;
            }
        }
}
}
