public class func{
public void loadClass(String name){
        for (ClassLoader cl : delegates) {
            try {
                return cl.loadClass(name);
            } catch (ClassNotFoundException e) {
                lastEx = e;
            }
        }
}
}
