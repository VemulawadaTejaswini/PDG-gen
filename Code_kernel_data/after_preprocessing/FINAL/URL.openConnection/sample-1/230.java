public class func{
public void openJarURLConnection(){
        String cts = System.getProperty("java.io.tmpdir");
        File tmpDir = new File(cts);
        Support_Resources.copyFile(tmpDir, null, "hyts_att.jar");
        URL fUrl1 = new URL("jar:file:" + tmpDir.getPath()
                + "/hyts_att.jar!/");
        JarURLConnection con1 = (JarURLConnection) fUrl1.openConnection();
}
}
