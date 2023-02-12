public class func{
public void Client(String wsdl){
        if (wsdl != null) {
            wsdlLocation = wsdl;
        }
        File wsdlFile = new File(wsdlLocation);
        if (wsdlFile.exists()) {
            wsdlURL = wsdlFile.toURI().toURL();
        } else {
            wsdlURL = new URL(wsdlLocation);
        }
        soapService = new SOAPService(wsdlURL, SERVICE_NAME);
}
}
