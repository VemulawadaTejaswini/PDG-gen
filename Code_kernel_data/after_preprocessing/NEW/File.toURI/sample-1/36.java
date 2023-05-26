//36
public class func{
public void findAndLoadHostSpecificProperties(){
                CssResourceLocator.locateSiteSpecificResource(HOST_PROPERTIES_FILE_NAME);
            final URL resource = configFile.toURI().toURL();
            openStreamAndLoadProps(resource);
}
}
