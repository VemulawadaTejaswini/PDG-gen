//25
public class func{
public void multiple_implementations_only_one_useful(){
        IOUtil.writeText("   ", f1); IOUtil.writeText("X", f2);
        assertEquals("X", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
