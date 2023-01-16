//281
public class func{
	public void test_JarInputStream_Integrate_Jar_getNextEntry(){
        String intJarName = Support_Resources.getURL("Integrate.jar");
        InputStream is = new URL(intJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
}
}
