//18
public class func{
	public void toUrl(Collection<File> cp){
        final URL[] urls = new URL[cp.size()];
        for (File file : cp) {
            urls[i++] = file.toURI().toURL();
        }
}
}
