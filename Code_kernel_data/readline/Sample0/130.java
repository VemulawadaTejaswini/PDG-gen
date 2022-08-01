//129
public class func{
	public void shouldHandleNullStreams3(){
            InputStream stream = InputStreamMerger.merge(stream1, stream2, null);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String result = reader.readLine();
            assertEquals(expected, result);
}
}
