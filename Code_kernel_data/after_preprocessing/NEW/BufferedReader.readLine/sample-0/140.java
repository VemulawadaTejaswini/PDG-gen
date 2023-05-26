//140
public class func{
public void shouldWrapAStringAsAStream(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream1));
            String result = reader.readLine();
            assertEquals(STREAM_DATA1, result);
}
}
