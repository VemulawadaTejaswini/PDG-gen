public class Dummy {
    Crypto crypto;
    public Dummy() throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        String passKey = Dummy.getKey("pass.key");
        if(passKey == null) {
            byte defaultKey[] = {20,10,30,5,5,6,8,7};
            crypto = new Crypto(defaultKey);
        }
        else {
            crypto = new Crypto(passKey.getBytes("UTF-8"));
        }
    }
    byte[] encryptPass(String pass, String src) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException {
        String keyStr = Dummy.getKey(src);
        return crypto.method1(pass, keyStr.getBytes("UTF-8"));
    }
    public static String getKey(String s) {
        return System.getProperty(s);
    }
}
class Crypto {
    Cipher cipher;
    String algoSpec = "AES/CBC/PKCS5Padding";
    String algo = "AES";
    byte [] defaultKey;
    public Crypto(byte [] defkey) throws NoSuchPaddingException, NoSuchAlgorithmException {
        cipher = Cipher.getInstance(algoSpec);
        defaultKey = defkey;
    }
    public byte[] method1(String txt, byte [] key) throws UnsupportedEncodingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        if(key == null){
            key = defaultKey;
        }
        byte[] keyBytes = key;
        byte [] txtBytes = txt.getBytes();
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes,algo);
        cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        return cipher.doFinal(txtBytes);
    }
}
