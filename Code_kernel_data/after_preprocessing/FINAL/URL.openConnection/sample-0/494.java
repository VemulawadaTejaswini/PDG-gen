public class func{
public void getJsonRpcConnection(URL url,String request,String auth){
    return getJsonRpcConnection((HttpURLConnection) url.openConnection(), request, auth);
}
}
