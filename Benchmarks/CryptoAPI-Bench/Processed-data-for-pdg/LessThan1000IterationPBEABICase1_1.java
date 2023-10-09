public class Dummy {
    public static void main(){
        Dummy lt = new Dummy();
        int count = 20;
        lt.go(count);
    }
    public void go(int count){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
