//376
public class func{
	public void checkWsdl(URL wsdlURL,String host){
        HttpURLConnection connection = (HttpURLConnection) wsdlURL.openConnection();
            connection.connect();
            Assert.assertEquals(200, connection.getResponseCode());
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      while ((line = in.readLine()) != null) {
        if (line.contains("address location")) {
          Assert.assertTrue(line.contains(host));
          return;
        }
      }
}
}
