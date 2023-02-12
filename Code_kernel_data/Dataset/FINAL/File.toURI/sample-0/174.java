public class func{
public void testURI(){
    String expectedUri = new File(new File(File.separator + "testDir"), "testFile").toURI().toString();
}
}
