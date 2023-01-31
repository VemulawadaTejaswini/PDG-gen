//32
public class func{
	public void testFile(){
    File dir = jar.as(ExplodedExporter.class).exportExploded(f);
    assertFS(dir.toURI().toURL());
}
}
