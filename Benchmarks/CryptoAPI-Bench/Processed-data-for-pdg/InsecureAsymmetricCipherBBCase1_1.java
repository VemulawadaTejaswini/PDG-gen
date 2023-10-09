public class Dummy {
    public void go() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException, ClassNotFoundException {
        KeyPairGenerator kgp = KeyPairGenerator.getInstance("RSA");
        int keysize = 1024;
        kgp.initialize(keysize);
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
        bc.go();
    }
}
