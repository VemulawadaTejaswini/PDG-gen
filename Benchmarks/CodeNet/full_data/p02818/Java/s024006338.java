import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        
        System.out.print((K <= A ? A - K : 0) + " ");
        long kA = K - A < 0 ? 0 : K - A;
        System.out.println(kA <= B ? B - kA : 0);
    }
}
