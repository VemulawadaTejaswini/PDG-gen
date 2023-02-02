//19
public class func{
public void testAmpHandling(){
        final BufferedReader reader = new BufferedReader(new XmlFixerReader(new StringReader(input)));
        final String output = reader.readLine();
        reader.close();
        assertEquals("&amp; &amp;aa &amp;", output);
}
}
