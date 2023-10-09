public class Dummy {
    public void go(int keySize) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        kgp.initialize(keySize);
        KeyPair kp = kgp.generateKeyPair();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, kp.getPublic());
        String myMessage = new String("Secret Message");
        SealedObject encryptedMessage = new SealedObject(myMessage,cipher);
        Cipher dec = Cipher.getInstance("RSA");
        dec.init(Cipher.DECRYPT_MODE, kp.getPrivate());
        String message = (String) encryptedMessage.getObject(dec);
        System.out.println(message);
    }
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        Dummy bc = new Dummy();
        int keySize = 1024;
        bc.go(keySize);
    }
}
