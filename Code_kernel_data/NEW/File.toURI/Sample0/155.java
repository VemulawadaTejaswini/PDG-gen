//154
public class func{
	public void testUseOSLastModified(){
        File input = new File("src/test/resources/reader/datefallbacksample.xml");
        final URL testdata = input.toURI().toURL();
        reader.parse(testdata, creator);
}
}
