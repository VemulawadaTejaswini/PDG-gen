//17
public class func{
	public void paxConfig(){
        return new DefaultCompositeOption(
                SlingPaxOptions.defaultLaunchpadOptions(launchpadVersion),
                CoreOptions.provision(CoreOptions.bundle(thisProjectsBundle.toURI().toString()))
                
        ).getOptions();
}
}
