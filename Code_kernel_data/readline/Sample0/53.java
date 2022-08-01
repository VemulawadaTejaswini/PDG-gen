//52
public class func{
	public void assertFileContent(final InputStream stream){
        final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        final String line = reader.readLine();
        assertEquals(line, TEST_MESSAGE);
        reader.close();
}
}
