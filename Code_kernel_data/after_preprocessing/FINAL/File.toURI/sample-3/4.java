public class func{
public void no_valid_impl(){
        File f = tmp.newFile();
        IOUtil.writeText("  \n  ", f);
        assertNull(finder.findPluginClass((Iterable) asList(f.toURI().toURL())));
}
}
