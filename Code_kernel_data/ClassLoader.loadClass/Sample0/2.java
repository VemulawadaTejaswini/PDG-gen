//1
public class func{
	public void testClassManager_GetClassLoaderFromFiles(){
        ClassLoader cl = ClassManager.getClassLoaderFromFiles(
            new File[]{new File("../mock-env/plugins")}, 
            Pattern.compile(".*\\.jar"), 
            Thread.currentThread().getContextClassLoader());
        Assert.assertNotNull(cl);
        Assert.assertNotNull(cl.loadClass("org.clamshellcli.test.MockShell"));
}
}
