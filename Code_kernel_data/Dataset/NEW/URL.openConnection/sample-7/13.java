//13
public class func{
public void test_getAttributes(){
        URL u = copyAndOpenResourceStream("lf.jar", "swt.dll");
        juc = (JarURLConnection) u.openConnection();
        java.util.jar.Attributes a = juc.getJarEntry().getAttributes();
}
}
