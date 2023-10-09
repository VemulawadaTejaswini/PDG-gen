public class Dummy {
    public static final String DEFAULT_ENCRYPT_KEY = "changeit";
    private static char[] ENCRYPT_KEY;
    private static char[] encryptKey;
    URL cacerts;
    public static void main(String [] args) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        Dummy pksp = new Dummy();
        go2();
        go3();
        pksp.go();
    }
    private static void go2(){
        ENCRYPT_KEY = DEFAULT_ENCRYPT_KEY.toCharArray();
    }
    private static void go3(){
        encryptKey = ENCRYPT_KEY;
    }
    private void go() throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https:
        ks.load(cacerts.openStream(), encryptKey);
    }
}
