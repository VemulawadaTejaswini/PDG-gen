public class func{
public void modificationTimeWithFileProtocol(){
    final String path = new File(tmpDir).toURI().toString() + "/file.txt";
    fs.createTextFile(path, "blah");
    final long millisSinceModified = System.currentTimeMillis() - fs.modificationTime(path);
    assertEquals(millisSinceModified + " millis ago", true, millisSinceModified < 1000);
}
}
