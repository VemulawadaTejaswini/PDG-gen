//53
public class func{
public void manifestClasspath(final File[] sourceDirectory,final File outputDirectory,final List<String> compileClasspathElements){
    for (String classpathElement : compileClasspathElements) {
      cp = cp + new File(classpathElement).toURI() + " ";
    }
    cp = cp.replaceAll("\\s+", "\\ ");
}
}
