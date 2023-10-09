public class Dummy {
    public static void main (String [] args){
        byte [] seed = {(byte) 100, (byte) 200};
        method1(seed);
    }
    public static void method1(byte[] s) {
        byte [] seed2 = s;
        method2(seed2);
    }
    private static void method2(byte [] seed) {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
