//32
public class func{
	public void getMessage(){
            sb.append(request.getMethod());
            sb.append(' ');
                final URI uri = request.getUri().toJavaNetURI();
                final String userInfo = uri.getUserInfo();
                if (userInfo != null) {
                    final Iterable<String> userSplitter = Splitter.on(':').trimResults().omitEmptyStrings().split(userInfo);
                    final Iterator<String> it = userSplitter.iterator();
                    if (it.hasNext()) {
                        username = it.next();
                    }
                }
                final URI cleanUri = new URI(uri.getScheme(), username, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                sb.append(cleanUri.toASCIIString());
                sb.append("invalid URL");
}
}
