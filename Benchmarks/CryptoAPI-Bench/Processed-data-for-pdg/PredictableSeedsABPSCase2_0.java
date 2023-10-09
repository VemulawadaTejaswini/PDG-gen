public class Dummy {
    public static void main (String [] args){
        SecureRandom sr2 = new SecureRandom();
        int choice=2;
        byte [] seed = {(byte) 100, (byte) 200};
        if(choice>1)
            sr2.nextBytes(seed);
        SecureRandom sr = new SecureRandom(seed);
        int v = sr.nextInt();
        System.out.println(v);
    }
}
