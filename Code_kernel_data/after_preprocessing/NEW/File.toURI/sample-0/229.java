//229
public class func{
public void testHasProperties(){
        final URL url = new File(new File(DIRECTORY), "dummy.shp").toURI().toURL();
        parser = new ShpDocPropertyParser(url);
        assertFalse("Property file exist.", parser.hasProperties());
}
}
