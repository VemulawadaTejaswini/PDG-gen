public class Dummy {
    public static void main (String [] args){
        byte [] seed = {(byte) 100, (byte) 200};
        go(seed);
    }
    private static void go(byte [] seed) {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
