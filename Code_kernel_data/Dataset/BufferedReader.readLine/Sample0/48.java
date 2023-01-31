//47
public class func{
	public void verifyGzipFile(String filename,String msg){
    BufferedReader r = new BufferedReader(new InputStreamReader(
        new GZIPInputStream(new FileInputStream(filename))));
      String line = r.readLine();
      assertEquals("Got invalid line back from " + filename, msg, line);
      r.close();
}
}
