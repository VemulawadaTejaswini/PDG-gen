//35
public class func{
	public void toRelativeFilePath(File file,File ancestor){
    URI ancestorUri = ancestor.toURI();
    URI relativeUri = ancestorUri.relativize(fileUri);
    return relativeUri.getPath();
}
}
