//124
public class func{
	public void createArchive(){
        archiveOutputUtil.setCompressionLevel(getCompressionLevel());
        final Thread archiveCreation = new Thread(archiveOutputUtil);
        archiveCreation.start();
}
}
