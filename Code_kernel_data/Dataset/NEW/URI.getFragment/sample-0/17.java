//17
public class func{
public void decodeHarURI(URI rawURI,Configuration conf){
      URI baseUri = new URI(authority.replaceFirst("-", "://"));
      tmp = new URI(baseUri.getScheme(), baseUri.getAuthority(),
            rawURI.getPath(), rawURI.getQuery(), rawURI.getFragment());
      throw new IOException("URI: " + rawURI
          + " is an invalid Har URI. Expecting har://<scheme>-<host>/<path>.");
}
}
