public class func{
public void testBindingFormatStringURL(){
        File file = new File(INPUT_SRC_OXM_XML);
        URL url = file.toURI().toURL();
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, url.toExternalForm());
        JAXBContext jCtx = (JAXBContext) JAXBContextFactory.createContext(classes, properties, loader);
        doTestInputSrc(jCtx);
}
}
