public class A{
	public static void initModelProperties() {
		Properties properties = new Properties();
		properties.setProperty("accessKeyId", "");
		properties.setProperty("secretAccessKey", "");
		properties.setProperty("password", "");
		try {
			InputStream propertiesInputStream = new FileInputStream(ModelProperties.propertiesFile);
			properties.loadFromXML(propertiesInputStream);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		ModelProperties.modelProperties = new ModelProperties(properties);
		ModelProperties.modelProperties.saveToFile();
	}
}