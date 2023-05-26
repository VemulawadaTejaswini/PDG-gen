//84
public class func{
public void resourcesInDirectory(){
        URLClassLoader classLoader = new URLClassLoader(new URL[] { new File("src/test/resources/classpath-scanner/classes/").toURI().toURL() });
}
}
