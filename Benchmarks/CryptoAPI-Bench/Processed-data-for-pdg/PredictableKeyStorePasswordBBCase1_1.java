public class Dummy {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        Dummy pksp = new Dummy();
        pksp.go();
    }
    public void go() throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https:
        String defaultKey = "changeit";
        ks.load(cacerts.openStream(), defaultKey.toCharArray());
    }
}
