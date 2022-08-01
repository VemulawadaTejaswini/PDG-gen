//59
public class func{
	public void loadMetadata(File file){
        parser.setXmlInputPath(file.toPath());
        parser.setXmlInputRootPath(file.getParentFile().toPath());
        TechnologyMetadata metadata = parser.processDocument(file.toURI());
        metadataList.add(metadata);
}
}
