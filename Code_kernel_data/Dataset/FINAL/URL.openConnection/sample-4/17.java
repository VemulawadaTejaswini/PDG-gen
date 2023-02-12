public class func{
public void openConnection(URL url){
            URLConnection con = url.openConnection();
            if ("HTTPS".equalsIgnoreCase(url.getProtocol())) {
                HttpsURLConnection scon = (HttpsURLConnection) con;
                try {
                    scon.setSSLSocketFactory(SSLUtil.getSSLSocketFactory(ks, password, alias));
                    scon.setHostnameVerifier(SSLUtil.getHostnameVerifier(SSLUtil.HOSTCERT_MIN_CHECK));
                } catch (GeneralException e) {
                    throw new IOException(e.getMessage());
                } catch (GeneralSecurityException e) {
                    throw new IOException(e.getMessage());
                }
            }
}
}
