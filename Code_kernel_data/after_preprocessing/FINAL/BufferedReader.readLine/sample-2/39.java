public class func{
public void assertReaders(final BufferedReader expected,final BufferedReader actual){
            final String actualLine = actual.readLine();
            Assert.assertNotNull("Expected had more lines than the actual.", actualLine);
            Assert.assertEquals(expectedLine, actualLine);
        Assert.assertNull("Actual had more lines than the expected.", actual.readLine());
}
}
