public class A{
	public static Properties getPropertiesFromConfigFile(String configFileKey) {
		final Properties props = new Properties();
		try {
			final InputStream configFileStream = getResourceFile(configFileKey).toURI().toURL().openStream();
			props.loadFromXML(configFileStream);
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}