public class func{
public void retrieveWsdlDocument(String hostname,String port){
        URL wsdlUrlLocalhost = new URL("http://" + hostname + ":" + port + "/SpringEndpoint?wsdl");
        URLConnection urlConnection = wsdlUrlLocalhost.openConnection();
        return StaxUtils.read(urlConnection.getInputStream());
}
}
