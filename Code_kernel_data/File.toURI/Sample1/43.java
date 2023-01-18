//42
public class func{
	public void loadPropertiesOrFail(File configFile){
            URL configPropURL = configFile.toURI().toURL();
            return loadPropertiesFile(configPropURL, true);
            throw new RuntimeException("Error loading properties from " + configFile, e);
}
}
