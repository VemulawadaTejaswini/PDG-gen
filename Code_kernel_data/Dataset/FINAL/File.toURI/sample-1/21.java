public class func{
public void multiple_implementations_only_one_useful(){
        assertEquals("X", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
