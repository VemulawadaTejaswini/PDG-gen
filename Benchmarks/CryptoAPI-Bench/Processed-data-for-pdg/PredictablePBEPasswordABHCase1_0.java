public class Dummy {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;
    public static void main(String [] args) throws UnsupportedEncodingException {
        Dummy ckp = new Dummy();
        SecureRandom random = new SecureRandom();
        String defaultKey = String.valueOf(random.ints());
        byte [] keyBytes = defaultKey.getBytes("UTF-8");
        ckp.key(keyBytes);
    }
    public void key(byte [] keyBytes) {
        byte [] salt = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        int iterationCount = 11010;
        int keyLength = 16;
        pbeKeySpec = new PBEKeySpec(new String(keyBytes).toCharArray(),salt,iterationCount,keyLength);
    }
}
