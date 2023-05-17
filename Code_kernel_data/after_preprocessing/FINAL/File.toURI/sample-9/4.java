public class func{
public void addCustomProfileArg(EquinoxLaunchConfiguration cli){
            File profileFile = new File(new File(project.getBuild().getDirectory()), "custom.profile");
            storeProperties(customProfileProps, profileFile);
            cli.addVMArguments("-D" + EquinoxConfiguration.PROP_OSGI_JAVA_PROFILE + "=" + profileFile.toURI());
}
}
