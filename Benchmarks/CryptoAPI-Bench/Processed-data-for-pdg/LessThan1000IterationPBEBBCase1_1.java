public class Dummy {
    public static void main(){
        Dummy lt = new Dummy();
        lt.key2();
    }
    public void key2(){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 20;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
