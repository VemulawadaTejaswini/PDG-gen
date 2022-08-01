//62
public class func{
	public void testUnmarshalStreamSourceURLJSONWithClass(){
        File file = new File(ClassLoader.getSystemResource(JSON_RESOURCE).getFile());
        String systemId = file.toURI().toURL().toExternalForm();
        StreamSource ss = new StreamSource(systemId);
        JAXBElement jbe = jaxbUnmarshaller.unmarshal(ss, EmployeeCollection.class);
        jsonToObjectTest(jbe.getValue());
}
}
