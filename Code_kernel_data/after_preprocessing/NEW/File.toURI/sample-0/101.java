//101
public class func{
public void getServicePortFromWSDL(String wsdlFileName){
        File wsdlFile = new File(System.getProperty("jbossas.ts.submodule.dir") + "/src/test/java/org/jboss/as/test/integration/ws/wsa/" + wsdlFileName);
        URL wsdlURL = wsdlFile.toURI().toURL();
        Service service = Service.create(wsdlURL, serviceName);
        ServiceIface proxy = (ServiceIface) service.getPort(ServiceIface.class);
        BindingProvider bp = (BindingProvider) proxy;
}
}
