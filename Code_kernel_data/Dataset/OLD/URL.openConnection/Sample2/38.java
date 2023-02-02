//37
public class func{
	public void getLastModified(URI location,IProgressMonitor monitor){
      URL url = location.toURL();
        return url.openConnection().getLastModified();
}
}
