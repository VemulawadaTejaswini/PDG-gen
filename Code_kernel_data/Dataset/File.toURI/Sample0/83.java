//82
public class func{
	public void getAnnotationSearchClassLoader(){
        return new URLClassLoader( new URL[] { new File( getProject().getBuild().getOutputDirectory() ).toURI().toURL() } );
}
}
