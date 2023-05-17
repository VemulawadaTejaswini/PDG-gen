//52
public class func{
public void getResource(final String name){
      ClassLoader parent = getParent();
      if (parent != null) {
        resource = parent.getResource(name);
      }
}
}
