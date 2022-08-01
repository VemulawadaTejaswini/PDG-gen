//18
public class func{
	public void getResource(String name){
        for (ClassLoader cl : delegates) {
            URL res = cl.getResource(name);
            if (res != null)
                return res;
        }                
}
}
