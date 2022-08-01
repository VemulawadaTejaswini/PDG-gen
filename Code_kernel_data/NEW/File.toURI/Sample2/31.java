//30
public class func{
	public void shouldFailIfResourceFileCouldNotBeFoundAsUrl(){
        assertThat(file.exists(), is(false));
        URL url = file.toURI().toURL();
        nodeTypeManager.registerNodeTypes(url, true);
}
}
