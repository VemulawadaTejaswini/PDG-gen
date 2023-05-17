public class func{
public void testDiffClassloaders(){
      Object key2 = cl2.loadClass(Key.class.getName()).getConstructor(String.class, Boolean.TYPE).newInstance("key1", false);
}
}
