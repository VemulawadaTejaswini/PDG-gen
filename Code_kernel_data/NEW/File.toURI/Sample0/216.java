//215
public class func{
	public void shouldProvideShortJarPathUrlContentAsString(){
                containsString("urls=" + classLoader.asShortPaths(new File("one.jar").toURI().toURL(), new File("/target/classes").toURI().toURL())));
}
}
