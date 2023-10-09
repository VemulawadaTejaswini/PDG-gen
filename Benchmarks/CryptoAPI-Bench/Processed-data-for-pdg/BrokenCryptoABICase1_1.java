public class Dummy {
    public void go(String crypto, String keyAlgo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyGenerator keyGen = KeyGenerator.getInstance(keyAlgo);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(crypto);
        cipher.init(Cipher.ENCRYPT_MODE, key);
    }
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Dummy bc = new Dummy();
        String crypto = "DES/ECB/PKCS5Padding";
        String keyAlgo = "DES";
        bc.go(crypto,keyAlgo);
    }
}
