//5
public class func{
public void testUnsafeWhenNotExists(){
    Class<?> testerClass = cl.loadClass(Tester.class.getName());
    testerClass.getDeclaredMethod("checkUnsafe").invoke(testerClass.newInstance());
}
}
