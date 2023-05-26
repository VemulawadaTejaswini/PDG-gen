//8
public class func{
public void loadClass(String name,boolean resolve){
      for (ClassLoader cl : parents) {
         try {
           return cl.loadClass(name);
         } catch (ClassNotFoundException e) {
           // Ignore
         }
        }
}
}
