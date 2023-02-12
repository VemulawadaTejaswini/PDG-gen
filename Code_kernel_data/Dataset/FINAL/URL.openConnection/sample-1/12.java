public class func{
public void checkSoapAddressLocation(String address){
        URL url = new URL(address + "?wsdl");
        URLConnection urlConn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        while (br.ready()) {
            String str = br.readLine();
            if (str.contains("soap:address") 
                && str.contains("location=" + "\"" + address + "\"")) {
                return  true;
            }
        }
}
}
