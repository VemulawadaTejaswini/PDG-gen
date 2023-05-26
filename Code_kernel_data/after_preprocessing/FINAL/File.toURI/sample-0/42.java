public class func{
public void toUrls(final Set<String> strings){
        for (final String s : strings) {
            try {
                urls.add(new File(s).toURI().toURL());
            } catch (final MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
}
}
