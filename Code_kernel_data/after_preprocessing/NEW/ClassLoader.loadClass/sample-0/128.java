//128
public class func{
public void loadTestClass(String className){
               ClassLoader classLoader = JMXTestRunner.class.getClassLoader();
               return classLoader.loadClass(className);
}
}
