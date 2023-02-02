//0
public class func{
public void findClass(String name){
        for (ClassLoader loader : loaders) {
            try {
                return loader.loadClass(name);
            } catch (ClassNotFoundException e) {
                // try next
            }
        }
}
}
