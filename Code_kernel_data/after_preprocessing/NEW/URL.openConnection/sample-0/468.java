//468
public class func{
public void initConnection(HttpRequest request){
      URL url = request.getEndpoint().toURL();
      HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxyForURI.apply(request.getEndpoint()));
      if (connection instanceof HttpsURLConnection) {
         HttpsURLConnection sslCon = (HttpsURLConnection) connection;
         if (utils.relaxHostname())
            sslCon.setHostnameVerifier(verifier);
         if (sslContextSupplier != null) {
             // used for providers which e.g. use certs for authentication (like FGCP)
             // Provider provides SSLContext impl (which inits context with key manager)
             sslCon.setSSLSocketFactory(sslContextSupplier.get().getSocketFactory());
         } else if (utils.trustAllCerts()) {
             sslCon.setSSLSocketFactory(untrustedSSLContextProvider.get().getSocketFactory());
         }
      }
}
}
