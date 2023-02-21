public class A{
	public void testLoadXmlProperties() throws InvalidPropertiesFormatException, IOException {
		Properties props = new Properties();
		
		Reader reader = new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +"<properties>\n" +"<comment>Hi</comment>\n" +"<entry key=\"foo\">1</entry>\n" +"<entry key=\"fu\">baz</entry>\n" +"</properties>");
		InputStream stream = new ReaderInputStream(reader );
		props.loadFromXML(stream);
		assertEquals("1", props.get("foo"));
	}
}