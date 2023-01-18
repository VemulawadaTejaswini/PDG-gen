//327
public class func{
	public void call(Server server){
                    url = new URL("http://" + server.getHost() + ":" + server.getPort() + path);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    return Observable.just(conn.getResponseMessage());
                    return Observable.error(e);
}
}
