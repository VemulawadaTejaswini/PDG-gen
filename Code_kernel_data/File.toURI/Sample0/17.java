//16
public class func{
	public void getURLs(final String[] paths){
            for (final String path : paths) {
                try {
                    urls.add(new File(path).toURI().toURL());
                } catch (final MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
}
}
