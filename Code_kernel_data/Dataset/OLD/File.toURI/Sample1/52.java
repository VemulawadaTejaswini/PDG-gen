//51
public class func{
	public void createRepository(File location){
        TychoRepositoryIndex metadataIndex = createMetadataIndex(location);
        return new LocalMetadataRepository(location.toURI(), metadataIndex);
}
}
