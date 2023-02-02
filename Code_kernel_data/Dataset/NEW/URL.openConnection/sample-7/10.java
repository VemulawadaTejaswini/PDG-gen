//10
public class func{
public void getJARFile(String resourceName){
        URL resourceURL = Thread.currentThread().getContextClassLoader().getResource(resourceName);
        JarURLConnection connection = (JarURLConnection) resourceURL.openConnection();
        URL jarURL = connection.getJarFileURL();
            file = new File(jarURL.toURI());
            file = new File(jarURL.getPath());
}
}
