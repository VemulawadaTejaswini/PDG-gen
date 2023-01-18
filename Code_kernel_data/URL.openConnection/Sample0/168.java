//167
public class func{
	public void doPost(String request){
    URL url = new URL("http://localhost:8080/exist/rest" + XmldbURI.ROOT_COLLECTION);
    HttpURLConnection connect = (HttpURLConnection) url.openConnection();
    connect.setRequestMethod("POST");
    connect.setDoOutput(true);
    OutputStream os = connect.getOutputStream();
}
}
