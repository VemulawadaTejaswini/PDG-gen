public class Dummy {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        Dummy pkspac = new Dummy();
        String key = "changeit";
        pkspac.method1(key);
    }
    public void method1(String k) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String key2 = k;
        method2(key2);
    }
    public void method2(String key) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https:
        ks.load(cacerts.openStream(), key.toCharArray());
    }
}
