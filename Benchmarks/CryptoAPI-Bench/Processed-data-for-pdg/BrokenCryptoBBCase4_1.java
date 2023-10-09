public class Dummy {
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance("RC2");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("RC2");
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Dummy bc = new Dummy();
        bc.go();
    }
}
