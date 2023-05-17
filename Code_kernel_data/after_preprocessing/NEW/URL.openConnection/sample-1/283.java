//283
public class func{
public void test_Integrate_Jar_read(){
        String intJarName = Support_Resources.getURL("Integrate.jar");
        InputStream is = new URL(intJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
}
}
