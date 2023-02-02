//90
public class func{
public void shouldHandleNullStreams1(){
            InputStream stream = InputStreamMerger.merge(null, stream2, stream3);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String result = reader.readLine();
            assertEquals(expected, result);
}
}
