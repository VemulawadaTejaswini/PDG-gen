//0
public class func{
	public void testClassManager_GetClassLoaderFromDirs(){
        ClassLoader cl = ClassManager.getClassLoaderFromDirs(
            new File[]{new File("./target/classes")},
            Thread.currentThread().getContextClassLoader()
        );
        Assert.assertNotNull(cl);
        Assert.assertNotNull(cl.loadClass("org.clamshellcli.core.Clamshell"));
}
}
