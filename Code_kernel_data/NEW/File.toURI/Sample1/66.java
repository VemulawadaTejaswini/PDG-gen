//65
public class func{
	public void manifestClasspath(final File[] sourceDirectory,final File outputDirectory,final List<String> compileClasspathElements){
    String cp = getPath(sourceDirectory);
    cp = cp + outputDirectory.toURI() + " ";
}
}
