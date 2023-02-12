public class func{
public void prepareDistributionUri(){
            return new File(propertiesFile.getParentFile(), source.getSchemeSpecificPart()).toURI();
}
}
