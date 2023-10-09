public class Dummy {
    public static void main(String [] args){
        Dummy cs = new Dummy();
        byte[] salt = {(byte) 0xa2};
        int count = 1020;
        cs.key2(salt,count);
    }
    public void key2(byte[] salt, int count){
        PBEParameterSpec pbeParamSpec = null;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
