//37
public class func{
	public void connect(final Context context,String path,int maxLength,final WebSocketHandler<T> handler){
    PublicAddress publicAddress = context.get(PublicAddress.class);
    URI address = publicAddress.getAddress(context);
    URI httpPath = address.resolve(path);
      wsPath = new URI("ws", httpPath.getUserInfo(), httpPath.getHost(), httpPath.getPort(), httpPath.getPath(), httpPath.getQuery(), httpPath.getFragment());
}
}
