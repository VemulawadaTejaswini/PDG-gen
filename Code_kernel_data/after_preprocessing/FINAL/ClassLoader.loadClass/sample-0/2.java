public class func{
public void assertClassPresent(ClassLoader cl,String name){
      Class<?> clazz = cl.loadClass(name);
      Assert.assertNotNull("Should have found class: " + name, clazz);
      Assert.fail("Counld not load class: " + name + " from " + cl.getClass().getName());
}
}
