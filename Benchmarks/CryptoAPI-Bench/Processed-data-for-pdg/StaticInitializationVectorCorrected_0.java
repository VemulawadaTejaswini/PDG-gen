public class Dummy {
    public void go() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecureRandom sr = new SecureRandom();
        byte [] bytes = new byte[16];
        sr.nextBytes(bytes);
        IvParameterSpec ivSpec = new IvParameterSpec(bytes);
        cipher.init(Cipher.ENCRYPT_MODE,key,ivSpec);
    }
    public static void main (String [] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Dummy siv = new Dummy();
        siv.go();
    }
}
