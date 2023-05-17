//2
public class func{
public void createUrls(File[] files){
        for (File jar : files){
            try {
                urls.add(jar.toURI().toURL());
            } catch (MalformedURLException e) {
                LOGGER.warn("Unable to load a plugin from JAR", e);
            }
        }
}
}
