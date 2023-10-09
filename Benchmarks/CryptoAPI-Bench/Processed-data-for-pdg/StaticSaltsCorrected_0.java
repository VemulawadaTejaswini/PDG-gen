public class Dummy {
    public static void main(String [] args){
        Dummy cs = new Dummy();
        cs.key2();
    }
    public void key2(){
        SecureRandom random = new SecureRandom();
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = new byte[32];
        random.nextBytes(salt);
        int count = 1020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
