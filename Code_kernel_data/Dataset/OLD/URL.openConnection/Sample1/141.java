//140
public class func{
	public void openConnection(String url,String username,char[] password){
    URL urlObject = new URL(url);
    URLConnection conn = urlObject.openConnection();
    setAuthorization(conn, username, password);
    conn.setUseCaches(false);
    conn.setDoOutput(true);
    if (conn instanceof HttpsURLConnection) {
      HttpsURLConnection secureConn = (HttpsURLConnection) conn;
      secureConn.setSSLSocketFactory(SSL_CONTEXT.getSocketFactory());
      secureConn.setHostnameVerifier(HOSTNAME_VERIFIER);
    }
}
}
