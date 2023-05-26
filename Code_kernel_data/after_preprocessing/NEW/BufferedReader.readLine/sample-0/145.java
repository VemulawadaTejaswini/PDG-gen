//145
public class func{
public void shouldMergeMultipleInputStreams(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(combinedStream));
            String result = reader.readLine();
            assertEquals(STREAM_DATA1 + STREAM_DATA2 + STREAM_DATA3, result);
}
}
