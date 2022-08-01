//39
public class func{
	public void doLargeReadSize(BaseClient client){
    BufferedReader reader = new BufferedReader(new InputStreamReader(client.forRead(new Path(testFile1.getCanonicalPath()), 1024 * 1024)));
    while (reader.read() != -1) {
      count++;
    }
    reader.close();
}
}
