//108
public class func{
	public void ModuleMetadataRepository(IProvisioningAgent agent,File location){
        super(agent, generateName(location), REPOSITORY_TYPE, location);
        setLocation(location.toURI());
        this.storage = getStorageFile(location);
}
}
