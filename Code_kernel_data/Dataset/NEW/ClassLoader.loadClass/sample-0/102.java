//102
public class func{
public void Run(){
      final ClassLoader classpath = JavaCompiler.newClasspath(this.jar);
      final Class<?> clazz = classpath.loadClass("helloworld.HelloWorld");
      ClassExtensions.runMain(clazz);
}
}
