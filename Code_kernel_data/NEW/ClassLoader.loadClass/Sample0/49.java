//48
public class func{
	public void testDiffClassloaders(){
      Object key1 = cl1.loadClass(Key.class.getName()).getConstructor(String.class, Boolean.TYPE).newInstance("key1", false);
}
}
