public class func{
public void authenticate(LegacySession session,String serverId,ProxyData proxy){
    URLConnection connection = wrappedProxy == null ? url.openConnection() : url.openConnection(wrappedProxy);
    connection.setConnectTimeout(30000);
    connection.setReadTimeout(30000);
}
}
