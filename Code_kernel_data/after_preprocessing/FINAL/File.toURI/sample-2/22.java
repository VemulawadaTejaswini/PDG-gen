public class func{
public void addURLs(Classpath cp){
        for (final File file : cp) {
            try {
                addURL(file.toURI().toURL());
            } catch (final MalformedURLException e) {
            }
        }
}
}
