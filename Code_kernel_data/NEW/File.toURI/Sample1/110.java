//109
public class func{
	public void ModuleArtifactRepository(IProvisioningAgent agent,File location,ModuleArtifactMap artifactsMap){
        super(agent, location.toURI(), ArtifactTransferPolicies.forLocalArtifacts());
}
}
