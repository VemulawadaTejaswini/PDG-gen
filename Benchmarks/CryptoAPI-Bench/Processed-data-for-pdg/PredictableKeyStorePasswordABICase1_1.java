public class Dummy {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        Dummy pksp = new Dummy();
        String key = "changeit";
        pksp.go(key);
    }
    public void go(String key) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https:
        ks.load(cacerts.openStream(), key.toCharArray());
    }
}
