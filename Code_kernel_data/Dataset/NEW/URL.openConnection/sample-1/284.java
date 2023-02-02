//284
public class func{
public void test_JarInputStream_Modified_Manifest_MainAttributes_getNextEntry(){
        String modJarName = Support_Resources.getURL("Modified_Manifest_MainAttributes.jar");
        InputStream is = new URL(modJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
        assertEquals("META-INF/TESTROOT.SF", jin.getNextEntry().getName());
        assertEquals("META-INF/TESTROOT.DSA", jin.getNextEntry().getName());
            jin.getNextEntry();
        assertEquals("META-INF/", jin.getNextEntry().getName());
        assertEquals("Test.class", jin.getNextEntry().getName());
        assertNull(jin.getNextEntry());
        jin.close();
}
}
