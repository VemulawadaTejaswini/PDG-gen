//127
public class func{
	public void assertReaders(final BufferedReader expected,final BufferedReader actual){
        while ((expectedLine = expected.readLine()) != null) {
            final String actualLine = actual.readLine();
            Assert.assertNotNull("Expected had more lines than the actual.", actualLine);
            Assert.assertEquals(expectedLine, actualLine);
        }
}
}
