//143
public class func{
	public void loadDescriptorsFromRepository(String repository,P2Context p2Context){
        IArtifactRepository loadedRepo = repoManager.loadRepository(repoPath.toURI(), new NullProgressMonitor());
        return loadedRepo.getArtifactDescriptors(DEFAULT_KEY);
}
}
