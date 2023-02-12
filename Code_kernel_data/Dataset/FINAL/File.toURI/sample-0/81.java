public class func{
public void resourcesInJar(){
        URLClassLoader classLoader = new URLClassLoader(
            new URL[] { new File("src/test/resources/classpath-scanner/classpath-scanner.jar").toURI().toURL() });
}
}
