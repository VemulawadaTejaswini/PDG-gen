//26
public class func{
	public void doGetScriptSource(URI scriptUri){
        URI remoteUri = remoteClient.getRemoteURI().resolve(URL_PATH_PREFIX + path);
        String replacementScheme = SecurityUtil.isTransportSecure(remoteUri.getScheme()) ? "https" : "http";
            remoteUri = new URI(replacementScheme, remoteUri.getAuthority(), remoteUri.getPath(), remoteUri.getQuery(), remoteUri.getFragment());
            LOG.error("Failed to copy the RHQ server download URI: " + remoteUri + " to the " + replacementScheme + " scheme.");
            URL downloadUrl = remoteUri.toURL();
            return new InputStreamReader(downloadUrl.openStream());
            LOG.debug("Failed to download the script from the RHQ server using URL: " + remoteUri, e);
            LOG.debug("Failed to download the script from the RHQ server using URL: " + remoteUri, e);
}
}
