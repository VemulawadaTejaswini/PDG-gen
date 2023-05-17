//61
public class func{
public void testUnmarshalStreamSourceURLJSON(){
        File file = new File(ClassLoader.getSystemResource(JSON_RESOURCE).getFile());
        String systemId = file.toURI().toURL().toExternalForm();
        StreamSource ss = new StreamSource(systemId);
        Object testObject = jaxbUnmarshaller.unmarshal(ss);
        jsonToObjectTest(testObject);
}
}
