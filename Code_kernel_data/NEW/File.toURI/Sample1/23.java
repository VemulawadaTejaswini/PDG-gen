//22
public class func{
	public void multiple_implementations_only_one_enabled(){
        IOUtil.writeText("Foo", f1); IOUtil.writeText("Bar", f2);
        assertEquals("Bar", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
