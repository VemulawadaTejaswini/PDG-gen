public class func{
public void setupClasspath(){
            final SystemClassPath systemCP = new SystemClassPath();
            systemCP.addJarsToPath(lib);
            systemCP.addJarToPath(lib.toURI().toURL());
}
}
