//79
public class func{
	public void testGetIndex(){
      BufferedReader remoteFile = synchronizer.getRemoteFile("index.org");
      String firstLine = remoteFile.readLine();
      assertEquals("#+READONLY", firstLine);
      fail("Couldn't get index.org");
}
}
