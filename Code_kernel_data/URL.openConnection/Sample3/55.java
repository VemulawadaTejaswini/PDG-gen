//54
public class func{
	public void lastModified(final String documentPath){
    final URL url = getBundle().getEntry(documentPath);
    if (url != null) {
      lastModified = url.openConnection().getLastModified();
    }
}
}
