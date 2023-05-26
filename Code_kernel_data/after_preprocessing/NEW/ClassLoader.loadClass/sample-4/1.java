//1
public class func{
public void findClasses(ClassLoader classLoader,Set<Class<?>> classes,Iterable<String> entries){
    for (String entry : entries) {
      Class<?> klass;
      try {
        klass = classLoader.loadClass(entry);
      } catch (ClassNotFoundException e) {
        continue;
      }
      classes.add(klass);
    }
}
}
