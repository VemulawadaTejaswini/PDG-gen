//105
public class func{
	public void getUrlForFile(File file){
      IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.toURI());
}
}
