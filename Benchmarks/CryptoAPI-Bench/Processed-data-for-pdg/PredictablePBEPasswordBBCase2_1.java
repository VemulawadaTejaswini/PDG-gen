public class Dummy {
    private PBEKeySpec pbeKeySpec = null;
    private PBEParameterSpec pbeParamSpec = null;
    public static void main(String [] args){
        Dummy ckp = new Dummy();
        ckp.key();
    }
    public void key() {
        char [] defaultKey = {'s'};
        byte [] salt = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        int iterationCount = 11010;
        int keyLength = 16;
        pbeKeySpec = new PBEKeySpec(defaultKey,salt,iterationCount,keyLength);
    }
}
