//107
public class func{
	public void setConfiguration(final File newConfigFile){
        setConfiguration(newConfigFile.toURI(), Files.toByteArray(newConfigFile));
}
}
