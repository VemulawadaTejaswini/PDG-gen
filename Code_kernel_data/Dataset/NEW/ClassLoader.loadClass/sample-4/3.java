//3
public class func{
public void findClass(String name){
      for(ClassLoader lib : classpath) {
    try {
        return(lib.loadClass(name));
    } catch(ClassNotFoundException e) {}
      }
      throw(new ClassNotFoundException("Could not find " + name + " in any of " + Arrays.asList(classpath).toString()));
}
}
