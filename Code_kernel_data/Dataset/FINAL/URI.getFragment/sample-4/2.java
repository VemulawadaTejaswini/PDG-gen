public class func{
public void decodeHarURI(URI rawURI,Configuration conf){
    String tmpAuth = rawURI.getAuthority();
    if (tmpAuth == null) {
      return FileSystem.getDefaultUri(conf);
    }
    String host = rawURI.getHost();
    String[] str = host.split("-", 2);
    if (str[0] == null) {
      throw new IOException("URI: " + rawURI + " is an invalid Har URI.");
    }
    int underLyingPort = rawURI.getPort();
    String auth = (underLyingHost == null && underLyingPort == -1)?
                  null:(underLyingHost+":"+underLyingPort);
    if (rawURI.getQuery() != null) {
      throw new IOException("query component in Path not supported  " + rawURI);
    }
      tmp = new URI(underLyingScheme, auth, rawURI.getPath(),
            rawURI.getQuery(), rawURI.getFragment());
}
}
