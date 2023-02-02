//148
public class func{
public void createLocalRepository(File localRepository){
        return new MavenArtifactRepository( DEFAULT_LOCAL_REPO_ID, "file://" + localRepository.toURI().getPath(),
                                            new DefaultRepositoryLayout(), new ArtifactRepositoryPolicy(),
                                            new ArtifactRepositoryPolicy() );
}
}
