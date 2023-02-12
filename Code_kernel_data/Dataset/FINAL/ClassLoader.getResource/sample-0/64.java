public class func{
public void getAllKnownExecutionEnvironments(){
        for (String profileFile : listProps.getProperty("java.profiles").split(",")) {
            Properties props = readProperties(loader.getResource(profileFile.trim()));
            String profileName = props.getProperty("osgi.java.profile.name");
            if (profileName == null) {
                throw new IllegalStateException("osgi.java.profile.name must not be null for profile " + profileFile);
            }
            result.add(profileName);
        }
}
}
