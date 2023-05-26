public class func{
public void checkWsdl(URL wsdlURL){
        HttpURLConnection connection = (HttpURLConnection) wsdlURL.openConnection();
            connection.connect();
            Assert.assertEquals(proxyUsed.toString(), HttpServletResponse.SC_OK, connection.getResponseCode());
}
}
