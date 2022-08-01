//206
public class func{
	public void createConnection(ClientRequest request){
      String uri = request.getUri();
      String httpMethod = request.getHttpMethod();
      HttpURLConnection connection = (HttpURLConnection) new URL(uri).openConnection();
      connection.setRequestMethod(httpMethod);
}
}
