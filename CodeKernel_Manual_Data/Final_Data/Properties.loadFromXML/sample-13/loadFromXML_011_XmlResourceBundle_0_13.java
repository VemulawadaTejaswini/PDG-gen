public class A{
	private static Properties loadFromXml(XmlResourceBundle xmlResourceBundle) throws IOException {
		
		InputStream stream = xmlResourceBundle.getClass().getResourceAsStream( getFileName(xmlResourceBundle) );
		Properties properties = new Properties();
		properties.loadFromXML( stream );
		stream.close();
		
		return properties;
	}
}