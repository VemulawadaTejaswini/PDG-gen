public class func{
public void validateKnownStarCertificate(String url,String info){
        URL destinationURL = new URL(url);
        HttpsURLConnection sslConnection = (HttpsURLConnection) destinationURL.openConnection();
        sslConnection.connect();
        Certificate[] sslCertificates = sslConnection.getServerCertificates();
        for (Certificate c : sslCertificates) {
            assertTrue(c instanceof X509Certificate);
            X509Certificate cert = (X509Certificate) c;
            System.out.println(cert.getSubjectDN().getName());
            cert.checkValidity();
        }
}
}
