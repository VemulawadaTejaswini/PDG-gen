//221
public class func{
	public void doGet(String url,Map<String,?> headers,String contentType,String charset,boolean binary){
        connection = new URL( url ).openConnection();
        connection.setConnectTimeout( DEFAULT_TIMEOUT_SECONDS * 1000 );
        manageContentTypeHeaders( contentType, charset, connection, binary );
        manageHeaders( headers, connection );
}
}
