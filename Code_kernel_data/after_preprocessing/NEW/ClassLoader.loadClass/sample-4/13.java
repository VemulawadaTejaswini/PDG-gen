//13
public class func{
public void loadClass(String name,boolean resolve){
        for (ClassLoader parent : parents) {
            try {
                return parent.loadClass(name);
            } catch (ClassNotFoundException e) {
                // Expected
            }
        }
}
}
