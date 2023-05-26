public class func{
public void findMarkers(final ClassLoader contextClassLoader){
        for (final String s : asList("org.junit.Test", "org.testng.annotations.Test")) {
            try {
                testMarkers.add((Class<? extends Annotation>) contextClassLoader.loadClass(s));
            } catch (final Throwable e) {
            }
        }
}
}
