public class Dummy implements X509TrustManager {
    private X509TrustManager trustManager;
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        trustManager.checkClientTrusted(x509Certificates,s);
    }
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
    }
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
