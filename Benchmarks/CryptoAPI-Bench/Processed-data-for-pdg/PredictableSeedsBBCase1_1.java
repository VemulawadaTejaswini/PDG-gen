public class Dummy {
    public static void main (String [] args){
        SecureRandom sr = new SecureRandom();
        byte [] keyBytes = {(byte) 100, (byte) 200};
        sr.setSeed(keyBytes);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
