//37
public class func{
public void isolate(String target){
        ClassLoader il = createIsolatedClassLoader();
        Class result = il.loadClass(target);
        assertEquals(result.getName(), target);
}
}
