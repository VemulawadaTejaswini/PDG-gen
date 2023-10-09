public class Dummy {
    URL cacerts;
    public static void main(String args[]) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        Dummy pksp = new Dummy();
        int choice=2;
        pksp.go(choice);
    }
    public void go(int choice) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {
        String type = "JKS";
        KeyStore ks = KeyStore.getInstance(type);
        cacerts = new URL("https:
        String defaultKey = "changeit";
        if(choice>1){
            SecureRandom random = new SecureRandom();
            defaultKey = String.valueOf(random.ints());
        }
        ks.load(cacerts.openStream(), defaultKey.toCharArray());
    }
}
