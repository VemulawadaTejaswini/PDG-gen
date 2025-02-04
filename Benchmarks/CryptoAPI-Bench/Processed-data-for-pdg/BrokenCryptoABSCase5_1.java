public class Dummy {
    Crypto6 crypto;
    public Dummy() throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {
        crypto = new Crypto6("IDEA");
        crypto.encrypt("abc","");
    }
}
class Crypto6 {
    Cipher cipher;
    String defaultAlgo;
    public Crypto6(String defAlgo) throws NoSuchPaddingException, NoSuchAlgorithmException {
        defaultAlgo = defAlgo;
    }
    public byte[] encrypt(String txt, String passedAlgo) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException {
        if(passedAlgo.isEmpty()){
            passedAlgo = defaultAlgo;
        }
        KeyGenerator keyGen = KeyGenerator.getInstance(defaultAlgo);
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance(defaultAlgo);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] txtBytes = txt.getBytes();
        return cipher.doFinal(txtBytes);
    }
}
