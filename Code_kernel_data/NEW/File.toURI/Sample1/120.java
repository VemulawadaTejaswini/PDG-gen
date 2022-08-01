//119
public class func{
	public void getBaseTestFolder(final FileSystemManager manager){
        final File baseDir = AbstractVfsTestCase.getTestDirectory();
        return manager.resolveFile(baseDir.toURI().toURL().toExternalForm());
}
}
