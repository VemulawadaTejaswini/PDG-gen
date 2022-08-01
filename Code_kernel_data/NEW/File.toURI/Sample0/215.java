//214
public class func{
	public void shouldProvideShortJarPathUrlContentAsString(){
        assertThat(classLoader.toString(),
                containsString("urls=" + classLoader.asShortPaths(new File("one.jar").toURI().toURL(), new File("/target/classes").toURI().toURL())));
}
}
