//241
public class func{
	public void test_getJarFileURL(){
        URL u = createContent("lf.jar", "plus.bmp");
        URL fileURL = new URL(u.getPath().substring(0, u.getPath().indexOf("!")));
        juc = (JarURLConnection) u.openConnection();
        assertTrue("Returned incorrect file URL", juc.getJarFileURL().equals(
                fileURL));
}
}
