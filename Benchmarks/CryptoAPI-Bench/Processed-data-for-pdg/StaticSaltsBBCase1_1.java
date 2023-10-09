public class Dummy {
    public static void main (String [] args){
        Dummy cs = new Dummy();
        cs.key2();
    }
    public void key2(){
        PBEParameterSpec pbeParamSpec = null;
        byte[] salt = {(byte) 0xa2};
        int count = 1020;
        pbeParamSpec = new PBEParameterSpec(salt, count);
    }
}
