//63
public class func{
	public void getRelativePath(final File file,final File folder){
        return folder.toURI ().relativize ( file.toURI () ).getPath ();
}
}
