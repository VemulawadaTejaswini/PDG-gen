//217
public class func{
public void getConfigurationDataURI(){
    File configurationFile = new File(_keyStoreDirectory, _configurationFileName); 
    return configurationFile.toURI();
}
}
