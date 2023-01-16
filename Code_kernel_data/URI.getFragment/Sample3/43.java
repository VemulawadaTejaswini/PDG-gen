//42
public class func{
	public void toException(URI uri,IOException e){
    return new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, NLS.bind(
        "Download of {0} failed: {1}", uri.getFragment(), message), e));
}
}
