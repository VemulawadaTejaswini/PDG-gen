//272
public class func{
public void openHTMLFile(){
        String cts = System.getProperty("java.io.tmpdir");
        File tmpDir = new File(cts);
        Support_Resources.copyFile(tmpDir, null, "hyts_htmltest.html");
        URL fUrl1 = new URL("file:/" + tmpDir.getPath()
                + "/hyts_htmltest.html");
        URLConnection con1 = fUrl1.openConnection();
}
}
