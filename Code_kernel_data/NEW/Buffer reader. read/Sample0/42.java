//41
public class func{
	public void doSmallReadSize(BaseClient client){
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(
            client.forRead(new Path(testFile1.getAbsolutePath()), 5)));
    while (reader.read() != -1) {
      count++;
    }
    reader.close();
}
}
