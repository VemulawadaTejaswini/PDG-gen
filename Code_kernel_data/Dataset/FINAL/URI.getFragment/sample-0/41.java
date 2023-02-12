public class func{
public void connect(final ClientCallback<ClientConnection> listener,InetSocketAddress bindAddress,final URI uri,final XnioWorker worker,final XnioSsl ssl,final Pool<ByteBuffer> bufferPool,final OptionMap options){
            upgradeUri = new URI("http", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
